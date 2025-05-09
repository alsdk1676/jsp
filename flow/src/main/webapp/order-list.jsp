<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/order/order-list.css" />
<title>주문 리스트</title>
</head>
<body>
   
   <%@ include file="layout/header.jsp" %>
   
   <table>
      <tr>
         <th>선택</th>
         <th>주문번호</th>
         <th>회원이름</th>
         <th>상품이름</th>
         <th>상품가격</th>
         <th>주문수량</th>
         <th>주문가격</th>
      </tr>   
      <c:forEach var="order" items="${orderList}">
         <input data-productid="${order.productId}" class="product-id" type="hidden">
         <tr>
            <td><input data-orderid="${order.id}" class="order-id" type='checkbox' /></td>
            <td><c:out value="${order.id}" /></td>
            <td><c:out value="${order.memberName}" /></td>
            <td><c:out value="${order.productName}" /></td>
            <td><fmt:formatNumber value="${order.productPrice}" pattern="#,###"/>원</td>
            <td><c:out value="${order.productCount}" /></td>
            <td><fmt:formatNumber value="${order.totalPrice}" pattern="#,###"/>원</td>
         </tr>
      </c:forEach>
   </table>

   <form id="cancel-form" action="cancel.order" method="post">
   </form>
   	<button type="button" onclick="cancel()">주문 취소</button>

</body>
<script src="assets/css/order/order-list.js" />
<!-- <script type="text/javascript">
   const form = document.getElementById("cancel-form");
   const orderCheckboxes = document.getElementsByClassName("order-id");
   const productIds = document.getElementsByClassName("product-id");
   
   /* console.log(orderCheckboxes[0].dataset["orderid"]) */
   
   let text = "";
   
   const cancel = () => {
      Array.from(orderCheckboxes).forEach((orderCheckbox, index) => {
         if(orderCheckbox.checked){
            const orderId = orderCheckbox.dataset["orderid"];
            const productId = productIds[index].dataset["productid"]
            
            text += "<input type='hidden' name='orderId' value='" + orderId + "' />"
            text += "<input type='hidden' name='productId' value='" + productId + "' />"
            
         }
      })
      
/*       console.log(text) */
      
      form.innerHTML += text;
      form.submit();
   } -->


<!-- </script> -->
</html>


