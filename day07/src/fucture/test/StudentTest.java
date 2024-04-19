package fucture.test;

import fucture.controller.StudentController;
import fucture.mapper.StudentMapper;

public class StudentTest {
    public static void main(String[] args) {

       StudentController studentController = new StudentController();
       studentController.findAll();

        StudentMapper studentMapper = new StudentMapper();
        System.out.println(studentMapper.find());

    }


}
