package java_fundamentals.chapter01_variable_datatype_comments;

import java.util.Scanner;

public class breakandcontinue {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i+=2) {
//            System.out.println(i);
////            if(i>=10)break;
//        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
