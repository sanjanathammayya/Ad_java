<html>
<head>
<title>JSP program</title>
</head>
<body>
<%!double area(double r)
{
return 3.14*r*r;
}
%>
<p>Area of circle:<%=area(8)%></p>
<%!double area(double l, double b)
{
 return l*b;
}
%>
<p>Area of rectangle:<%=area(8,8)%></p>
<%!double area(double a,double b,double c)
{
double s=a+b+c/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
%>
<p>Area of triangle :<%=area(8,8,8)%></p>
</body>
</html>
