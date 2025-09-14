package dsa.ConstructorEncapsulation;

public class Neggatron {
    private String name;
    private int age;
    private int empId;

    Neggatron(String name, int age, int empId){
        this.name=name;
        this.age=age;
        this.empId=empId;
    }

    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;

    }

    public String display(){
        return name + " " + age + " " + empId;
    }//void display

}//class negga
