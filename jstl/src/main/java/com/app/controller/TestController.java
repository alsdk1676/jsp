package com.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;

public class TestController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		String name = req.getParameter("name");
		System.out.println(name);
		
		List<String> chars = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		
//		req에 담아서 보내기
//		왜 req 객체에 담을 수 있는지? 
//		포워드이기 때문에!
		
		req.setAttribute("chars", chars);
		req.setAttribute("name", name);
		result.setPath("test.jsp");
		return result;
	}

}
