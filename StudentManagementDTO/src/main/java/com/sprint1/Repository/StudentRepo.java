package com.sprint1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint1.Entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
