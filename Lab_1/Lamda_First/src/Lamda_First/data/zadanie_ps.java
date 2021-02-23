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
            ZadaniePs<Integer> max = (x1) -> {
            if (a1 > x1) {
                return a1;
            }else if (a1<x1){
                return x1;
            }else {
                return 0;
            }
        } ;
        if(max.compareTo(a2)==0){
            System.out.println("Равны");
        }else System.out.println(max.compareTo(a2));
    }

    public static void Z_2(int a1, int a2) {
        ZadaniePs<Integer> min = (x1) -> {
            if (a1 > x1) {
                return x1;
            }else if (a1<x1){
                return a1;
            }else {
                return 0;
            }
        } ;
        if(min.compareTo(a2)==0){
            System.out.println("Равны");
        }else System.out.println(min.compareTo(a2));
    }
}

interface ZadaniePs<T> extends Comparable<T> {

    @Override
    public int compareTo(T x1);
}
