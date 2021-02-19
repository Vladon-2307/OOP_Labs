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
public class zadanie_2 {

    public static void Z_12(int a1) {
        Zadanie_2_12 Chotnost = x1 -> {
            if (x1 % 2 == 0) {
                return x1 + " -четное";
            } else {
                return x1 + " -не четное";
            }
        };
        System.out.println(Chotnost.calculate(a1));
    }

    public static void Z_3(int a1, int a2, int a3) {
        Zadanie_2_3 Diapozon = (d1, d2, ch) -> {
            if (d1 < ch && ch < d2) {
                return "чесло " + ch + " входит в диапозон от " + d1 + " до " + d2;
            } else {
                return "чесло " + ch + " не входит в диапозон от " + d1 + " до " + d2;
            }
        };
        System.out.println(Diapozon.calculate(a1, a2, a3));
    }

    public static void Z_4(int a1, int a2) {
        Zadanie_2_4 Kratnost = (A, x2) -> {
            if (A % x2 == 0) {
                return x2 + " кратно " + A;
            } else {
                return x2 + " не кратно " + A;
            }
        };
        System.out.println(Kratnost.calculate(a1, a2));
    }
}

interface Zadanie_2_12 {

    String calculate(int x1);
}

interface Zadanie_2_3 {

    String calculate(int d1, int d2, int ch);
}

interface Zadanie_2_4 {

    String calculate(int A, int x2);
}
