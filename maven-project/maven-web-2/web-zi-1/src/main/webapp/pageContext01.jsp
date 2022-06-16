<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name1","郭佳成1号");
   request.setAttribute("name1","郭佳成1号");
    pageContext.setAttribute("name1","郭佳成1号");
    pageContext.setAttribute("name1","郭佳成1号");
%>
<%
    String name1 = (String) pageContext.findAttribute("name1");
    String name2= (String) pageContext.findAttribute("name2");
    String name3= (String) pageContext.findAttribute("name3");
    String name4= (String) pageContext.findAttribute("name4");
%>

</body>
</html>
