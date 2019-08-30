package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        arrayFowardBack(); // Задача №1 - масссив печать вперед-назад
        array13_17(); // Задача №2 - массив 100 элементов, деление на 13, 17
        arrayRandom3(); // Задача №4 - массив три случайных числа
        arrayButterfly(); // Задача №5 - массив бабочка
        simpleNumber(); // Задача №9 - простое число
        factorial(); // Задача №10 - факториал for
        factorialWhile(); // Задача №10 - факториал while
        cards(); // Задача №7 - случайная карта
        sumMinMax(); // Задача №3 - сумма между минимумом и максимумом
        equals(); // Задача №6 - равенство массивов
    }
    public static void arrayFowardBack() { // Задача №1 - масссив печать вперед-назад
        int array[] = {1,2,3,4,5};
        for (int i=0; i<5; i++) {
            System.out.print(array[i]+" ");
        }
        for (int i=4;i>=0;i--) {
            System.out.print(array[i]+" ");

        }
    }
    public static void array13_17() {  // Задача №2 - массив 100 элементов, деление на 13, 17
        int[] array = new int[100];
        int index = 0;
        System.out.println();
        for (int i = 0; ; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                int number = i;
                array[index] = number;
                System.out.print(array[index]+" ");
                index++;
                if (index==100){
                    break;
                }
            }
        }
    }
    public static void arrayRandom3(){ // Задача №4 - массив три случайных числа
        System.out.println();
        int rand=0;
        int[] array = new int [3];
        for(int i=0; i<array.length; i++){
            rand=10+ (int)( Math.random()*90);
            array[i]=rand;
            System.out.print(array[i]+" ");
        }
        if (array[0]<array[1]&&array[1]<array[2]) {
            System.out.print("Массив возрастающий");
        }
    }

    public static void arrayButterfly() { // Задача №5 - массив бабочка

        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n");
            for(int j=0; j<array[i].length;j++) {
                if (i == 0) {
                    array[0][j] = 1;
                    System.out.print(array[i][j]);
                }
                else if (i == 1) {
                    array[1][0] = 0;
                    array[1][1] = 1;
                    array[1][2] = 1;
                    array[1][3] = 1;
                    array[1][4] = 0;
                    System.out.print(array[i][j]);

                }
                else if (i == 2) {
                    array[2][0] = 0;
                    array[2][1] = 0;
                    array[2][2] = 1;
                    array[2][3] = 0;
                    array[2][4] = 0;
                    System.out.print(array[i][j]);
                }
                else if (i == 3) {
                    array[3][0] = 0;
                    array[3][1] = 1;
                    array[3][2] = 1;
                    array[3][3] = 1;
                    array[3][4] = 0;
                    System.out.print(array[i][j]);
                }
                else if (i == 4) {
                    array[4][j] = 1;
                    System.out.print(array[i][j]);
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void simpleNumber() { // Задача №9 - простое число
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = cs.nextInt();
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                index++;
            }
        }
        if (index == 2) {
            System.out.println("Число простое");
        } else {
            System.out.print("Число составное");
        }
        System.out.println();
    }

    public static void factorial(){ // Задача №10 - факториал for
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = cs.nextInt();
        long fact=1;
        for(int i=1; i<=(x); i++ ){
            fact*=i;
        }
        System.out.println("Факториал числа "+x+" равен: "+fact);

    }
    public static void factorialWhile(){  // Задача №10 - факториал while
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите число:");
        int x1 = cs.nextInt();
        int step=1;
        long fact1 = 1;
        while(step<=x1) {
            fact1*=step;
            step++;
        }
        System.out.println("Факториал числа "+x1+" равен: "+fact1);
    }
    public static void cards(){   // Задача №7 - случайная карта
        String [] card = {"Six", "Seven","Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        Random rand= new Random();
        int rand1=rand.nextInt(9);
        System.out.println("Ваша карта:");
        System.out.print(card[rand1]+" of ");
        String [] color = {"Hearts", "Spades", "Clubs", "Diamonds"};
        Random random=new Random();
        int rand2=random.nextInt(4);
        System.out.println(color[rand2]);

    }
    public static void sumMinMax(){ // Задача №3 - сумма между минимумом и максимумом
        int arr[] = {0,2,3,9,1,1,1,0,1,2,9};
        int min, max;
        min=max=arr[0];
        for(int i=1; i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
            else if (arr[i]>max) {
                max=arr[i];
            }
        }
        int summa=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==min) {
                int next=i+1;
                for(int x=next;arr[x]<max;x++){

                    summa+=arr[x];
                }
            }
        }
        System.out.println("Сумма равна: " +summa);
    }
    public static void equals(){  // Задача №6 - равенство массивов
        int arr1 [] [] ={
                {4,5,6},{1,2,3},{7,8,9}
        };
        int arr2 [] [] = {
                {5,4,6}, {1,3,2} , {9,8,7}
        };
        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[0].length; j++){
                if (arr1 [i][j]==arr2[i][j]){
                    System.out.println("Элементы массива по индексам ["+i+"] ["+j+"] равны");
                }
            }
        }

    }
}
