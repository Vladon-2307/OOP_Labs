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
public class zadani_3 {

    public static void z_1(int a1, int a2, int a3) {
        Zadanie3_12<Integer> Max = (Zadanie3_12) (x1, x2, x3) -> {
            int[] v1 = {x1, x2, x3};
            int maxInt = v1[0];
            for (int v11 : v1) {
                if (v11 > maxInt) {
                    maxInt = v11;
                }
            }
            System.out.println("Максимальный элемент= " + maxInt);
        };
        Max.Sortirovka(a1, a2, a3);
    }

    public static void z_2(int a1, int a2, int a3) {
        Zadanie3_12<Integer> Min = (Zadanie3_12) (x1, x2, x3) -> {
            int[] v1 = {x1, x2, x3};
            int maxInt = v1[0];
            for (int v11 : v1) {
                if (v11 < maxInt) {
                    maxInt = v11;
                }
            }
            System.out.println("Минимальный элемент= " + maxInt);
        };
        Min.Sortirovka(a1, a2, a3);
    }
}

interface Zadanie3_12<T> {

    public void Sortirovka(int x1, int x2, int x3);
}
