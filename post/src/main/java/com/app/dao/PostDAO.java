package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.PostVO;

public class PostDAO {
	public SqlSession sqlSession;
	
	public PostDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
//		true 값 안넘기면 DB에 반영 X
//		auto commit
	}
	
//	게시물 추가
	public void insert(PostVO postVO) { 
		sqlSession.insert("post.insert", postVO);
	}
	
//	게시물 전체 조회
	public List<PostVO> selectAll() {
		return sqlSession.selectList("post.selectAll");
	}
	
//	게시물 단일 조회
	public Optional<PostVO> select(Long id) {
		return Optional.ofNullable(sqlSession.selectOne("post.select", id));
	}
	
//	최신 게시물 아이디 조회
	public Long selectId() {
		return sqlSession.selectOne("post.selectId");
	}
	
//	게시물 수정
	public void update(PostVO postVO) {
		sqlSession.update("post.update", postVO);
	}
	
//	게시물 삭제
	public void delete(Long id) {
		sqlSession.delete("post.delete", id);
	}
	
	
	

}
