package Calculator;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculatorIO in = new CalculatorIO();

        while(true) {
        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        in.setNumber1(num1);
        in.setNumber2(num2);

        SimpleCalculator scal = new SimpleCalculator();
        
        int additionResult = scal.sum(in.getNumber1(), in.getNumber2());
        int subtractionResult = scal.subtract(in.getNumber1(), in.getNumber2());
        int multiplicationResult = scal.multiply(in.getNumber1(), in.getNumber2());
        int divisionResult = scal.divide(in.getNumber1(), in.getNumber2());
        
        
       
        
        System.out.println("Enter your choice\n 1:addtion \n 2: subtration \n 3: multiplication \n 4:division \n");
        int value = sc.nextInt();
        switch (value) {
            case 1 ->  System.out.println(additionResult);
            case 2 -> System.out.println(subtractionResult);
            case 3 -> System.out.println(multiplicationResult);
            case 4 -> System.out.println(divisionResult);
            default -> System.out.println("Enter Correct Value");
        }
        
        }
        
        
       
    }
    

}
