<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/8/14
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/index_work.css">
    <script type="text/javascript" src="js/jQuery.3.5.1.js"></script>
</head>
<body>
<table>
    <tr>
        <td colspan="10">
            <form action="list">
                会议名称: <input type="text" name="name">
                <input type="submit" value="查找">
                <a href="add.jsp">添加</a>
            </form>
        </td>
    </tr>
    <tr>
        <td>序号</td>
        <td>编号</td>
        <td>会议名称</td>
        <td>开始日期</td>
        <td>结束日期</td>
        <td>创建日期</td>
        <td>会议类型</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${plist.list}" var="tt">
        <tr>
            <td>${tt.id}</td>
            <td>${tt.code}</td>
            <td>${tt.name}</td>
            <td>${tt.stime}</td>
            <td>${tt.etime}</td>
            <td>${tt.ctime}</td>
            <td>${tt.type.tname}</td>
            <td><a href="del?id=${tt.id}">删除</a>
                <a href="update.jsp?id=${tt.id}">修改</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="10">
            当前 ${plist.pageNum} /${plist.pages}页,
            共 ${plist.total} 条记录,
            <a href="list?pageNum=${plist.firstPage}">首页</a>
            <a href="list?pageNum=${plist.pageNum-1}">上一页</a>
            <a href="list?pageNum=${plist.pageNum+1}">下一页</a>
            <a href="list?pageNum=${plist.lastPage}">尾页</a>
        </td>
    </tr>
</table>
</body>
</html>
