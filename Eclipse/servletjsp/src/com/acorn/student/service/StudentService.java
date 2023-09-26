package com.acorn.student.service;

import java.util.ArrayList;
import java.util.List;

import com.acorn.student.dao.StudentDao;
import com.acorn.student.dto.StudentDto;
import com.acorn.student.entity.StudentEntity;

public class StudentService {

	public static List<StudentDto> getStudents() {
		
		List<StudentEntity> studentsEntityList = 
				StudentDao.getStudents();
		
		List<StudentDto> students = 
				new ArrayList<StudentDto>();
		
		for(StudentEntity se : studentsEntityList) {
			StudentDto stdto = new StudentDto();
			stdto.setsName(se.getsLastName() + se.getsFirstName());
			if(se.getsAddress().contains("서울")) {
				stdto.setsRegionType("서울");
			} else {
				stdto.setsRegionType("비서울");
			}
			
			students.add(stdto);
		}
		
		return students;
	}
}
