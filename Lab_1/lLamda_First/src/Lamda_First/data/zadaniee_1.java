/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda_First.data;

/**
 *
 * @author vlado
 */
public class zadaniee_1 {

    public static void Z_1(int a1, int a2, int a3) {
        Zadanie_12 Summa = (x1, x2, x3) -> x1 + x2 + x3;
        System.out.println(a1 + "+" + a2 + "+" + a3 + "= " + Summa.calc(a1, a2, a3));
    }

    public static void Z_2(int a1, int a2, int a3) {
        Zadanie_12 Prizvidenie = (x1, x2, x3) -> x1 * x2 * x3;
        System.out.println(a1 + "*" + a2 + "*" + a3 + "= " + Prizvidenie.calc(a1, a2, a3));
    }

    public static void Zd_3(int a1) {
        Zadan_3 Factoria = (x1) -> {
            int rezult = 1;
            for (int i = 1; i <= x1; i++) {
                rezult *= i;
            }
            return rezult;
        };

        System.out.println(a1 + "! = " + Factoria.calc(a1));
    }

    public static void Z_4(int a1) {
        Zadane_4 Prostoe_Chisl = (int x1) -> {
            int temp = 0;
            boolean isPrime = true;
            for (int i = 2; i <= x1 / 2; i++) {
                temp = x1 % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                return x1 + " - простое число";
            } else {
                return x1 + " - составное число";
            }
        };
        System.out.println(Prostoe_Chisl.calcu(a1));
    }
}

interface Zadanie_12 {

    int calc(int x1, int x2, int x3);
}

interface Zadan_3 {

    int calc(int x1);
}

interface Zadane_4 {

    String calcu(int x1);
}
