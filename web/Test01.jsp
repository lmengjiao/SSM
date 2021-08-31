<%--
  Created by IntelliJ IDEA.
  User: 林甜甜
  Date: 2021/8/31
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是  test01....
我的路径是 web\test01.jsp
有几个缺点 ，1.不符合 我们刚刚说的 把所有的都拦截的要求
没有把请求做统一的拦截，就会造成 无法对其 进行一个管理
2.用户访问的时候，就会 直接访问 ，无法做出 有效的拦截 不安全。
所以不能放入 web下面
jsp （html ） 界面层 应该放入到 一个  项目的受保护的 文件目录下。
web/WEB-INF 下 这个是 受保护的  用户直接访问不了的
</body>
</html>
