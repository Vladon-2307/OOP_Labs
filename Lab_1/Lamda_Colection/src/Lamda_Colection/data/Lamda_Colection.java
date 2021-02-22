/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda_Colection.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vlado
 */
public class Lamda_Colection {

    public static void Z_1() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(-3);
        list.add(6);
        list.add(-8);
        list.add(0);
        Integer max = list.stream().reduce(Integer::max).get();
        Integer min = list.stream().reduce(Integer::min).get();
        System.out.println("Max= " + max + " Min= " + min);
    }

    public static void Z_2() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(-3);
        list.add(-6);
        list.add(-8);
        list.add(0);
        list.add(3);
        list.add(6);
        list.add(8);
        Integer min = list.stream().filter(x -> x < 0).reduce((a, b) -> Integer.min(a, b)).get();
        System.out.println("Минимальное отрицательное число= " + min);
    }
    
    public static void Z_3(){
        List<String> list = new ArrayList<>();
        list.add("122");
        list.add("33");
        list.add("62");
        list.add("83");
        list.add("111");
        list.add("3232");
        list.add("632");
        list.add("832");
        int MAX = list.stream().mapToInt((s) -> Integer.parseInt(s)).sum();
        System.out.println(MAX);
    }
}
