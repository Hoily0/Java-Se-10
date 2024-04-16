package work.day7.entity;

public class GirlFriend {
    private String name ;
    private double high;
    private double weight;


    public String wash(){
        return "洗衣服";
    }

    public String cook(){
        return "做饭";
    }
    public String human(){
        return "女朋友";
    }


    public void show(){

        System.out.println("我" + human()+ name + ",身高" + high + "厘米，体重" + weight + "斤");

    }

    public GirlFriend(String name, double high, double weight) {
        this.name = name;
        this.high = high;
        this.weight = weight;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
