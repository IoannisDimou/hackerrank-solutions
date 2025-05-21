package hackerrank.solutions.javapractice;

import java.util.Scanner;

public class JavaIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String result = "";

        if ((N & 1) == 1) {
            result = "Weird";

        }else {
            if (N >= 2 && N <= 5) {
                result = "Not Weird";
            }else if (N >= 6 && N <= 20) {
                result = "Weird";
            }else  {
                result = "Not Weird";
            }
        }

        scanner.close();

        System.out.println(result);

    }
}
