public class MethodOverloading {

    public static void main(String[] args) {
        double newGrade = calcGrade(21, 9.4);
        System.out.println("My total marks is " + newGrade);

        calcGrade(8.6);
    }

    public static double calcGrade(String name, double grade) {
        System.out.println("My name is clear" + name + " my CGPA is " + grade);
        return grade * 100;
    }

    public static double calcGrade(double grade) {
        System.out.println("My CGPA is " + grade);
        return grade * 100;
    }

    public static double calcGrade(int age, double grade) {
        System.out.println("my age is " + age + " My current CGPA is " + grade);
        return grade * 100;
    }

}
