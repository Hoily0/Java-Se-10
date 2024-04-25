package entity;

public class Account {
    private int cardId;
    private String cardName;
    private double balance;
    private int limit;
    private String passWord;
    private String currentPassword;


    public Account() {
    }


    public Account(int cardId, String cardName, double balance, int limit, String passWord, String currentPassword) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.balance = balance;
        this.limit = limit;
        this.passWord = passWord;
        this.currentPassword = currentPassword;
    }

    /**
     * 获取
     * @return cardId
     */
    public int getCardId() {
        return cardId;
    }

    /**
     * 设置
     * @param cardId
     */
    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取
     * @return cardName
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * 设置
     * @param cardName
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * 获取
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 获取
     * @return limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * 设置
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String toString() {
        return "Account{cardId = " + cardId + ", cardName = " + cardName + ", balance = " + balance + ", limit = " + limit + ", passWord = " + passWord + "}";
    }

    /**
     * 获取
     * @return currentPassword
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * 设置
     * @param currentPassword
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
}
