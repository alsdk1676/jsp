<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 추가 페이지</title>
</head>
<body>
	<form method="post" action="write-ok.product">
		<label>
			<input type="text" name="productName" placeholder="상품명" />
		</label>
		<label>
			<input type="text" name="productPrice" placeholder="상품 가격" />
		</label>
		<label>
			<input type="text" name="productStock" placeholder="상품 재고" />
		</label>
		<button type="button">상품 등록</button>
	</form>
</body>
</html>