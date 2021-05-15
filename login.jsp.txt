<html>
<head>
<title>
ligin
</title>
</head>
<body>
<%String n=request.getParameter("t1");
String p=request.getParameter("t2");%>
<%if(n.equals("admin")&&p.equals("123"))
{
out.println("welcome to form processing");
}
else
{
out.println("invalid username or password");
}%>
</body>
</html>
