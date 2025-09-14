package oop.Cruz_shaun;

public class Student {
    //Attributes
    String Name;
    int yrLv;
    String position;

    void stdnt(){

        if(yrLv==1){
            position="st";
        } else if(yrLv==2){
            position="nd";
        } else if(yrLv==3){
            position="rd";
        } else if(yrLv>=4){
            position="th";
        }

        System.out.println("\n======================================");
        System.out.println("Welcome " + Name + "! You're now in " + yrLv + position + " year.");
        System.out.println("======================================");
    }
}
