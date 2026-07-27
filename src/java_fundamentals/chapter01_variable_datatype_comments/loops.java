package java_fundamentals.chapter01_variable_datatype_comments;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println("Hello World");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
