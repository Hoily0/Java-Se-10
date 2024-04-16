package work.day7.entity;

public class Manager {

    private String name;
    private int id;
    private Double salary;
    private int bonus;

    public void work(){

    }

    public Manager(){
                                    //空参构造
    }

    public Manager(String name, int id, double salary, int bonus){
        this.name = name;
        this.id = id;
        this.salary = salary;                           //有参构造
        this.bonus = bonus;
    }

    public void setName(String name){                   //set方法
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public int getBonus(){
        return bonus;
    }



}
