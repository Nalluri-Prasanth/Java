import java.util.Scanner;

public class FirstLastDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int lastDigit = number % 10;

        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        System.out.println(firstDigit + lastDigit);
        sc.close();
    }
    // write your code here
}