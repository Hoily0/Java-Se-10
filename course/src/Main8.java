import work.Day8;

public class Main8 {
    public static void main(String[] args) {

//        System.out.println("--------1--------");
//        Day8.head1();


        System.out.println("--------2--------");

       boolean result =  Day8.head2("123456789123456786");
       if (result){
           System.out.println("合法");
       }else {
           System.out.println("不合法");
       }
    }
}
