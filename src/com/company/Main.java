package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int h = readVariebleH();
        int w = readVariebleW();
        draw(h , w);
    }
    private static int readVariebleH() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите h: ");
        int h = in.nextInt();
        return (int) h;
    }
    private static int readVariebleW() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите w: ");
        int w = in.nextInt();
        return (int) w;
    }
    public static void draw(int h, int w) {
        for(int i = h ; i > 0; i--) {//Внешний цикл перебирает строки вывода с h до 1
            for(int j = 0; j < w; j++)//Внутренний цикл перебирает элементы строки от 0 до w-1
                if(j / i % 2 == 0)//если элемент строки при делении на номер строки результат четный, то выводим "a"
                    System.out.print("a");
                else
                    System.out.print("b");//иначе выводим "b"
            System.out.println();
        }
    }
}

