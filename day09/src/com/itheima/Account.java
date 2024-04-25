package com.itheima;

/**
 * 账户实体类(对象结构-对象的属性、构造方法、私有属性的set get)
 *      卡号 cardId
 *      姓名 name
 *      密码 password
 *      余额 money
 *      取现限额 limit
 */
public class Account {
    //对象的属性
    private String cardId;

    private String name;

    private String password;

    private double money;

    private int limit;//ATM取款不能取零钱 必须整百

    //构造方法

    public Account() {
    }

    public Account(String cardId, String name, String password, double money, int limit) {
        this.cardId = cardId;
        this.name = name;
        this.password = password;
        this.money = money;
        this.limit = limit;
    }
//私有属性的set get

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
