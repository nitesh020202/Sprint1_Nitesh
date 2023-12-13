package com.sprint1.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.sprint1.Entity.Student;
import com.sprint1.model.StudentDTO;

@Component
public class Converter {
		
	public Student convertToStudentEntity(StudentDTO ref) {
		Student s=new Student();
		if (ref!=null) {
			
		    BeanUtils.copyProperties(ref, s);
		}
		return s;
	}
	
	public StudentDTO convertToStudentDTO(Student s) {
		StudentDTO sd=new StudentDTO();
		if (s!=null) {
			
		    BeanUtils.copyProperties(s, sd);
		}
		return sd;
	}
	
	

}
