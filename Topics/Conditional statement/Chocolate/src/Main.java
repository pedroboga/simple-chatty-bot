import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int valueN = scanner.nextInt();
        int valueM = scanner.nextInt();
        int valueK = scanner.nextInt();
        String result = "";
        if (valueK % valueN == 0 || valueK % valueM == 0) {
            if (valueK % valueN == 0 && valueK / valueN <= valueM) {
                System.out.println("YES");
            } else if (valueK % valueM == 0 && valueK / valueM <= valueN) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}