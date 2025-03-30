<%@page import="com.app.vo.StudentTaskVO"%>
<%@page import="java.util.Optional"%>
<%@page import="com.app.dao.StudentTaskDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 상세 정보</title>
</head>
<body>
   <%
      StudentTaskDAO studentTaskDAO = new StudentTaskDAO();
      Long id = Long.parseLong(request.getParameter("id"));
      Optional<StudentTaskVO> foundStudent = studentTaskDAO.select(id);
      
      if (foundStudent.isPresent()) {
    	  StudentTaskVO student = foundStudent.get();
   %>
      <table>
         <tr>
            <th>학생이름</th>
            <th>수학점수</th>
            <th>영어점수</th>
            <th>국어점수</th>
         </tr>
         <tr>
            <td><%=student.getId() %></td>
            <td><%=student.getStudentTaskStudentName() %></td>
            <td><%=student.getStudentTaskMath() %></td>
            <td><%=student.getStudentTaskEng() %></td>
            <td><%=student.getStudentTaskKor() %></td>
         </tr>
      </table>
      
      <div>
      	<a href="edit.jsp?id=<%=request.getParameter("id") %>">상품 수정</a>
      </div>
      
      <div>
      	<a href="remove?id=<%=request.getParameter("id") %>">상품 삭제</a>
      </div>
   
      
   <%    
      }
   %>   
   

</body>
</html>