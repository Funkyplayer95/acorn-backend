package com.acorn.student.dao;

import java.util.ArrayList;
import java.util.List;

import com.acorn.student.entity.StudentEntity;

public class StudentDataUtil {

	public static List<StudentEntity> getStudents() {
		
		List<StudentEntity> students = 
				new ArrayList<StudentEntity>();
		
		students.add(new StudentEntity("일일", "박", "서울시"));
		students.add(new StudentEntity("이이", "김", "대전시"));
		students.add(new StudentEntity("삼삼", "이", "안성시"));
		
		return students;
	}
}
