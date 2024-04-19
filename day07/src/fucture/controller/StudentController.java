package fucture.controller;

import fucture.entity.Student;
import fucture.mapper.StudentMapper;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private StudentMapper studentMapper = new StudentMapper();

    public List<Student> findAll() {
        List<Student> students = studentMapper.find();
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Age: " + student.getAge());
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
        }
        return students;
    }
}
