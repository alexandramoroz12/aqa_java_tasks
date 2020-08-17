package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */

    public static void main(String[] args) {
        System.out.println(min(5,2,3));
    }

    public static int min(int a, int b, int c) {

        int min_value;

        if (a <= b || a <= c) {min_value = a;}
        else
        if (b <= a || b <= c) {min_value = b;}
        else min_value = c;

        return min_value;
    }

}
