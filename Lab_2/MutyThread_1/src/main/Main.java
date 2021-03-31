/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

import data.*;

/**
 *
 * @author vlado
 */
public class Main {

    public static RandomMas t;

    public static void z1() {
        List<Integer> mas = new ArrayList<>();
        mas.add(1);
        mas.add(2);
        mas.add(3);
        mas.add(4);
        mas.add(5);
        mas.add(6);
        ThreadNotEven NE = new ThreadNotEven(mas);
        ThreadEven E = new ThreadEven(mas);
        NE.start();
        E.start();
        try {
            NE.join();
            E.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static void z2() {
        t = new RandomMas(3, 3);

    }

    public static void z3() {
        new SortMas(t.getMas(), t.getX(), t.getY());
        int[][] mas = {{4, 4, 4},
        {3, 3, 3},
        {2, 2, 2}};
        //new SortMas(mas, 3, 3);
    }

    public static void main(String[] args) {
        z1();
        z2();
        z3();
    }

}
