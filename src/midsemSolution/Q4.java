package MidsemSolution;
class Employee{
    private String name;
    private int age;
    private String dob;
    public Employee(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String generatePassword(){
        String []arr=name.split(" ");
        //arr={"aditya","prasad","sahu"}
        String[]arr2=dob.split("/");
        //arr2={"19","01","2001"}
        return arr[arr.length-1]+arr2[arr2.length-1];
    }
    public Student createStudent(String name, int age, String dob){
        return new Student(name,age,dob);
    }
    public void displayStudent(Student s){
        String [] arr=s.getName().split(" ");
        System.out.println("first name : "+arr[0]);
        System.out.println("middle name : "+arr[1]);
        System.out.println("last name : "+arr[2]);
        System.out.println("Dob : "+s.getDob());
        System.out.println("age : "+s.getAge());
    }
}
class Student{
    private String name;
    private int age;
    private String dob;
    public Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Employee e=new Employee("Aditya prasad sahu",18,"19/01/2001");
        System.out.println(e.generatePassword());
        Student s=e.createStudent("Aditya prasad sahu",18,"19/01/2001");
        e.displayStudent(s);
    }
}
