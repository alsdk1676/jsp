<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 등록 페이지</title>
</head>
<body>
	<form action="write-ok.student" method="post">
		<label>
			<input type="text" name="studentName" placeholder="이름을 입력하세요." />
		</label>
		<label>
			<input type="number" name="eng" placeholder="수학 점수를 입력하세요." />
		</label>
		<label>
			<input type="number" name="kor" placeholder="영어 점수를 입력하세요." />
		</label>
		<label>
			<input type="number" name="math" placeholder="국어 점수를 입력하세요." />
		</label>
		<button>정보 등록</button>
	</form>

</body>

</html>