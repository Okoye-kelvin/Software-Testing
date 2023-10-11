package Test.java;

public class Fib {
    int first = 0;
    int second = 1;
    int next;
    public Fib(int Numbers){
        for (int i = 0; i < Numbers; i++ ){
            if (i < 2){
                System.out.println(i);
            }
            else {
                next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
