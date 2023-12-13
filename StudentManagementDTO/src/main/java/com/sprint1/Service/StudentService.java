package com.sprint1.Service;

import java.util.List;

import com.sprint1.Entity.Student;
import com.sprint1.model.StudentDTO;

public interface StudentService {
	
	StudentDTO createStudent(Student st);
	//after creating student on database it will return student object
	
	 List<StudentDTO> getStudents();
	 
	 StudentDTO getStudentById(int id);
	 
	 StudentDTO updateStudent(int id, Student updatedStudent);

	 
	 
}		

