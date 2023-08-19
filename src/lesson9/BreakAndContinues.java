package lesson9;

public class BreakAndContinues {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Это нечетное число " + i);
        }
    }
}
