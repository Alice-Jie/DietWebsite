layui.define(['layer', 'form', 'element', 'table'], function (exports) {
    var layer    = layui.layer
        ,form    = layui.form
        ,element = layui.element
        ,table   = layui.table;

    // 表单数据格式化
    table.init('list', {
        height: 'full-210' // 设置高度
        ,size: 'lg'        // 小尺寸的表格
        ,limit: 10         // 注意：请务必确保 limit 参数（默认：10）是与你服务端限定的数据条数一致
        ,page: true        // 启用分页
    });

    exports('index', {});
});