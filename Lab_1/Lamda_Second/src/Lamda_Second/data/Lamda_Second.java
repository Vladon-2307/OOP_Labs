/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda_Second.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vlado
 */
public class Lamda_Second {

    public static void Z_1() {
        String s = "AAAccDDDccW";

        int upperCase = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCase++;
            }
        }
        System.out.println("В этом предложении общее КОЛИЧЕСТВО строчних букв =  " + upperCase);
    }

    public static void Z_2() {
        String[] Spisoc = {"Abs", "sder", "aer", "aert", "der"};
        for (String Spisoc1 : Spisoc) {
            if (Spisoc1.indexOf("A") == 0 && Spisoc1.length() == 3) {
                System.out.println(Spisoc1);
            }
        }
    }

    public static void Z_3() {
        List<String> Spisok = new ArrayList<>();
        Spisok.add("ASdasa");
        Spisok.add("ASwew");
        Spisok.add("CCVdww");
        Spisok.add("DWSDDS");
        Spisok.add("ASdDDDadsa");
        int index = 0;
        if (!Spisok.isEmpty()) {
            for (int i = 0; i < Spisok.size(); i++) {
                int upperCase1 = 0;
                int upperCase2 = 0;
                for (int y = 0; y < Spisok.get(index).length(); y++) {
                    if (Character.isUpperCase(Spisok.get(index).charAt(y))) {
                        upperCase1++;
                    }
                }
                for (int z = 0; z < Spisok.get(i).length(); z++) {
                    if (Character.isUpperCase(Spisok.get(i).charAt(z))) {
                        upperCase2++;

                    }
                }
                if (upperCase1 < upperCase2) {
                    index = i;
                }
            }
            System.out.println(Spisok.get(index));
        } else {
            System.err.println("Список пуст!");
        }
    }
}
