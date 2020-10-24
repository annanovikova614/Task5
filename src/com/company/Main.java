package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int h = readVariable("h");
        int w = readVariable("w");
        drawPicture(h, w);
    }
    private static int readVariable(String variable) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s: ", variable);
        return scanner.nextInt();
    }

    public static void drawPicture(int h, int w) {
        for(int i = h ; i > 0; i--) {
            for(int j = 0; j < w; j++) {
                if(j / i % 2 == 0)
                {
                    System.out.print("a");
                }
                else
                {
                    System.out.print("b");
                }
            }
            System .out.println();
        }
    }
}
