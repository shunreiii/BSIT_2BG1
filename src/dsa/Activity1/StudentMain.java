package dsa.Activity1;

public class StudentMain {
    public static void main(String[] args) {

        Student stdnt = new Student("Adrian", 20, "S001", "Computer Science");
        Student stdnt2 = new Student("Christian", 22, "S002", "Information Technology");

        //displays the initial data
        System.out.println("Initial StudentMain Data:");
        stdnt.displayInfo();
        stdnt2.displayInfo();

        //setter on student 1
        stdnt.setName("Adrian James");
        //setter on student 2
        stdnt2.setAge(23);
        stdnt2.setCourse("Software Engineering");

        System.out.println("Updated StudentMain Data (Using Getters):");
        System.out.println("Name: "+ stdnt.getName());
        System.out.println("Age: "+ stdnt.getAge());
        System.out.println("StudentMain ID: "+ stdnt.getStudentId());
        System.out.println("Course: "+ stdnt.getCourse());
        System.out.println("--------------------------");

        System.out.println("Name: "+ stdnt2.getName());
        System.out.println("Age: "+ stdnt2.getAge());
        System.out.println("StudentMain ID: "+ stdnt2.getStudentId());
        System.out.println("Course: "+ stdnt2.getCourse());
        System.out.println("--------------------------");




    }
}
