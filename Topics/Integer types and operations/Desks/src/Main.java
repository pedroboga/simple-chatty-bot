import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int desks = (int) Math.ceil(number1 / 2.0) + (int) Math.ceil(number2 / 2.0) + (int) Math.ceil(number3 / 2.0);
        System.out.println(desks);
    }
}