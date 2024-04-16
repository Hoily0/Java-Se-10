package work.day7.entity;

public class Dog {
    private String color;
    private String breed;

    public void eat(){
        System.out.println(color + "的" + breed + "正在啃骨头……");
        System.out.println(color + "的" + breed + "正在看家……");
    }
    public void lookHome(){
        System.out.println();
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getColor(){
        return color;
    }
    public String getBreed(){
        return breed;
    }

    public Dog(){

    }

    public Dog(String color, String breed){
        this.color = color;
        this.breed = breed;

    }
}
