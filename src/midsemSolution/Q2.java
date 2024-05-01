package MidsemSolution;

import java.util.*;

class MyComparator implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
class Car implements Comparable<Car>{
    String modelNo;
    String name;
    int price;
    public Car(String modelNo, String name, int price) {
        this.modelNo = modelNo;
        this.name = name;
        this.price = price;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int compareTo(Car car) {
        if (this.price < car.getPrice()) {
            return -1;
        }
        else if (this.price == car.getPrice()) {
            return 0;
        }
        else
            return 1;
    }
    public String toString() {
        return modelNo + " " + name + " " + price;
    }
    public boolean equals(Car car) {
        return price==car.getPrice();
    }
}
public class Q2 {
    public static boolean search(ArrayList<Car>arr,Car car){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals(car))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Car>carShowroom=new ArrayList<Car>();
        carShowroom.add(new Car("Ford_10", "Ford", 100));
        carShowroom.add(new Car("Ford_20", "Ford", 200));
        carShowroom.add(new Car("Ford_30", "Ford", 300));
        carShowroom.add(new Car("Ford_40", "Ford", 600));
        carShowroom.add(new Car("Ford_50", "Ford", 500));
        MyComparator comparator=new MyComparator();
        Collections.sort(carShowroom,comparator);
        System.out.println(carShowroom);
        Car x=new Car("Ford_10", "Ford", 100);
        if(search(carShowroom,x))
            System.out.println("Car found");
    }
}
