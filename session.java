import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class session extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
HttpSession hs=request.getsession(true);
Date d=(Date)hs.getAttribute("date");
if(d==null)
{
hs.setAttribute("Previous_user"," ");
hs.setAttribute("Current_user"," ");
}
String old={String)hs.getAttribute(:Previous_user");
String cur={String)hs.getAttribute(:Current_user");
if(d!=null && old=" ")
{
pw.println("Previous login:"<br>");
pw.println("username:+old+"<br>");
pw.println("login time and date:"+d+"<br>");
}
d=new Date();
hs.setAttribute("date",d);
cur=req.getParameter("t1");
hs.setAttribute({"Current_user",cur);
old=cur;
pw.println("Current login:"<br>");
pw.println("username:+cur+"<br>");
pw.println("login time and date:"+d+"<br>");
hs.setAttribute("Previous_user",old);
}

}