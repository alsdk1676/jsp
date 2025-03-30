package com.app.studentTask.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;

public class StudentWriteController implements Action{
	@Override
	public Result execute(HttpServletResponse resp, HttpServletRequest req) throws IOException, ServletException {
		Result result = new Result();
		result.setPath("write.jsp");
		return result;
	}
}
