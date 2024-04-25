package atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Atm {

    public void welcome(){
        ArrayList<Account> list =new ArrayList<>();

        while (true){
            System.out.println("欢迎进入黑马银行Atm系统");
            System.out.println("1.登陆账户");
            System.out.println("2.注册开户");
            System.out.println("请输入操作");
            Scanner sc= new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //TODO 总体
                    System.out.println("登录账户功能");
                    login(list);
                    break;
                case 2:
                    System.out.println("注册开户功能");
                    register(list);
                    break;
                default:
                    System.out.println("无效的操作，请重新操作");

            }
        }


    }

    private void login(ArrayList<Account> list) {//todo 登录
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("欢迎进入登录界面");
            System.out.println("输入卡号进行登录");
            System.out.println("(tips:输入back即可返回上一层)");

            String cardId = scanner.next();
            if (cardId.equals("back")){
                break;
            }
            Account account = selectAccountById(list, cardId);
            if (account == null){
                System.out.println("卡号不存在，请重新输入卡号");
            }else {

                while (true){
                    System.out.println("请输入密码");
                    String passWord = scanner.next();
                   if (!account.getPassWord().equals(passWord)){
                       System.out.println("密码错误,请重新输入");
                   }else {
                       System.out.println("欢迎" +account.getCardName() + "登录系统，您的卡号" + cardId);
                       showList(list,account);
                       return;
                   }
                }


            }
        }


    }

    private void showList(ArrayList<Account> list, Account account) {
        //todo 登录之后界面
        while (true){
            System.out.println("======欢迎您进入黑马银行用户操作界面======");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            System.out.println("您可以继续选择功能进行操作了");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("这是查询界面");
                    findInfo(account);
                    break;
                case 2:
                    System.out.println("这是存款界面");
                    addBalance(account);
                    break;
                case 3:
                    System.out.println("这是取款界面");
                    deleteBalance(account);
                    break;
                case 4:
                    System.out.println("这是转账界面");
                    transferAccount(list, account);
                    break;
                case 5:
                    System.out.println("这是修改密码界面");
                    changePassword(account);
                    break;
                case 6:
                    System.out.println("这是退出界面");
//                    quit();
                    System.out.println("----正在退出----");
                    return;
                case 7:
                    System.out.println("注销当前账户");
                    logoutAccount(list, account);
                    return;
            }
        }
    }

    private void changePassword(Account account) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入当前账户的密码");
            String password = scanner.next();
            if (password.equals(account.getPassWord())){
                System.out.println("密码不正确");
            }else {
                while (true){
                    System.out.println("请输入新密码");
                    String newPasswordOne = scanner.next();
                    System.out.println("请重复新密码");
                    String newPasswordTwo = scanner.next();
                    if (!newPasswordTwo.equals(newPasswordOne)){
                        System.out.println("两次密码不一致，请重新输入");
                    }else {
                        account.setPassWord(newPasswordTwo);
                        System.out.println("新密码已保存");
                    }
                }


            }
        }



    }

    private void logoutAccount(ArrayList<Account> list, Account account) {//todo 注销账户
        list.remove(account);
    }


    private void transferAccount(ArrayList<Account> list, Account account) {//todo 转账
        if (list.size() < 2){
            System.out.println("该Atm用户不足，无法转账");
            return;
        }
        if (account.getBalance() < 100){
            System.out.println("余额不足，无法转账");
            return;
        }
        while (true) {
            System.out.println("请输入转账对象");
            Scanner sc = new Scanner(System.in);
            String otherCard = sc.next();
            for (Account value : list) {
                if (value.getCardId().equals(otherCard)) {
                    while (true){
                        System.out.println("(tips:输入-1即可返回上一层)");
                        System.out.println("请输入要转账的金额");
                        double Amount = sc.nextDouble();
                        if (Amount== -1){
                            break;
                        }
                        else if (Amount > account.getBalance()){//金额不足
                            System.out.println("您的余额为" + account.getBalance() + "不足以转账给他人" );
                            System.out.println("请重新输入");
                        }else if (Amount > account.getLimit()){
                            System.out.println("转账的钱超出取款限额，请升级为Vip用户");
                        }
                        else {
                            System.out.println("用户" +account.getCardName() + "已经转账" + Amount + "元");
                            selectAccountById(list,otherCard).setBalance(account.getBalance() + Amount);
                            account.setBalance(account.getBalance() - Amount) ;
                            return;
                        }
                    }
                    break;

                } else {
                    System.out.println("不存在该用户，请重新输入卡号");
                }
            }
        }
    }

    private void deleteBalance(Account account) {//todo 登录取款
        System.out.println("进入取款界面");
        while (true){
            System.out.println("(tips:输入-1即可返回上一层)");
            System.out.println("请输入要取款的金额");
            Scanner sc=  new Scanner(System.in);
            double Amount = sc.nextDouble();
            if (Amount== -1){
                break;
            }
            else if (Amount > account.getBalance()){//金额不足
                System.out.println("您的余额为" + account.getBalance() + "不足以取出" + Amount + "元" );
                System.out.println("请重新输入");
            }else if (Amount > account.getLimit()){
                System.out.println("取出的钱超出每次取款限额，请升级为Vip用户");
            }
            else {
                System.out.println("用户" +account.getCardName() + "已经取出" + account.getBalance() + "元");
                break;
            }
        }

    }

    private void addBalance(Account account) {//todo 登录存款
        System.out.println("进入存款功能界面");
        System.out.println("(tips:输入-1即可返回上一层)");
        System.out.println("请输入您要存款的金额");
        Scanner sc = new Scanner(System.in);
        double deposit = sc.nextDouble();
        account.setBalance(account.getBalance() + deposit);
        System.out.println("存款成功");

    }

    private void findInfo(Account account) {//todo 登录查询
        System.out.println("您的卡号" + account.getCardId());
        System.out.println("您的姓名" + account.getCardName());
        System.out.println("您的限额" + account.getLimit());
        System.out.println("您的余额" + account.getBalance());
        System.out.println("您的密码" + account.getPassWord());
    }


    private void register(ArrayList<Account> list) {//TOdo 注册

        System.out.println("进入办卡页面");
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名");
        String cardName = scanner.next();

        while (true){
            System.out.println("请输入密码");
            String passWord = scanner.next();
            System.out.println("请输入密码");
            String currentPassWord = scanner.next();
            if (passWord.equals(currentPassWord)){

                System.out.println("请输入每次限额");
                int limit = scanner.nextInt();

                Account account = new Account();
                account.setCardId(createCardId(list));
                account.setCardName(cardName);
                account.setPassWord(passWord);
                account.setLimit(limit);
                account.setBalance(0);

                list.add(account);
                System.out.println("注册成功，" + account.getCardName() + "的卡号是" + account.getCardId()+ ",余额为" + account.getBalance() + ",每次限额为" + account.getLimit());
                break;

            }else {
                System.out.println("密码不相同，重新输入");
            }

        }


    }


    public String createCardId(ArrayList<Account> list){//todo 创建卡号
        while (true) {
            String cardId = "";

            for (int i = 0; i < 8; i++) {
                Random random = new Random();
                if (((cardId.isEmpty())))
                    cardId += random.nextInt(9) + 1;
                else {
                    cardId += random.nextInt(10);
                }
            }
            Account account = selectAccountById(list, cardId);
            if (account == null) {
                return cardId;
            } else {
                System.out.println("该用户已经存在");
            }
        }
    }


    public Account selectAccountById(ArrayList<Account> list, String cardId){//todo 卡号查重方法
        for (Account account : list) {
            if (account.getCardId().equals(cardId)) {
                return account;
            }
        }
        return null;
    }

}
