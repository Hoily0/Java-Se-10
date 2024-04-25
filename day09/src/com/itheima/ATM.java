package com.itheima;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM业务操作类
 * <p>
 * 运行程序时，进入登录界面，在此界面可以登录、或者开户。
 */
public class ATM {
    /**
     * 欢迎界面设计
     * 每个用户的账户信息都是一个对象，需要提供账户类。
     * 需要准备一个容器，用于存储系统全部账户对象信息。
     * 首页只需要包含：登录和注册2个功能。
     */
    public void weclome() {
        //创建账户集合
        ArrayList<Account> list = new ArrayList<>();
        while (true) { //ATM死循环程序，一直提供服务
            System.out.println("===================欢迎您进入黑马银行ATM系统========================");
            System.out.println("1.登录账户");
            System.out.println("2.注册开户");
            System.out.println("请输入命令1、2选择对应的操作：");
            //创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            //判断用户输入的命令
            switch (type) {
                case 1:
                    //todo 登录账户
                    System.out.println("登录账户。。。。。。。。。");
                    login(list);
                    break;
                case 2:
                    //todo 注册开户
                    System.out.println("注册开户。。。。。。。。。");
                    register(list);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 开户功能实现
     * 开户应该定义成一个方法，并传入账户集合
     * 创建一个Account账户类的对象用于封装账户信息（姓名、密码、卡号,取现额度）
     * 键盘录入姓名、密码、确认密码（需保证两次密码一致）
     * 生成账户卡号，卡号必须由系统自动生成8位数字（必须保证卡号的唯一）
     * 把Account账户对象存入到集合accounts中去。
     * 显示卡号和开户成功提示信息
     */
    public void register(ArrayList<Account> list) {
        System.out.println("===================欢迎您进入黑马银行用户办卡界面==========================");
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您的姓名：");
        String name = sc.next();
        while (true) {
            System.out.println("请您输入您的密码：");
            String password = sc.next();
            System.out.println("请您输入您的确认密码：");
            String password2 = sc.next();
            //判断两次密码是否一样
            if (password.equals(password2)) {
                System.out.println("请设置当次取现额度：");
                int limit = sc.nextInt();

                //将用户输入的数据封装账户对象中
                Account ac = new Account();
                ac.setName(name);
                ac.setPassword(password);
                ac.setLimit(limit);
                ac.setCardId(createCardId(list));//卡号生成逻辑比较复杂，单独再来实现
                ac.setMoney(0);//新开户默认账户余额0

                //将account账户对象存入集合中
                list.add(ac);
                System.out.println(ac.getName() + "贵宾，您的账户已经开卡成功，您的卡号是：" + ac.getCardId());

                break;
            } else {
                System.out.println("两次密码不一样，请重新输入");
            }
        }


    }


    /**
     * 生成卡号
     * 随机生成8位卡号
     * 判断卡号是否重复
     */
    public String createCardId(ArrayList<Account> list) {
        while (true) {
            //定义String变量存卡号
            String cardId = "";
            //循环遍历生成8位的卡号  12345678
            for (int i = 0; i < 8; i++) {
                Random random = new Random();
                int num = random.nextInt(10);//0-9 (第一位不能为0逻辑自己加)
                cardId += num;//隐式强制类型转换
            }
            //判断卡号是否唯一，如果不是唯一，重新生成卡号
            Account account = selectAccountByCardId(cardId, list);
            if (account == null) {
                return cardId; //没有重复，返回卡号
            } else {
                System.out.println("卡号重复了，正在重新生成。。。。");
            }
        }
    }


    /**
     * 根据卡号查询list是否存在卡号，如果存在返回账号对象
     */
    public Account selectAccountByCardId(String cardId, ArrayList<Account> list) {
        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);//得到集合中每个账户对象
            if (account.getCardId().equals(cardId)) {
                return account;
            }
        }
        return null;//没有找到账户对象
    }


    /**
     * 登录功能实现
     * 让用户输入卡号，根据卡号去账户集合中查询账户对象。
     * 如果没有找到账户对象，说明登录卡号不存在，提示继续输入卡号。
     * 如果找到了账户对象，说明卡号存在，继续输入密码。
     * 如果密码不正确，提示继续输入密码
     * 如果密码也正确，登陆成功！！
     */
    public void login(ArrayList<Account> list) {
        while (true) {
            System.out.println("===============黑马银行ATM系统登录界面==================");
            System.out.println("请您输入您的卡号：");
            Scanner sc = new Scanner(System.in);
            String cardId = sc.next();
            //判断卡号是否存在，调用注册中定义的方法
            Account account = selectAccountByCardId(cardId, list);
            if (account == null) {
                System.out.println("不存在该卡号");
            } else {
                while (true) {
                    System.out.println("请您输入您的密码：");
                    String password = sc.next();
                    //判断account对象中的密码 跟用户输入的密码进行比较
                    if (!account.getPassword().equals(password)) {
                        System.out.println("您的密码有误，请确认！");
                    } else {
                        System.out.println(account.getName() + "贵宾，欢迎您进入系统，您的卡号：" + account.getCardId());
                        //加登录后界面。。。。。。。
                        showUser(list,account);
                        return;
                    }
                }
            }
        }
    }


    /**
     * 展示用户操作界面
     * 用户登录成功后，需要进入用户操作页。
     * 查询就是直接展示当前登录成功的账户对象的信息。
     * 退出账户是需要回到首页的。
     * ArrayList<Account> list:所有账户
     * Account account 当前账户对象
     */
    public void showUser(ArrayList<Account> list, Account account) {
        while (true) {
            System.out.println("=============欢迎您进入黑马银行用户操作界面===================");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            System.out.println("您可继续选择功能进行操作了：");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    //todo 查询
                    System.out.println("查询.......");
                    showUserInfo(account);
                    break;
                case 2:
                    //todo 存款
                    System.out.println("存款.......");
                    saveMoney(account);
                    break;
                case 3:
                    //todo 取款
                    System.out.println("取款.......");
                    getMoney(account);
                    break;
                case 4:
                    //todo 转账
                    System.out.println("转账.......");
                    transferMoney(account,list);
                    break;
                case 5:
                    //todo 修改密码
                    System.out.println("修改密码.......");
                    updatePassword(account);
                    return;
                case 6:
                    //todo 退出
                    System.out.println("退出.......");
                    return;//终止当前方法执行了
                case 7:
                    //todo 注销当前账户
                    System.out.println("注销当前账户.......");
                    boolean flag = destoryAccount(account,list);
                    if(flag){
                        //注销了 回到首页
                        return;
                    }else{
                        break;
                    }
            }
        }
    }


