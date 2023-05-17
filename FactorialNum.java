import java.util.Scanner;

public class FactorialNum {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = input.nextInt();
        int fact = 1;

        for(int i = num; i > 0; i--){
            System.out.print(i + "*");
            fact = fact * i;
        }
        System.out.print("\b=" + fact);

    }
}
