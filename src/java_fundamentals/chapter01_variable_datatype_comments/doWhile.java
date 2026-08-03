package java_fundamentals.chapter01_variable_datatype_comments;

import java.util.Scanner;

public class doWhile {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
//        while (i<=5){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("out of the loop");
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
        System.out.println("out of the loop");

    }
}
