/**定义品牌控制层*/
app.controller('brandController', function ($scope,$controller, baseService) {
    // 品牌控制器继承基础控制器
    // 第一个$scope为 baseController
    // 第二个$scope为 brandController
    $controller('baseController',{$scope:$scope});

    /** 读取品牌数据绑定到表格中(不分页) */
    $scope.findAll = function(){
        /** 调用服务层查询所有品牌数据 */
        baseService.sendGet("/brand/findAll").then(function(response){
            $scope.dataList = response.data;
        });
    };

    /**定义搜索对象*/
    $scope.searchEntity = {};
    /**分页查询品牌信息*/
    $scope.search = function (page, rows) {
        /**发送异步请求分页查询品牌数据*/
        baseService.findByPage('/brand/findByPage',page,rows,
            $scope.searchEntity).then(function (response) {
            $scope.dataList = response.data.rows;
            /**更新总记录数*/
            $scope.paginationConf.totalItems = response.data.total;
        });
    };

    // 添加或修改品牌
    $scope.saveOrUpdate = function () {
        // 请求参数
        //alert(JSON.stringify($scope.entity));
        var url = "save"; // 添加URL
        // 判断id是否存在
        if ($scope.param.id){
            url = "update"; // 修改URL
        }

        // 发送异步请求
        baseService.sendPost("/brand/" + url, $scope.param).then(function(response){
            // 获取响应数据 true|false
            if (response.data){
                /**重新在家品牌数据*/
                $scope.reload();
            }else{
                alert("操作失败！");
            }
        });
    };

    /**显示修改*/
    $scope.show = function (entity) {
        // 把entity转化成json字符串
        var jsonStr = JSON.stringify(entity);
        // 把json字符串转化成json对象
        $scope.param = JSON.parse(jsonStr);
    };

    /**批量删除*/
    $scope.delete = function () {
        if ($scope.ids.length > 0){
            if (confirm("确定要删除吗?")) {
                //发送异步请求
                baseService.deleteById('/brand/delete',$scope.ids)
                    .then(function (response) {
                        //获取响应数据
                        if (response.data){
                            //重新加载列表数据
                            $scope.reload();
                            //清空ids数组
                            $scope.ids = [];
                        } else{
                            alert("删除失败!")
                        }
                    })
            }
        } else{
            alert("请选择要删除的品牌!");
        }
    };
});
