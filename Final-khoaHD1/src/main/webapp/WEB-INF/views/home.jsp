<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link type="text/css" rel="stylesheet"
	href="<c:url value='/webjars/bootstrap/4.3.1/css/bootstrap.min.css' />" />
<link type="text/css" rel="stylesheet"
	href="<c:url value='/webjars/font-awesome/4.7.0/css/font-awesome.css' />" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<c:set var="context" value="${pageContext.request.contextPath}" />
	<div class="container">
		<div class="row">
			<div class="col-md-6 py-3">
					<form class="form-inline" action="${context}/search" method="post">
			  			<div class="form-group">
			    			 <input type="text" class="form-control" name="tenKH" placeholder="search" />
			  			</div>
			  			
			  			<button type="submit" class="btn btn-primary">search</button>
					</form>	
			</div>
			<div class="col-sm-6 text-right py-3">
						<button class="btn btn-success btn-md" type="button" onclick="location.href='${context}/add'">
									<i class="fa fa-plus"></i>
						</button>	
			</div>
		</div>
	</div>

	<div class="container-fluiz">
		<div class="row">
			<div class="col-md-12">
			<h1 class="text-center">Danh sach dang ky</h1>
			<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">Ten KH</th>
				      <th scope="col">So Dien Thoai</th>
				      <th scope="col">So lan</th>
				      <th scope="col">Ngay Bat Dau</th>
				      <th scope="col">Ngay Ket Thuc</th>
				      <th scope="col">Tien dat coc</th>
				      <th scope="col">Tien Thanh Toan</th>
				<!--       <th scope="col">Tien Thanh Toan</th> -->
				      <th scope="col">Ngay dat coc</th>
				      <th scope="col">Hinh Thuc</th>
				      <th scope="col">Action</th>
				    </tr>
				  </thead>
				  <tbody>
				  	<c:forEach items="${form2}" var="f2" varStatus="loop">
					  	<tr>
					      <th scope="row">${loop.index +1}</th>
					      
					      <td>${f2.tenKH}</td>
					      <td>${f2.soDienthoai}</td>
					      <td>${f2.soLan}</td>
					      <td>${f2.ngayBatDau}</td>
					      <td>${f2.ngayKT}</td>
					      <td>${f2.tienDatCoc}</td>
					      <td>${f2.tienThanhToan}</td>
					      <td>${f2.ngayDatCoc}</td>
					      <td>${f2.form1Entity.id}</td>
					      <%-- <td>
					    	<fmt:formatNumber type = "number"  value = "${DKT.tienDatCoc}" />
					      </td> --%>
					     
					      
					      
					      <td>
					      <button class="btn btn-primary btn-sm" type="button" onclick="location.href='${context}/edit/${f2.id}'">
							<i class="fa fa-edit"></i>
						</button>
						<button class="btn btn-danger btn-sm" type="button" onclick="location.href='${context}/delete/${f2.id}'">
							<i class="fa fa-trash"></i>
						</button>
					      </td>
					    </tr>
				  	</c:forEach>
				  </tbody>
			</table>
			</div>
		</div>
	</div>
</body>
</html>