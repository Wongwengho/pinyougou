/** 定义控制器层 */
app.controller('itemCatController', function($scope, $controller, baseService){

    /** 指定继承baseController */
    $controller('baseController',{$scope:$scope});

    /** 根据父级id查询商品分类 */
    $scope.findItemCatByParentId = function (parentId) {
        baseService.sendGet("/itemCat/findItemCatByParentId?parentId="
            + parentId).then(function(response){
            // 获取响应数据
            $scope.dataList= response.data;
        });
    };

    /** 添加或修改 */
    $scope.saveOrUpdate = function(){
        var url = "save";
        if ($scope.entity.id){
            url = "update";
        }
        /** 发送post请求 */
        baseService.sendPost("/itemCat/" + url, $scope.entity)
            .then(function(response){
                if (response.data){
                    /** 重新加载数据 */
                    $scope.reload();
                }else{
                    alert("操作失败！");
                }
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
            baseService.deleteById("/itemCat/delete", $scope.ids)
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

    // 定义级别的变量
    $scope.grade;

    // 查询下级
    $scope.selectList = function (item, grade) {
        // 改变级别变量的值
        $scope.grade = grade;

        if (grade == 1){
            $scope.itemCat_1 = null;
            $scope.itemCat_2 = null;
        }
        // 记录一级分类
        if (grade == 2){
            $scope.itemCat_1 = item;
        }

        // 记录二级分类
        if (grade == 3){
            $scope.itemCat_2 = item;
        }

        // 调用查询方法
        $scope.findItemCatByParentId(item.id);
    }
});