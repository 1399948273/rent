layui.config({
    base: $config.resUrl+'layuicms/common/js/'//定义基目录
}).extend({
    ajaxExtention: 'ajaxExtention',//加载自定义扩展，每个业务js都需要加载这个ajax扩展
    $tool: 'tool',
    $api:'api'
}).use(['form', 'layer','$api', 'tree', 'jquery', 'ajaxExtention', '$tool'], function () {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : parent.layer,
        laypage = layui.laypage,
        $ = layui.jquery,
        $tool = layui.$tool,
        $api = layui.$api;

    var username;
    var sex;
    var age;

    /**
     * 页面初始化
     * */
    function init() {
        //初始化用户信息
        initUserInfo();
    }

    init();

    /**
     * 初始化用户信息
     * */
    function initUserInfo() {
        var queryArgs = $tool.getQueryParam();//获取查询参数
        var id = queryArgs['id'];

        var req = {
            id:id
        };

        $api.FindUserDemo(req,function (res) {
            var data = res.data;
            $("[name='username']").val(data.username);
            $("[name='sex']").val(data.sex);
            $("[name='age']").val(data.age);

            username = data.username;
            sex = data.sex;
            age = data.age;
            form.render();//重新绘制表单，让修改生效
        });
    }

    /**
     * 表单提交
     * */
    form.on("submit(editUser)", function (data) {
        var queryArgs = $tool.getQueryParam();//获取查询参数
        var id = queryArgs['id'];
        var username = data.field.username;
        var sex = data.field.sex;
        var age = data.field.age;

        //请求
        var req = {
            id:id,
            username: username,
            sex: sex,
            age: age
        };

        $api.UpdateUserDemo(JSON.stringify(req),{contentType:"application/json;charset=UTF-8"},function (data) {
            //top.layer.close(index);(关闭遮罩已经放在了ajaxExtention里面了)
            layer.msg("用户更新成功！", {time: 1000}, function () {
                layer.closeAll("iframe");
                //刷新父页面
                parent.location.reload();
            });
        });

        return false;
    })

});


