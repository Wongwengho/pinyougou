/** 定义控制器层 */
app.controller('goodsController', function($scope, $controller, baseService){

    /** 指定继承baseController */
    $controller('baseController',{$scope:$scope});


    /** 添加或修改 */
    $scope.saveOrUpdate = function(){
        // 获取富文本编辑器中的内容
        $scope.goods.goodsDesc.introduction = editor.html();


        /** 发送post请求 */
        baseService.sendPost("/goods/save", $scope.goods)
            .then(function(response){
                if (response.data){
                    /** 清空表单数据 */
                    $scope.goods = {};
                    // 清空富文本编辑器中的内容
                    editor.html('');
                }else{
                    alert("操作失败！");
                }
            });
    };

    // 定义文件上传
    $scope.uploadFile = function () {
        // 调用服务层上传文件
        baseService.uploadFile().then(function(response){
            // 获取响应数据 {status : 200, url : 'http://192.168.12.131/group1/xxx/xx/x.jpg'}
            if(response.data.status == 200){
                // 获取图片url $scope.picEntity : {url : '', color:''}
                $scope.picEntity.url = response.data.url;
            }else{
                alert("上传失败！");
            }
        });
    };


    // 定义数据格式
    $scope.goods = {goodsDesc: {itemImages : []}};

    // $scope.goods.goodsDesc.itemImages = [{color:'',url:''},{}];
    // 添加商品的单张图片到数组中
    $scope.addPic = function () {
        $scope.goods.goodsDesc.itemImages.push($scope.picEntity);
    };

    // 从数组中删除图片
    $scope.removePic = function (idx) {
        $scope.goods.goodsDesc.itemImages.splice(idx,1);
    };

    // 根据父级id查询商品分类
    $scope.findItemCatByParentId = function (parentId, name) {
        baseService.sendGet("/itemCat/findItemCatByParentId?parentId="
            +　parentId).then(function (response) {
            // 获取响应数据
            $scope[name] = response.data;
        });
    };


    // $scope.$watch: 它可以监控$scope中的变量发生改变，就会调用一个函数
    // $scope.$watch: 监控一级分类id,发生改变，查询二级分类
    $scope.$watch('goods.category1Id', function (newVal, oldVal) {
        //alert("新值：" + newVal + ",旧值:" + oldVal);
        if (newVal){ // 不是undefined、null
            // 查询二级分类
            $scope.findItemCatByParentId(newVal, "itemCatList2");
        }else {
            $scope.itemCatList2 = [];
        }
    });

    // $scope.$watch: 监控二级分类id,发生改变，查询三级分类
    $scope.$watch('goods.category2Id', function (newVal, oldVal) {
        //alert("新值：" + newVal + ",旧值:" + oldVal);
        if (newVal){ // 不是undefined、null
            // 查询三级分类
            $scope.findItemCatByParentId(newVal, "itemCatList3");
        }else {
            $scope.itemCatList3 = [];
        }

    });

    // $scope.$watch: 监控三级分类id,发生改变，查询类型模板id
    $scope.$watch('goods.category3Id', function (newVal, oldVal) {
        if (newVal){ // 不是undefined、null
            // 迭代三级分类数组
            for (var i = 0; i < $scope.itemCatList3.length; i++){
                var itemCat = $scope.itemCatList3[i];
                if (itemCat.id == newVal){
                    // 获取类型模板id
                    $scope.goods.typeTemplateId = itemCat.typeId;
                    break;
                }
            }
        }else {
            $scope.goods.typeTemplateId = null;
        }

    });

    // $scope.$watch: 监控类型模板id,发生改变，根据类型模板id，查询类型模板对象
    $scope.$watch('goods.typeTemplateId', function (newVal, oldVal) {
        if (newVal){ // 不是undefined、null
            baseService.sendGet("/typeTemplate/findOne?id=" + newVal).then(function(response){
                // 获取品牌数据{}
                $scope.brandIds = JSON.parse(response.data.brandIds);

                // 获取扩展属性
                $scope.goods.goodsDesc.customAttributeItems = JSON.
                parse(response.data.customAttributeItems);

            });
        }else {
            $scope.brandIds = [];
        }

    });

























    /** 查询条件对象 */
    $scope.searchEntity = {};
    /** 分页查询(查询条件) */
    $scope.search = function(page, rows){
        baseService.findByPage("/goods/findByPage", page,
            rows, $scope.searchEntity)
            .then(function(response){
                /** 获取分页查询结果 */
                $scope.dataList = response.data.rows;
                /** 更新分页总记录数 */
                $scope.paginationConf.totalItems = response.data.total;
            });
    };



    /** 显示修改 */
    $scope.show = function(entity){
        /** 把json对象转化成一个新的json对象 */
        $scope.entity = JSON.parse(JSON.stringify(entity));
    };

    /** 批量删除 */
    $scope.delete = function(){
        if ($scope.ids.length > 0){
            baseService.deleteById("/goods/delete", $scope.ids)
                .then(function(response){
                    if (response.data){
                        /** 重新加载数据 */
                        $scope.reload();
                    }else{
                        alert("删除失败！");
                    }
                });
        }else{
            alert("请选择要删除的记录！");
        }
    };
});