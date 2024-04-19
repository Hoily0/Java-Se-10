package com.itheima.com.itheima.case09;

import java.util.Scanner;

/**
 * 电影的业务操作类
 * 1.欢迎界面 让用户选择功能
 * 2.输出所有的电影信息功能
 * 3.根据电影id查询电影详情功能
 */
public class MovieOper {
    /**
     * 1.欢迎界面 让用户选择功能
     */
    public void show() {
        Movie[] movies = new Movie[5];
        Movie m1 = new Movie(1,"出拳吧，妈妈", 65.5, 7.9, "唐晓白", "谭卓", "致敬女性力量");
        Movie m2 = new Movie(2,"一点就到家", 55.5, 8.7, "徐宏宇", "刘昊然", "电商新时代");
        Movie m3 = new Movie(3,"月球陨落", 35.5, 5.9, "罗兰", "哈利", "脑洞大开");
        Movie m4 = new Movie(4,"小美人鱼的奇幻冒险", 25.5, 9.9, "思明", "未知", "奇幻梦境");
        Movie m5 = new Movie(5,"长津湖之水门桥", 95.5, 10, "徐克", "吴京", "七连风雪迎战");
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        movies[3] = m4;
        movies[4] = m5;

        while (true) {
            System.out.println("------------------欢迎进入电影信息系统--------------------------");
            System.out.println("1、查询全部电影信息");
            System.out.println("2、根据电影id查询电影详情");
            System.out.println("请您选择您要操作的功能：");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();//1 2 3..
            switch (type) {
                case 1:
                    //System.out.println("查询全部电影信息");
                    printAllMovies(movies);
                    break;
                case 2:
                    getMovieById(movies);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 2.输出所有的电影信息功能
     * 形参定义：将所有的电影对象通过数组传入
     *      数组定义的语法：数组的类型[] 名称 = {};
     *      数组获取元素的语法： 名称[索引]
     */
    public void printAllMovies(Movie[] movies) {
        System.out.println("---------------------输出所有的电影信息-----------------------------");
        //循环遍历数组得到每个电影对象
        for (int i = 0; i < movies.length; i++) {
            //再将电影对象中的属性进行输出
            Movie m = movies[i];
            System.out.println("m.getId() = " + m.getId());
            System.out.println("m.getName() = " + m.getName());
            System.out.println("m.getPrice() = " + m.getPrice());
            System.out.println("m.getScore() = " + m.getScore());
            System.out.println("m.getDirector() = " + m.getDirector());
            System.out.println("m.getActor() = " + m.getActor());
            System.out.println("m.getInfo() = " + m.getInfo());
            System.out.println("-------------------------------------");
        }
    }

    /**
     * 3.根据电影id查询电影详情功能
     */
    public void getMovieById(Movie[] movies){
        System.out.println("---------------------根据电影id查询电影详情功能-----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的电影编号：");
        int id = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            int movieId = m.getId();//每个电影对象中的id
            if(movieId == id){
                System.out.println("m.getId() = " + m.getId());
                System.out.println("m.getName() = " + m.getName());
                System.out.println("m.getPrice() = " + m.getPrice());
                System.out.println("m.getScore() = " + m.getScore());
                System.out.println("m.getDirector() = " + m.getDirector());
                System.out.println("m.getActor() = " + m.getActor());
                System.out.println("m.getInfo() = " + m.getInfo());
                flag = true;
                break;//跳出
            }
        }
        //提示没有找到对应的电影
        if(!flag){
            System.out.println("没有找到对应的电影........");
        }
    }
}
