import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int maximum = 0;
        int elements = scanner.nextInt();
        for (int i = 1; i <= elements; i++) {
            int valor = scanner.nextInt();
            int result = valor % 4;
            if (result == 0) {
                if (valor > maximum) {
                    maximum = valor;
                }
            }
        }
        System.out.println(maximum);
    }
}