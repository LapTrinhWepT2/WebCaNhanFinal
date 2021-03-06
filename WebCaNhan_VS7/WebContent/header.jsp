<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dao.UsersDao" %>
<%@ page import="model.Users" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>header</title>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/style.css">
		<script src= "javascript/jquery-3.1.1.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>
	</head>
	
	<body>
		<%
			UsersDao usersDao=new UsersDao();
			Users users = null;
			if(session.getAttribute("user")!= null){
				users = (Users) session.getAttribute("user");
			}
		%>
		<div class="container">
			<div class="row">
				<div class="col-md-5 col-sm-5 col-xs-5">
					<img src="image/logo.png" alt="" width="150px" height="40px">
				</div>
				<div class="col-md-7 col-sm-7 col-xs-7 toptieude">
					<p>Học - Học nữa - Học mãi - Học máu</p>
				</div>
			</div>
		</div>
		<nav class="navbar navbar-inverse " >
		    <div class="container">
		        <div class="navbar-header">
		            <a class="navbar-brand" href="#">Trang chủ</a>
		        </div>
		        <ul class="nav navbar-nav">
		            <li ><a href="#">Thông tin cá nhân</a>
		            </li>
		            <li ><a href="#">Khóa học</a>           
		            </li>
		            <li><a href="#">Tìm kiếm</a>
		            </li>
		        </ul>
		        <ul class="nav navbar-nav navbar-right">
		        	<% if(users!=null){ %>
		            <li><a href="#"><%=users.getHovaten() %></a>
		            <%} %>
		            </li>
		            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a>
		            </li>
		        </ul>
		    </div>
		</nav>
	</body>
</html>