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
<title>Insert title here</title>
</head>
<body>
	<div class="container py-3">
	
	<c:choose>
		<c:when test="${dangKy.id > 0}">
			<h2 class="text-center text-danger pb-3">Form Edit </h2>
			<c:url var="url" value="/edit" />
		</c:when>
		<c:otherwise>
			<h2 class="text-center text-danger pb-3">Form Add </h2>
			<c:url var="url" value="/add" />
		</c:otherwise>
	</c:choose>
	

	
		<form:form action="${url}" modelAttribute="dangKy" method="post">
  			<div class="form-row">
  			
   				 <div class="form-group col-md-6">
   				 	<form:label path="tenKH">Ten Khach Hang:</form:label>
      				<form:input path="tenKH" class="form-control" placeholder="nhap ten khach hang..." />
      				<form:errors path="tenKH" class="text-danger" />
      				<form:hidden path="id"/>
   				 </div>
   				 
   				 <div class="form-group col-md-6">
   					 <form:label path="soDienthoai">So Dien Thoai:</form:label>
      				<form:input path="soDienthoai" class="form-control" placeholder="nhap so dien thoai..." />
      				<form:errors path="soDienthoai" class="text-danger" />
   				 </div>
   				 
   				 <div class="form-group col-md-6">
   				 	<form:label path="soLan">So Lan:</form:label>
      				<form:input  path="soLan" class="form-control" placeholder="nhap so luong san..." type="text"   />
      				
   				 </div>
   		
   		
   				<div class="form-group col-md-6">
   				 	<form:label path="ngayBatDau">Ngay Bat Dau:</form:label>
      				<form:input  path="ngayBatDau" class="form-control" type="date" />
      				<form:errors path="ngayBatDau" class="text-danger" />
   				 </div>
   				
   				
   				<div class="form-group col-md-6">
   				 	<form:label path="ngayKT">Ngay Ket Thuc:</form:label>
      				<form:input  path="ngayKT" class="form-control" type="date" />
   				 </div>
   				 
   				 
   				 <div class="form-group col-md-6">
   				 	<form:label path="tienDatCoc">Tien dat coc:</form:label>
      				<form:input  path="tienDatCoc" class="form-control" />
   				 </div>
   				 
   				 <div class="form-group col-md-6">
   				 	<form:label path="form1Entity.id">Hinh Thuc:</form:label>
      				<form:input  path="form1Entity.id" class="form-control" />
      				<span class="text-danger">${checkTT}</span>
   				 </div>
   				 
   				 
   				
   			
   				 
   				 
   	<!-- 			 //------------------ -->
   				 
   				 
   			<%-- 	 <div class="form-group col-md-6">
   				 	<form:label path="tienThanhToan">Tien Thanh Toan :</form:label>
      				<form:input  path="tienThanhToan" class="form-control" placeholder="Nhap tien thanh toan..." type="text" />
   				 </div> --%>
   				
   				
   			<%-- 	 <div class="form-group col-md-6">
   				 	<form:label path="ngayDatCoc">Ngay Dat Coc :</form:label>
      				<form:input  path="ngayDatCoc" class="form-control" placeholder="Chon ngay dat coc..." type="date" />
   				 </div> --%>
   				 
   				 
   				<%--   <div class="form-group col-md-6">
   				 	<form:label path="ngayThanhToan">Ngay thanh toan :</form:label>
      				<form:input  path="ngayThanhToan" class="form-control" placeholder="Chon ngay thanh toan..." type="date" />
   				 </div> --%>
   				 
   				 
   			<!-- 	 ------------------------
   				  -->
   				 
   				<%--   <div class="form-group col-md-6">
   				 	<form:label path="">Loai San :</form:label>
      				<form:select path="loaiSanEntity.id" class="form-control">
      					<form:option value="11">--chon--</form:option>
      					<form:options items="${loaiSan}" itemLabel="tenLoaiSan" itemValue="id" />
      				</form:select>
   				 </div>
   				 <c:if test="${dangKyThue.maKH > 0}">
   				 <div class="form-group col-md-6">
   				 	<form:label path="trangThai">Trang Thai:</form:label>
      				<form:input  path="trangThai" class="form-control" placeholder="Chon trang thai..." type="number" min="0" max="2" />	
   				 </div>
   				 </c:if>
   				  --%>
   				 
 			 </div>
 			 <div class=" d-flex justify-content-center">

				 <c:choose>
					<c:when test="${dangKy.id > 0}">
						<button type="submit" class="btn btn-primary">Edit</button>
					</c:when>
					<c:otherwise>
						<button type="submit" class="btn btn-primary">Add</button>
					</c:otherwise>
				</c:choose>
 			 	
 			 </div>
		</form:form>
	</div>
</body>
</html>