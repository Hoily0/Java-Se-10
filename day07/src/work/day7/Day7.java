package work.day7;

import work.day7.entity.*;

public class Day7 {
    public static void head1(){
        Phone phone = new Phone();
        phone.setBrand("苹果");
        phone.setPrice(3799);
        phone.setColor("红");

        System.out.println("正在使用价格为" + phone.getPrice() + "元" + phone.getColor() + "的" + phone.getBrand() + phone.sendMessage());

        System.out.println("正在使用价格为" + phone.getPrice() + "元" + phone.getColor() + "的" + phone.getBrand() + phone.call());
    }




    public static void head2(){

        GirlFriend girlFriend = new GirlFriend("凤姐", 155, 130);

        girlFriend.show();
        System.out.println(girlFriend.human() + "帮我" +girlFriend.wash() );
        System.out.println(girlFriend.human() + "给我" +girlFriend.cook());

    }



    public static void head3(){

        Manager manager = new Manager("项目经理", 123, 15000, 600);
        Coder coder = new Coder("程序员", 125, 10000);

        System.out.println("工号为" + manager.getId() + "基本工资为" + manager.getSalary() + "奖金为"
                + manager.getBonus() + "的" + manager.getName() + "正在努力的做着管理工作，分配任务，检查员工提交上来的代码…………");

        System.out.println("工号为" + coder.getId() + "基本工资为" +coder.getSalary() + "的" + coder.getName() + "正在努力的写着代码…………");


    }


    public static void head4() {

        Cat cat = new Cat("花色", "波斯猫");

        System.out.println(cat.getColor() + "的" + cat.getBreed() + "正在"+ cat.eat());
        System.out.println(cat.getColor() + "的" + cat.getBreed() + "正在"+ cat.catchMouse());

        Dog dog = new Dog("黑色", "藏獒");

        dog.eat();
        dog.lookHome();
    }
}
