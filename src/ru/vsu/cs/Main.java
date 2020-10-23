package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = readSize();
        printShape(size);
    }

    private static int readSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        return scanner.nextInt();
    }

    public static String multiplyCharNTimes(char c, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(c);
        }
        return result.toString();
    }

    private static void printTopOrBottomLane(int size) {
        System.out.println(multiplyCharNTimes('*', size));
    }

    private static void printSecondTopOrBottomLane(int size) {
        System.out.print('*');
        System.out.print(multiplyCharNTimes('#', size - 2));
        System.out.println('*');
    }

    private static void printBody(int size) {
        System.out.print("*#");
        System.out.print(multiplyCharNTimes(' ', size - 4));
        System.out.println("#*");
    }

    private static void printShape(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(multiplyCharNTimes(' ', i));
            if ((i == 0) || (i == size-1))
                printTopOrBottomLane(size);
            else if ((i == 1) || (i == size - 2))
                printSecondTopOrBottomLane(size);
            else
                printBody(size);
        }
    }
}
