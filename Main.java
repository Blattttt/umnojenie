package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый множитель");
        int Fir = in.nextInt();

        System.out.println("Введите второй множитель");
        int Sec = in.nextInt();

        float Umn = (float)Fir / (1/(float)Sec);
        System.out.println("Произведение = " + Math.round(Umn));
    }
}
