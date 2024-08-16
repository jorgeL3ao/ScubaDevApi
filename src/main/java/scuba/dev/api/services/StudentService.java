package scuba.dev.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import scuba.dev.api.model.entities.Student;
import scuba.dev.api.model.repository.StudentRepository;

import java.util.List;

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findStudent(){
        return studentRepository.findAll();
    }
}
