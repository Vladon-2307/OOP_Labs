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
public class zadanieM_4 {

    public static void Z_1(Integer... v) {

        Zadanie4<Integer> Maxs =(v1) -> {
                int maxInt = v1[0];
                for (int v11 : v1) {
                    if (v11 > maxInt) {
                        maxInt = v11;
                    }
                }
                System.out.println("Максимальный элемент= " + maxInt);
            };
        Maxs.maxsimum(v);
    }
}

interface Zadanie4<T> {

    public void maxsimum(T[] v1);

}
