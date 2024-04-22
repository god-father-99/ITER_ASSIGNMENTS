package Generics_And_Collections;

class Car implements Comparable<Car>{
    private String model;
    private String color;
    private int speed;
    public Car(String model, String color, int speed) {
        super();
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public int compareTo(Car o) {
        if(o.getSpeed()>speed)
            return 1;
        else if(o.getSpeed()==speed)
            return 0;
        return -1;
    }

}
public class Q3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car c1=new Car("Pagani","green",300);
        Car c2=new Car("Konisegg","white",442);
        if(c1.compareTo(c2)==1)
            System.out.println(c1.getModel()+" is more faster");
        else
            System.out.println(c2.getModel()+" is more faster");;
    }

}

