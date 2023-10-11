package Test.java;

public class Maths {
    int addTwoNumbers(int one, int two) {
        return one + two;
    }
    public boolean checkPrime(int Number){
        boolean flag = true;
        for(int i = 2; i < Number/2; i++){
            if(Number % i ==0){
                flag = false;
            }
        }
        return flag;
    }
}
