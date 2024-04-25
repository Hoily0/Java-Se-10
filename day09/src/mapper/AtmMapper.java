package mapper;

import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmMapper {

    ArrayList<Account> accounts = new ArrayList<>();
    public ArrayList<Account> findAll(){
        return accounts;
    }

    public boolean register(Account account) {
        boolean flag = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("------请输入id------");
            int cardId = sc.nextInt();
            System.out.println("------请输入用户名------");
            String cardName = sc.next();
            System.out.println("------请输入余额------");
            double balance = sc.nextDouble();
            System.out.println("------请输入每次限额------");
            int limit = sc.nextInt();
            System.out.println("------请输入账号密码------");
            String passWord = sc.next();
            System.out.println("------请输入二次密码------");
            String currentPassword = sc.next();

            Account account1 = new Account(cardId, cardName, balance, limit, passWord, currentPassword);
            accounts.add(account1);
        if (!flag){
            System.out.println("有误");
        }
        return flag;
    }

    public ArrayList<Account> addAccount(){
        return accounts;
    }




}
