<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/8/14
  Time: 11:10
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
    <form action="add">
        编号:<input type="text" name="code"><br>
        姓名:<input type="text" name="name"><br>
        开始时间:<input type="text" name="stime"><br>
        结束时间:<input type="text" name="etime"><br>
        创建时间:<input type="text" name="ctime"><br>
        会议类型:<select name="type.tid" id="bj">
                <option value="0">请选择</option>
            </select><br>
        <input type="submit" value="添加">
    </form>
</body>
<script type="text/javascript">
    $.post("query",function(obj){
        for(var x in obj){
            $("#bj").append("<option value='"+obj[x].tid+"'>"+obj[x].tname+"</option>");
        }
    });
</script>
</html>
