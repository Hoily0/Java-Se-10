package service;

import entity.Account;
import mapper.AtmMapper;

import java.util.ArrayList;

public class AtmService {

    static AtmMapper atmMapper = new AtmMapper();
    public static void loginAccount(){

    }

    public static ArrayList<Account> findAll(){

        if (atmMapper.findAll().equals("")){
            System.out.println("当前系统数据为空，请注册");

        }
        return atmMapper.findAll();
    }

    public  boolean registerAccount(String reName, String rePassword, String reCurrentPassword, int reLimit){

        return atmMapper.register(new Account());
    }
}
