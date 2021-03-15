/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda_Colection.data;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author vlado
 */
public class Abiturient {

    public String FIO;
    public int o1;
    int o2;
    int o3;

    public Abiturient(String FIO, int o1, int o2, int o3) {
        this.FIO = FIO;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }

    public List<Integer> get() {
        List<Integer> oc = new ArrayList<>();
        oc.add(o1);
        oc.add(o2);
        oc.add(o3);
        return oc;
    }
    

    public static void tostring(Abiturient s) {
        System.out.println(s.FIO + " " + s.o1 + " " + s.o2 + " " + s.o3);
    }

}
