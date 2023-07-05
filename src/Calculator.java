import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        int a = getValidInput(scanner);
        int b = getValidInput(scanner);
        int c = getValidInput(scanner);

        System.out.println("Enter the operator (+,-,*,/):");
        char operator = scanner.next().charAt(0);
        int result;

        switch (operator){
            case '+':
                result = a + b + c;
                System.out.println(a + "+" + b + "+" + c +"="+ result);
                break;
            case '-':
                result = a -b + c;
                System.out.println(a + "-" + b + "+" + c +"="+ result);
                break;
            case '*':
                result = a * b - c;
                System.out.println(a + "*" + b + "-" + c +"="+ result);
                break;
            case '/':
                result = a / (int) b * c;
                System.out.println(a + "/" + b +"*" + c +"="+ result);
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }

    }
    private static int getValidInput(Scanner scanner){
        int input;
        do {
            System.out.println("Enter a number (1-10):");
            while (!scanner.hasNext()) {
                System.out.println("Invalid input");
                scanner.next();
            }
            input = scanner.nextInt();
        }
        while (input<1 || input>10);
        return input;

    }

}
