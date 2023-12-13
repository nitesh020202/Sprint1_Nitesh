package com.sprint1.ServiceIMPS;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.Entity.Student;
import com.sprint1.Repository.StudentRepo;
import com.sprint1.Service.StudentService;
import com.sprint1.model.StudentDTO;
import com.sprint1.util.Converter;

@Service //internalyy we need to tell springboot when any sevice layer called sevice impl class will act as service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo sr;
	
	
	@Autowired
	Converter cr;
	
	@Override
	public StudentDTO createStudent(Student st) {	
		Student st1 = sr.save(st);
		return cr.convertToStudentDTO(st1);
	}

	@Override
	public  List<StudentDTO> getStudents() {
		// TODO Auto-generated method stub
		List<Student>st=sr.findAll();
		List<StudentDTO>dtolist=new ArrayList();
		
		for(Student s:st)
		{
		dtolist.add(cr.convertToStudentDTO(s));

		}
		return dtolist;
		 
	}

	@Override
	public StudentDTO getStudentById(int id) {
		// TODO Auto-generated method stub
		Student s2=sr.findById(id).get();
		return cr.convertToStudentDTO(s2);
	}

	
	 @Override
	    public StudentDTO updateStudent(int id, Student updatedStudent) {
	       // Optional<Student> existingStudentOptional = sr.findById(id);
		  Student existingStudent = sr.findById(id).get();
	        
	           // Student existingStudent = existingStudentOptional.get();
	            existingStudent.setName(updatedStudent.getName());
	            existingStudent.setAddress(updatedStudent.getAddress());
	            existingStudent.setPhone(updatedStudent.getPhone());


	            Student s3=sr.save(existingStudent);
	            return  cr.convertToStudentDTO(s3);
	       
	    }
}
