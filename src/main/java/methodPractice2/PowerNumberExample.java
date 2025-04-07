package methodPractice2;

import java.util.Scanner;

public class PowerNumberExample {

    public static void main(String[] args) {
         //recursive üs alma

        Scanner scanner=new Scanner(System.in);

        System.out.print("Taban değeri girin:");
        int base= scanner.nextInt();

        System.out.print("üs değeri girin:");
        int power= scanner.nextInt();

        int result=power(base,power);

        System.out.println(base + " ^"+ power +"="+ result);
    }
    private static int power(int base, int power){
        if (power==0) return 1;
        return base*power(base,power-1);
    }
}
