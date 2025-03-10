<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성 페이지</title>
</head>
<body>
	<!-- post F.C를 태워야하기 때문에 .post -->
	<form action="write-ok.post" method="post">
		<label>
			<input type="text" name="postTitle" placeholder="게시물 제목"/>
		</label>
		<label>
			<input type="text" name="postContent" placeholder="게시물 내용"/>
		</label>
		<button type="button">게시물 등록하기</button>
	</form>

</body>
<!-- <script type="text/javascript">
	const inputs = document.querySelectorAll("input");
	const form = document.querySelector("form");
	
	document.querySelector("button").addEventListener("click", () => {
		for(let input of inputs) {
			if(!input.value) {
				alert(`${input.name}`의 값을 입력하세요.)
				return;	
		}

	})
</script> -->
</html>