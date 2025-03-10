package com.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class TestController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		String name = req.getParameter("name");
		System.out.println(name);
		
		List<String> chars = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		List<String> datas = new ArrayList<String>(Arrays.asList("<script>alert('잇힝 해킹 성공~!!!')</script>"));
//		List<ProductVO> products = productDAO.selectAll();
		
		
//		request 객체에 담아서 보내기
//		왜 req 객체에 담을 수 있는지? 
//		포워드이기 때문!
//		req.setAttribute("products", products);
//		req.setAttribute("products", new ArrayList());
		req.setAttribute("datas", datas);
		req.setAttribute("chars", chars); // param 영역
		req.setAttribute("name", name);
		
//		JSON products
//		req.setAttribute("products", products);
		JSONArray products = new JSONArray();
//		productDAO.selectAll().stream().map((productVO) -> new JSONObject(productVO));
		productDAO.selectAll().stream().map(JSONObject::new).forEach(products::put);
//		System.out.println(products);
		req.setAttribute("products", products);
		
		
		result.setPath("test.jsp");
		return result;
	}

}
