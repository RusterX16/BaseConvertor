package dev.ruster.baseconvertor;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press 0 to exit");

        do {
            System.out.print("Décimal : ");
            int n = scan.nextInt();

            if(n == 0) {
                System.out.println("Merci, au revoir !");
                System.exit(0);
            }
            System.out.print("Hexadécimal : " + binaryValueOf(n) + "\n");
        } while(true);
    }

    public static @NotNull String binaryValueOf(int decimal) {
        boolean hasNext = true;
        String result = "";

        while(hasNext) {
            if(decimal <= 1) {
                hasNext = false;
            }
            result = result.concat(String.valueOf(decimal % 2));
            decimal -= decimal / 2 + (decimal % 2 == 0 ? 0 : 1);
        }
        return new StringBuilder(result).reverse().toString();
    }
}