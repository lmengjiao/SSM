<%--
  Created by IntelliJ IDEA.
  User: 林甜甜
  Date: 2021/8/31
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是  test02....  我的根目录是：web\WEB_INF\test02.jsp
web/WEB-INF是一个受保护的目录，外界用户无法直接访问，需要servlet转发才可以访问
不能直接访问。那怎么办呢 ?刚刚讲过的 模型，所有的servelt 请求都需要一个总的serlvet 来处理。
那么这个总的servlet是谁提供的呢? spr ingMVC框架提供的，路径是: org. springframework.web. servlet . DispatcherServlet
名字叫做:  DispatcherServlet. java

负责接收所有外界的req请求。 即: 所有的req请求都要进行统-管理。 相当于- - 个城市的入口。

</body>
</html>
