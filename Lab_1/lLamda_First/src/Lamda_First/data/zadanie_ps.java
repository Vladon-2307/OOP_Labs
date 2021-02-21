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
public class zadanie_ps{
    public static void Z_1(int a1, int a2){
        ZadaniePs max = (ZadaniePs) (int x1, int x2) -> {
            if(x1>x2) System.out.println("Max= "+x1);
            else if(x1<x2) System.out.println("Max= "+x2);
            else System.out.println(x1 +" = "+x2);
        };
        max.sort(a1, a2);
    }
    
    public static void Z_2 (int a1, int a2){
        ZadaniePs min = (ZadaniePs) (int x1, int x2) -> {
            if(x1<x2) System.out.println("Min= "+x1);
            else if(x1>x2) System.out.println("Min= "+x2);
            else System.out.println(x1 +" = "+x2);
        };
        min.sort(a1, a2);
    }
}

interface ZadaniePs<T> {
    public <t> void sort(int x1, int x2);
}

