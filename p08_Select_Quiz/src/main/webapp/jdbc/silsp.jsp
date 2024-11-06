<%@page import="pack.jdbc.DBConn"%>
<%@page import="pack.jdbc.DataBean"%>
<%@page import="java.util.List"%>


<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>JDBC 조회</title>
<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>상품목록</h1>

		<div id="goodsListArea">
			<div id="listHeader" class="listCol dFlex">

				<span>번호</span> <span>상품코드</span> <span>상품명</span> <span>가격</span> <span>제고</span>

			</div>
			<!-- div#listHeader, 게시판 목록의 열제목 -->
<jsp:useBean id="dao" class="pack.jdbc.DBConn"/>

<%
	List<DataBean> goodsList = dao.getGoodslist();
	
		for(DataBean data : goodsList){
	%>
			<div class="listRow listCol dFlex">
				<span><%=data.getNum() %></span> 
				<span><%=data.getGoodsCode()%></span>
				<span><%=data.getGoodsName()%></span> 
				<span><%=data.getPrice()%></span>
				<span><%=data.getCount() %></span>

			</div>
			<!-- div#"listCol", 게시판 목록의 열제목 -->
	<% 
		}
	%>		
		</div>
		<!-- div#goodsListArea -->
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
