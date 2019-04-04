/**定义基础控制器层*/
app.controller('baseController', function ($scope) {
    /**分页指令配置信息对象*/
    $scope.paginationConf = {
        currentPage: 1, //当前页码
        totalItems: 0, //总记录数
        itemsPerPage: 10, //每页显示的记录数
        perPageOptions: [10, 20, 30], //页码下拉列表框
        onChange: function () { //改变事件
            $scope.reload(); //重新加载
        }
    };

    /**当下拉列表页码发送改变,重新加载列表数据*/
    $scope.reload = function () {
        /**切换页码*/
        $scope.search($scope.paginationConf.currentPage,
            $scope.paginationConf.itemsPerPage);
    };

    /**定义选中的ids数组*/
    $scope.ids = [];
    /**为复选框绑定点击事件*/
    $scope.updateSelection = function ($event, id) {
        /**如果是被选中,则增加到数组*/
        if ($event.target.checked){
            $scope.ids.push(id);
        }else{
            var idx = $scope.ids.indexOf(id);
            /**删除数组中的元素*/
            $scope.ids.splice(idx,1);
        }
    };

    /** 提取数组中json某个属性，返回拼接的字符串(逗号分隔) */
    $scope.jsonArr2Str = function (jsonArrStr, key) {
        // 把json数组的字符串转化成json数组
        var jsonArr = JSON.parse(jsonArrStr);

        var resArr = [];
        // 循环数组
        for (var i = 0; i < jsonArr.length; i++){
            // json : {id : '', text: ''}
            var json = jsonArr[i];
            resArr.push(json[key]);
        }
        // join: 把数组元素用什么隔开，返回一个字符串
        return resArr.join(",");
    };
});