package dsa.Activity1;

public class Student {

    //AGE
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //NAME
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //STUDENTID
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    //COURSE
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    private String name;
    private int age;
    private String studentId;
    private String course;

    //constructor
    Student(String name, int age, String studentId, String course) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.course = course;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("StudentMain Id: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("--------------------------");
    }



}
