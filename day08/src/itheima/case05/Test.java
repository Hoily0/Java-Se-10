package itheima.case05;

import java.util.Scanner;



/*
  登录案例

  需求:完成用户登录
    系统正确的登录名和密码是：itheima/123456，
    请在控制台开发一个登录界面，接收用户输入的登录名和密码，
    判断用户是否登录成功，登录成功后展示：“欢迎进入系统!”，即可停止程序（注意：要求最多给用户三次登录机会）

    1、开发登录界面，提示用户通过键盘输入登录名和密码。
    2、设计一个登录方法，对用户的登录名和密码进行正确性认证。
    3、根据登录方法返回的认证结果，判断用户是否登录成功。
    4、使用循环控制登录界面最多显示3次。
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 2){
            String userName = sc.next();
            String passWord = sc.next();

            boolean result = login(userName, passWord);
            if (result){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
                count ++;
            }
        }

    }

    private static boolean login(String userName, String passWord) {
        String trueUserName = "admin";
        String truePassWord = "12345";

        if (trueUserName.equals(userName) && truePassWord.equals(passWord)){
            return true;
        }
        return false;
    }

}
