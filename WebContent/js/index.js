layui.define(['layer', 'form', 'element', 'table', 'upload'], function (exports) {
    var layer     = layui.layer
        , form    = layui.form
        , element = layui.element
        , table   = layui.table
        , upload  = layui.upload
        ;

    // 表单数据格式化
    table.init('foodList', {
        height: 'full-210' // 设置高度
        , size: 'lg'        // 小尺寸的表格
        , limit: 10         // 注意：请务必确保 limit 参数（默认：10）是与你服务端限定的数据条数一致
        , page: true        // 启用分页
    });

    // 上传图片
    var uploadInst = upload.render({
        elem: '#uploadImg'    // 绑定元素
        , url: '/upload/'  // 上传接口
        , done: function (res, index, upload) {
            // 上传完毕回调
        }
        , error: function () {
            // 请求异常回调
        }
    });

    // 提交表单
    form.on('submit(addFood)', function (data) {
    	console.log(data);
    });


    exports('index', {});
});