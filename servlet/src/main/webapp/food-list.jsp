<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음식 리스트</title>
</head>
<body>
	<!--
		두 수를 입력 받고, 두 수를 더한 결과값이 홀수인지 짝수인지
		서블릿을 통해 응답해주는 페이지 구현
		단, 두 수는 모두 유효성 검사가 필요하다.
	-->
	
	<form method="post" action="home">
		<input name='num1' placeholder="첫 번째 정수"/>
		<input name='num2' placeholder="두 번째 정수"/>
		<button id='submit-button' type='button'>계산</button>
	</form>

</body>
<script type="text/javascript">
	const button = document.querySelector("#submit-button");
	const inputs = document.querySelectorAll("input");
	const form = document.querySelector("form");
	
	button.addEventListener("click", () => {
		inputs.forEach((input) => {
			if(!input.value) {
				alert(input.name + "을 입력하세요.")
				return;
			}
		})
		
		form.submit();
	})

</script>
</html>

