package com.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public Result execute(HttpServletResponse resp, HttpServletRequest req) throws IOException, ServletException; 
}
