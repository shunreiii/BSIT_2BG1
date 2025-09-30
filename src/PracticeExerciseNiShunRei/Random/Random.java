package PracticeExerciseNiShunRei.Random;

public class Random {
    public static void main(String[] args) {

        int x = 0, y = 3, z;

        System.out.println(x++);
        z = ++x - (y++) * (--y);
        System.out.println(z);
        System.out.println("x" + (z--));
        System.out.println("y++");
        System.out.println(y++);
        System.out.println(x + (++y) + z--);

    }
}