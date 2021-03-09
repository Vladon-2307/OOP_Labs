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
public class zadanie_ps {

    public static void Z_1(int a1, int a2) {
            ZadaniePs<Integer> max = (a, b) -> a.compareTo(b) >= 1 ? a : b;
            System.out.println(max.compar(12, 10));
    }

    public static void Z_2(int a1, int a2) {
        ZadaniePs<Integer> min = (a, b) -> a.compareTo(b) <= 1 ? a : b;
        System.out.println(min.compar(12, 10));
    }
}

interface ZadaniePs<T extends Comparable> {
    T compar(T a, T b);
}
