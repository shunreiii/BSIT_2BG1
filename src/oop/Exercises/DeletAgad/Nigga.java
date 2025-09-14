package oop.Exercises.DeletAgad;

public class Nigga {
    private String make, model;
    private int year, speed;

    Nigga(){
        make = "Ford";
        model = "Mustang";
        year = 1969;
        speed = 0;
    }

    public void accelerate(int acceleration){
        this.speed += acceleration;
        System.out.println("Accelerating by " + acceleration + " km/h");
        System.out.println("Current Speed: " + this.speed + " km/h\n");
    }

    public void brake(int brake){
        if((this.speed - brake) < 0){
            System.out.println("Applying brake by " + brake + " km/h");
            System.out.println("Current Speed: 0 km/h (Speed cannot go below 0)\n" );
            this.speed = 0;
        }
        else {
            this.speed -= brake;
            System.out.println("Applying brake by " + brake + " km/h");
            System.out.println("Current Speed: " + this.speed + " km/h\n");
        }
    }

    public void displayInfo(){
        System.out.println("======================================");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("======================================\n");
    }

    public void menu(){
        System.out.println("""
                1. Accelerate
                2. Break
                3. Display Info
                0. Exit\n""");
    }

}
