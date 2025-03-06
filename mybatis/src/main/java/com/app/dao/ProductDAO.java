package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.ProductVO;

public class ProductDAO {
	public SqlSession sqlSession;
	
	public ProductDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
//	상품 추가
	public void insert(ProductVO productVO) { // productVO 작성한 데이터를 받아옴
		sqlSession.insert("product.insert", productVO);
	}
	
//	상품 전체 조회
	public List<ProductVO> selectAll() {
		return sqlSession.selectList("product.selectAll");
	}
	
//	상품 단일 조회 (단일 객체는 Optional로 감싸서 보내기)
	public Optional<ProductVO> select(Long id) {
		return Optional.ofNullable(sqlSession.selectOne("product.select", id));
	}
	
//	상품 수정
	public void update(ProductVO productVO) {
		sqlSession.update("product.update", productVO);
	}
	
	
//	상품 삭제
	public void delete(Long id) {
		sqlSession.delete("product.delete", id);
	}

}
