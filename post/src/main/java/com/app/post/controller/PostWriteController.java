package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;

public class PostWriteController implements Action {
//	Action을 상속받는 이유? 
//	각각의 컨트롤러를 태웠을때 어떻게 보낼지 어디로 보낼지 선언 필수(강제성)
//	강제성을 부여하기 위해서 ,,

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
//		강제성 때문에 Result 선언
		
		result.setPath("write.jsp");
		return result;
	}

}
