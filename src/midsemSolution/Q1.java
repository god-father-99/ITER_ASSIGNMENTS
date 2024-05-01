package MidsemSolution;
interface Shape{
    double area();
    double perimeter();
}
class rectangle implements Shape{
    private double a;
    private double b;
    rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }
    public double area(double a,double b) {
        return a*b;
    }

    @Override
    public double perimeter(){
        return 2*(a+b);
    }
    public double perimeter(double a,double b){
        return 2*(a+b);
    }
}
class circle implements Shape{
    private double r;
    circle(double r){
        this.r = r;
    }
    @Override
    public double area(){
        return Math.PI*r*r;
    }
    public double area(double r){
        return Math.PI*r*r;
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*r;
    }
    public double perimeter(double r){
        return 2*Math.PI*r;
    }
}
public class Q1 {
    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.perimeter(5));
        System.out.println(c.area(5));
        rectangle r=new rectangle(2,3);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.area(2,3));
        System.out.println(r.perimeter(2,3));
    }
}
