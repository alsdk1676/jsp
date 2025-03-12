package com.app.order.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.OrderDAO;
import com.app.dao.ProductDAO;
import com.app.vo.OrderVO;

public class OrderCancelController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		OrderDAO orderDAO = new OrderDAO();
		ProductDAO productDAO = new ProductDAO();
		String[] orderIds = req.getParameterValues("orderId");
		String[] productIds = req.getParameterValues("productId");
//		ArrayList<String> oIds = new ArrayList(Arrays.asList(orderIds)); 
		
		
//		  for(String orderId : orderIds) { 
//		  System.out.println(orderId); 
//		  } 
//		  for(String productId : productIds) {
//		  System.out.println(productId);
//		  }
	
		
		for(int i = 0; i < orderIds.length; i++) {
			OrderVO orderVO = new OrderVO(); // 반복문이 돌 때마다 새로운 VO
			orderVO.setId(Long.parseLong(orderIds[i]));
			orderVO.setProductId(Long.parseLong(productIds[i]));
			orderVO.setProductCount(orderDAO.selectCountById(Long.parseLong(orderIds[i]))  * -1); // count
			
//			??
//			1) 재고를 복구한다.
//			추가 구매한 개수를 구하는 쿼리가 필요하다
			productDAO.updateStock(orderVO); // 기본값을 더하기 때문에 * -1
			
//			2) 상품을 삭제한다.
			orderDAO.delete(Long.parseLong(orderIds[i]));
		}
		
				
		result.setRedirect(true);
		result.setPath("list.order");
		return result;
	}

}
