package dsa.ConstructorEncapsulation;

public class Niga {
    public static void main(String[] args) {
        Neggatron niggs = new Neggatron("tristanNigga", 19, 1234);

        System.out.println(niggs.display());

        niggs.setName("mico");
        System.out.println(niggs.display());

    }//psvm
}