package oop.Samples;

public class SampleLang {
    public String name;
    public int age;

//    {//initializer - kahit san ilagay sya tlaga mauuna
//     String msg = "Ako muna!";
//        System.out.println(msg);
//    }

    //constructor
    public SampleLang(){
        System.out.println("i am a constructor");
    }

//    public SampleLang(String name, int age){
//        this.name = name;
//        this.age = age;
//        greet();
//    }

    public void greet(){
        System.out.println("Hello " + this.name);
    }//greet Method

    public void greet(String msg){
        System.out.println(msg);
    }

}//Class