    /**
     * 查询账户
     */
    public void showUserInfo(Account account){
        System.out.println("===========欢迎您进入黑马银行用户详情界面==============");
        System.out.println("您的账户信息如下：");
        System.out.println("卡号："+account.getCardId());
        System.out.println("姓名："+account.getName());
        System.out.println("余额："+account.getMoney());
        System.out.println("当次取现额度："+account.getLimit());
    }


    /**
     * 用户存款（扩展需求：整百存取）
     *      存款就是拿到当前账户对象。
     *      然后让用户输入存款的金额（整百存取）。
     *      调用账户对象的setMoney方法将账户余额修改成存钱后的余额。
     *      存钱后需要查询一下账户信息，确认是否存钱成功了！
     */
    public void saveMoney(Account account){
        //获取当前账户的余额
        double myMoney = account.getMoney();
        //提示用户要存入的钱
        System.out.println("请输入存款的金额：");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        //将用户存入的money+myMoney钱，重新设置到account对象
        account.setMoney(myMoney+money);
        System.out.println("您已经存款成功了！");
        showUserInfo(account);//再次调用查询账户的方法 看账户信息（包含余额）
    }


    /**
     * 用户取款
     *      取款需要先判断账户是否有钱，如果<100提示不足，提示存钱。
     *      有钱则拿到自己账户对象。
     *      然后让用户输入取款金额
     *      判断取款金额是否超过了余额，以及是否超过了当次限额以及是否是整百
     *      满足要求则调用账户对象的setMoney方法完成金额的修改。
     */
    public void getMoney(Account account){
        System.out.println("===============欢迎您进入黑马银行用户取款界面=================");
        if(account.getMoney() < 100) {
            System.out.println("账户余额不足100元，先去存钱吧！");
            return;//直接return
        }
        while (true) {
            System.out.println("请您输入取款的金额：");
            Scanner sc = new Scanner(System.in);
            int getMoney = sc.nextInt();//用户要取的钱
            //判断用户要取的钱 是否超过 当次限额
            int limit = account.getLimit();
            if (getMoney > limit) {
                System.out.println("您当前取款超过了当次限额！");
            } else if (getMoney > account.getMoney()) {
                System.out.println("您的账户余额不足！");
            } else {//用户的取款金额 小于 用户账户的余额
                //将当前账户的余额进行扣除
                account.setMoney(account.getMoney() - getMoney);// 10000 - 2000
                break;
            }
        }

    }

