package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.StudentTaskVO;

public class StudentTaskDAO {
	public SqlSession sqlSession;
	
	public StudentTaskDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	등록
	public void insert(StudentTaskVO studentTaskVO) {
		sqlSession.insert("studentTask.insert", studentTaskVO);
	}
	

}
