package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.dto.StudentDTO;

public class StudentWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO studentDTO = new StudentDTO();
		
		studentDTO.setStudentName(req.getParameter("studentName"));
		studentDTO.setEng(Integer.parseInt(req.getParameter("eng")));
		studentDTO.setMath(Integer.parseInt(req.getParameter("math")));
		studentDTO.setKor(Integer.parseInt(req.getParameter("kor")));
		
		studentDAO.insert(studentDTO);

		return result;
	}

}
