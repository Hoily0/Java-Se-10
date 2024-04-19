package fucture.mapper;

import fucture.entity.Student;

import java.util.ArrayList;

public class StudentMapper {

    public  ArrayList<Student> find(){
        ArrayList<Student> studentsList = new ArrayList<>();

        Student student1 = new Student(1, "张紫枫", "女", 21);
        Student student2 = new Student(2, "王夫之", "男", 27);
        Student student3 = new Student(3,"林蔚然", "女", 19);

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        System.out.println(studentsList.get(1).getName());
        System.out.println("遍历到了");

        return studentsList;

    }





}
