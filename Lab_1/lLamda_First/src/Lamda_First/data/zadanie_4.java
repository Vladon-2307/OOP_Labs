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
public class zadanie_4 {

    public static void Z_1(int... v) {
        
        Zadanie4 MAX = v1->{
        int maxInt = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maxInt) {
                maxInt = v[i];
            }
        }
            System.out.println("Максимальный элемент= "+ maxInt);
        };
        MAX.max(v);
    }
}

interface Zadanie4 {
    void max(int[] v1);
}