import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số cần kiểm tra: ");
        int number = scanner.nextInt();

        if (checkPrime(number)) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not  a prime");
        }
    }

    public static boolean checkPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
                check = true;
            }
        }
        return check;
    }
}
