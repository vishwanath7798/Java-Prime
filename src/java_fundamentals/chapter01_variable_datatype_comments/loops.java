package java_fundamentals.chapter01_variable_datatype_comments;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
//        System.out.println("Hello World");
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
