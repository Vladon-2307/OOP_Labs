/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda_Second.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/**
 *
 * @author vlado
 */
public class Lamda_Second {

    public static void Z_1() {
        String s = "AAAccDDDccW";
        int upperCase;
        upperCase = (int) s.chars().sorted().filter(new IntPredicate() {
            @Override
            public boolean test(int s) {
                return s < 65 || s > 90;
            }
        }).count();
        System.out.println("В этом предложении общее количество строчных букв =  " + upperCase);
    }

    public static void Z_2() {
        String[] Spisoc = {"Abs", "sder", "aer", "art", "der"};
        Arrays.stream(Spisoc).filter(s -> s.indexOf("a") == 0 && s.length() == 3).forEachOrdered(s -> System.out.println(s + " "));

        //System.out.println(Rezult);
    }

    public static void Z_3() {
        List<String> Spisok = new ArrayList<>();
        Spisok.add("ASdaa");
        Spisok.add("ASwew");
        Spisok.add("CCVdww");
        Spisok.add("DWSDDS");
        Spisok.add("ASdDDDadsa");

        System.out.println(Spisok.stream().sorted((o1, o2) -> {
            int a1 = UperCase(o1);
            int a2 = UperCase(o2);
            if(a1>a2)return 1;
            else if(a1<a2)return -1;
            else return 0;
        }).findFirst().get());
    }

    public static int UperCase(String s) {
        
        int upperCase;
        upperCase = (int) s.chars().sorted().filter((int s1) -> s1 <= 65 || s1 >= 90).count();
        return upperCase;
    }
}
