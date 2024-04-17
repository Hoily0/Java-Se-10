package loginCourse;



import java.util.Scanner;

public class Login {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("进入系统");

        for (int i = 0; i < 3; i++) {
            System.out.println("输入用户名");
            String username = sc.next();
            System.out.println("输入密码");
            String password = sc.next();

            boolean result = userJudgment(username, password);


            if (result){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
            }
        }



    }

    static String trueUsername = "李扁扁";
    static String truePassword = "1213456";
    static boolean form = false;

    private static boolean userJudgment(String username, String password) {
        form = (username.equals(trueUsername) && (password.equals(truePassword)));
        return  form;
    }





}
