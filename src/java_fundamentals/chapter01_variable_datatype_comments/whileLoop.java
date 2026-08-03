package java_fundamentals.chapter01_variable_datatype_comments;

import java.util.Scanner;

public class whileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean hasLearn = false;
        while (!hasLearn){
            System.out.println("went to school, tried to learn");
            System.out.println("Have you understood");
            hasLearn = sc.nextBoolean();
        }
    }
}
