package by.tatevik.week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     printMTable();
     calcCoordinates();
    }
    public static void printMTable(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
    public static void calcCoordinates(){
        int x1, x2, y1, y2, e, f, d, g, h;
        Scanner tt = new Scanner(System.in);
        System.out.println("Введите координаты точки А");
        System.out.print(" Введите координаты X1:");
        x1=tt.nextInt();
        System.out.print(" Введите координаты X2:");
        x2=tt.nextInt();
        System.out.println("Введите координаты точки Б");
        System.out.print(" Введите координаты Y1:");
        y1=tt.nextInt();
        System.out.print(" Введите координаты Y2:");
        y2=tt.nextInt();
        e=x2-x1;
        f=y2-y1;
        d=(int) Math.pow(e,2);
        g=(int) Math.pow(f,2);
        h=(int) Math.sqrt(d+g);
        System.out.print("Расстояние от точки А к точки Б = "+h);
    }
}

