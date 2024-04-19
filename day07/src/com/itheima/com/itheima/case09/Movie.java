package com.itheima.com.itheima.case09;

/**
 * 电影实体类 -定义对象的结构-电影交给电影对象处理
 */
public class Movie {
    //私有成员变量-对象的属性
    //电影编号(id)
    private int id;
    //电影名称(name)
    private String name;
    //电影价格(price)
    private double price;
    //电影分数(score)
    private double score;
    //电影导演(director)
    private String director;
    //电影主演(actor)
    private String actor;
    //电影简介(info)
    private String info;

    //构造方法（无参 有参都加上）
    public Movie() {
    }

    public Movie(int id, String name, double price, double score, String director, String actor, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.director = director;
        this.actor = actor;
        this.info = info;
    }
    //针对私有成员变量 提供get set方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
