import empty.Student;
import work.Day1;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("------1------");
        Day1.head1();


        System.out.println("------2------");
        Day1.head2();


        System.out.println("------3------");
        Student student = new Student();
        student.setName("小红");
        student.setAge(18);
        System.out.println(student.getName());
        System.out.println(student.getAge());


        System.out.println("------4------");
        Day1.head4();


        System.out.println("------5------");
        System.out.println("这是5");


        System.out.println("------6------");
        Day1.head6();


        System.out.println("------7------");
        Day1.head7();


        System.out.println("------8------");
        Day1.head8();

        Day1.flower();

    }
}
