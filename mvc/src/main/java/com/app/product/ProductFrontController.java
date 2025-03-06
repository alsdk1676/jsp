package com.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ProductFC만 servlet
public class ProductFrontController extends HttpServlet {
	
//	http://localhost:9000/mvc/insert.product => insert만 필요 !
//	mvc = ContextPath 필요없음
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("UTF-8");
//		resp.setContentType("text/html; charset=utf-8;");
		
//		["insert", "product"]
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		
		if(target.equals("write")) { // forward : 작성 페이지로 이동
		}else if(target.equals("write-ok")) {
		}else if(target.equals("list")) {
		}else if(target.equals("read")) {
		}else if(target.equals("update")) {
		}else if(target.equals("update-ok")) {
		}else if(target.equals("delete-ok")) {
		}else {
//			전부 404
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	


}
