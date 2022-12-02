import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str, strrev = "";
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        for (int i = str.length() - 1; i >= 0; i++) {
            strrev += str.charAt(i);
        }
        if (strrev.equalsIgnoreCase(str))
            System.out.println("is a Palindrome");
        else
            System.out.println("Not a palidrome");

        sc.close();
    }

}