/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda_Second.data;

import java.util.Scanner;

/**
 *
 * @author vlado
 */
public class Lamda_Second {

    public static void Z_1() {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String s = in.nextLine();

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
}
