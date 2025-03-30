package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.dto.StudentDTO;
import com.app.mybatis.config.MyBatisConfig;

public class StudentDAO {
	public SqlSession sqlSession;
	
	public StudentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

//	회원 등록
	public void insert(StudentDTO studentDTO) {
		sqlSession.insert("student.insert", studentDTO);
	}
	
}
