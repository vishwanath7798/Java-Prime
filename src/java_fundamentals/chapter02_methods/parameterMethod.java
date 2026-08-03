package java_fundamentals.chapter02_methods;

public class parameterMethod {
    public static void main(String args[]) {
        average(4,5);
    }
    static void average(int a, int b){
        int avg = (a+b)/2;
        System.out.println(avg);
    }
}
