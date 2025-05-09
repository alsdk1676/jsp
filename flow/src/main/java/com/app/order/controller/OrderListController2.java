package com.app.order.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.dao.OrderDAO;
import com.app.vo.MemberVO;

public class OrderListController2 implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		OrderDAO orderDAO = new OrderDAO();
		MemberDAO memberDAO = new MemberDAO();
		HttpSession session = req.getSession();
		
		String memberEmail = (String)session.getAttribute("memberEmail"); // 다운캐스팅
		
//		System.out.println(memberEmail);
		
		if(memberEmail == null) {
			result.setRedirect(true);
			result.setPath("login.member?login=required");
			return result;
		} 
		
		Long id = memberDAO.selectByEmail(memberEmail).map(MemberVO::getId).orElseThrow(() -> {
			throw new RuntimeException("OrderListController user not found");
		});
		
		req.setAttribute("orderList", orderDAO.selectAll(id)); // 주문정보의 리스트
		
		result.setPath("order-list.jsp");
		return result;
	}

}
