package work.day7.entity;

public class Cat {
    private String color;
    private String breed;


    public String  eat(){
        return "吃鱼……";
    }
    public String catchMouse(){
        return "抓老鼠……";
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

    public Cat(){

    }

    public Cat(String color, String breed){
        this.color = color;
        this.breed = breed;
    }
}