    /**
     *  转账
     *      转账功能需要判断系统中是否有2个账户对象及以上。
     *      同时还要判断自己账户是否有钱。
     *      接下来需要输入对方卡号，判断对方账户是否存在。
     *      对方账户存在还需要认证对方户主的姓氏。
     *      判断转账金额是否大于余额，如果是提示余额不足，转账失败
     *      判断转账金额超过当次金额，超过则提示错误
     *      满足要求则然后把自己账户对象的金额修改到对方账户对象中去。
     */
    public void transferMoney(Account account,ArrayList<Account> list) {
        //判断有2个及以上的账户
        if(list.size() < 2){
            System.out.println("当前系统，账户不足2个，不能转账");
            return;
        }
        //看当前账户是否余额超过100
        if(account.getMoney() < 100){
            System.out.println("您自己都没有钱，就别转了！");
            return;
        }
        while (true) {
            System.out.println("==============欢迎您进入黑马银行用户转账界面===============");
            System.out.println("请您输入转账的账户卡号：");
            Scanner sc = new Scanner(System.in);
            //todo 单独再实现卡号不存在
            String cardId = sc.next();
            Account friendAccount = selectAccountByCardId(cardId, list);
            if (friendAccount == null) {
                System.out.println("不存在该账户，请重新输入");
            }else {
                while (true) {
                    //todo 姓氏再单独实现
                    String name = friendAccount.getName();
                    System.out.println("您当前要为*" + name.substring(1) + "转账！");
                    System.out.println("请您输入姓氏确认：");
                    String firstName = sc.next(); //姓氏
                    if (!name.startsWith(firstName)) {
                        System.out.println("姓氏输入错误，请重新输入");
                    } else {
                        System.out.println("请输入要转账的金额");
                        int transferMoney = sc.nextInt();//业务扩展：判断是否超过余额 、 超过限额
                        //开始转账 当前账户减去transferMoney  对方账户加上transferMoney
                        account.setMoney(account.getMoney() - transferMoney);
                        friendAccount.setMoney(friendAccount.getMoney() + transferMoney);
                        System.out.println("转账成功了。。。。。。。。");
                        return;
                    }
                }
            }
        }
    }
    /**
     * 修改密码
     *      提醒用户认证当前密码。
     *      判断当前密码是否正确
     *      如果不正确,继续输入当前密码
     *      如果正确,输入新密码,和确认密码
     *      判断2次 密码是否一致 ,一致修改,不一致重新输入新密码
     */
    public void updatePassword(Account account){
        while (true) {
            System.out.println("===============欢迎您进入黑马银行密码修改界面================");
            System.out.println("请您输入当前账户的密码：");
            Scanner sc = new Scanner(System.in);
            String userPassword = sc.next();//用户输入的密码
            //判断密码是否正确的，正确的前提下才可以修改密码
            String okPassword = account.getPassword();
            if (!userPassword.equals(okPassword)) {
                System.out.println("当前账户密码不正确！");
            }else{
                //密码正确的情况下（扩展业务：两次密码必须一样）
                System.out.println("请输入新的密码");
                String password1 = sc.next();
                System.out.println("请输入确认的新的密码");
                String password2 = "";//
                //密码修改
                account.setPassword(password1);
                System.out.println("密码修改成功了，请您重新登录！");
                return;
            }
        }
    }


    /**
     * 注销(考虑2种可能性  账户没有注销-回到登录后页面   账户注销-回到首页 )
     *      确定是否要销户。
     *      否: 取消销户
     *      是:判断用户的账户中是否有钱
     *           没钱,销户 返回用户操作界面
     *           有钱,不销户
     */
    public boolean destoryAccount(Account account,ArrayList<Account> list){
        System.out.println("===============欢迎您进入黑马银行销户页面=======================");
        System.out.println("确定要删除账号吗？ y/n");
        Scanner sc = new Scanner(System.in);
        String isDel = sc.next();
        if(isDel.equals("n")){
            System.out.println("您取消了账户注销");
            return false;
        }else{
            double money = account.getMoney();
            String name = account.getName();
            if(money > 0){
                System.out.println("您的账户还有钱啊，不允许注销");
                return false;
            }else{
                list.remove(account);
                System.out.println(name+"账户，注销成功了");
                return true;
            }
        }

    }
}
