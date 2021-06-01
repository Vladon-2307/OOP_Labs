/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.*;
import data.Z3.Krepesh;

/**
 *
 * @author vlado
 */
public class Main {

    public static void Z1() {
        Zadanie1 z1 = new Zadanie1(2);
        z1.start();
    }

    public static void Z2() {
        Zadanie2 z2 = new Zadanie2("E:\\OOP\\Labs\\Lab_2\\ThreadSynchronized\\resurse\\Z2 in.txt");
        z2.start();
    }

    public static void Z3() {
        Krepesh k = new Krepesh(50);
        k.start();
    }

    public static void main(String[] args) {
        //Z1();
        //Z2();
        Z3();
    }
}
