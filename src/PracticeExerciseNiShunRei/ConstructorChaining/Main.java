package PracticeExerciseNiShunRei.ConstructorChaining;

public class Main {
    public static void main(String[] args) {
        FuckYou fuck = new FuckYou();
        FuckYou fuck1 = new FuckYou("Shaun");
        FuckYou fuck2 = new FuckYou("Shaun", "Cruz" );
        FuckYou fuck3 = new FuckYou("Shaun", "Cruz", 20);


        fuck.display();
        fuck1.display();
        fuck2.display();
        fuck3.display();

    }
}
