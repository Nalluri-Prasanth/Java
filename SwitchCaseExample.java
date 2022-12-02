public class SwitchCaseExample {

    public static void main(String[] args) {

        char value = 'A';
        // Traditional Switchcase
        switch (value) {
            case 'A':
                System.out.println("this is A");
                break;
            case 'B':
                System.out.println("this is B");
                break;
            default:
                System.out.println("Nothing Prints");
                break;

        }
        String quater = "MAY";
        // Enhanced switchcase

        switch (quater) {
            case "JANUARY", "FEBRUARY", "MARCH" -> System.out.println("Quarter 1");
            case "APRIL", "MAY", "JUNE" -> System.out.println("Quarter 2");

            default -> System.out.println("Nothing Prints");
        }

    }
}