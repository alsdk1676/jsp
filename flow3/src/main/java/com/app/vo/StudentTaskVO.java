package com.app.vo;

import java.util.Objects;

public class StudentTaskVO {
	private Long id;
	private String studentTaskStudentName;
	private int studentTaskEng;
	private int studentTaskKor;
	private int studentTaskMath;
	
	public StudentTaskVO() {;}

	public StudentTaskVO(Long id, String studentTaskStudentName, int studentTaskEng, int studentTaskKor,
			int studentTaskMath) {
		this.id = id;
		this.studentTaskStudentName = studentTaskStudentName;
		this.studentTaskEng = studentTaskEng;
		this.studentTaskKor = studentTaskKor;
		this.studentTaskMath = studentTaskMath;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentTaskStudentName() {
		return studentTaskStudentName;
	}

	public void setStudentTaskStudentName(String studentTaskStudentName) {
		this.studentTaskStudentName = studentTaskStudentName;
	}

	public int getStudentTaskEng() {
		return studentTaskEng;
	}

	public void setStudentTaskEng(int studentTaskEng) {
		this.studentTaskEng = studentTaskEng;
	}

	public int getStudentTaskKor() {
		return studentTaskKor;
	}

	public void setStudentTaskKor(int studentTaskKor) {
		this.studentTaskKor = studentTaskKor;
	}

	public int getStudentTaskMath() {
		return studentTaskMath;
	}

	public void setStudentTaskMath(int studentTaskMath) {
		this.studentTaskMath = studentTaskMath;
	}

	@Override
	public String toString() {
		return "StudentTaskVO [id=" + id + ", studentTaskStudentName=" + studentTaskStudentName + ", studentTaskEng="
				+ studentTaskEng + ", studentTaskKor=" + studentTaskKor + ", studentTaskMath=" + studentTaskMath + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentTaskVO other = (StudentTaskVO) obj;
		return Objects.equals(id, other.id);
	}
	
	

	
}
