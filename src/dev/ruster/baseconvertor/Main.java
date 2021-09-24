package dev.ruster.baseconvertor;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Décimal : ");
            int n = scan.nextInt();

            if(n == 0) {
                System.out.println("Merci, au revoir !");
                System.exit(0);
            }
            System.out.print("Binaire : " + binaryValueOf(n) + "\n");
        } while(true);
    }

    public static String binaryValueOf(int decimal) {
        boolean hasNext = true;
        String result = "";

        while(hasNext) {
            if(decimal <= 1) {
                hasNext = false;
            }
            result = result.concat(String.valueOf(decimal % 2));
            decimal -= decimal % 2 == 0 ? decimal / 2 : (decimal / 2) + 1;
        }
        String reversedResult = "";

        for(int i = 0; i < result.length(); i++) {
            reversedResult = reversedResult.concat(String.valueOf(result.charAt(result.length() - 1 - i)));
        }
        return reversedResult;
    }

    public static String hexValueOf(int decimal) {
        String binaryValue = binaryValueOf(decimal);

        for(int i = 0; i < binaryValue.length(); i++) {

        }
        return "";
    }
}