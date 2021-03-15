/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda_Colection.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vlado
 */
public class Lamda_Colection {

    public static void Z_1() {
        List<Double> list = new ArrayList<>();
        list.add(12.0);
        list.add(-3.12);
        list.add(6.67);
        list.add(-8.4);
        list.add(0.0);
        Double max = list.stream().max(Double::compareTo).get();
        Double min = list.stream().min(Double::compareTo).get();
        System.out.println("Max= " + max + " Min= " + min);
    }

    public static void Z_2() {
        List<Double> list = new ArrayList<>();
        list.add(12.34);
        list.add(-3.4);
        list.add(-6.0);
        list.add(-8.8);
        list.add(0.0);
        list.add(3.008);
        list.add(6.000007);
        list.add(8.9);
        Double min = list.stream().filter(x -> x < 0).max(Double::compareTo).get();
        System.out.println("Минимальное отрицательное число= " + min);
    }

    public static void Z_3() {
        List<Integer> list = new ArrayList<>();
        list.add(122);
        list.add(33);
        list.add(62);
        list.add(83);
        list.add(111);
        list.add(3232);
        list.add(632);
        list.add(832);
        List<Integer> Summs = new ArrayList();
        list.stream().map(String::valueOf).forEach(s -> Summs.add(Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum()));
        int Max_sum = Summs.stream().max(Integer::compare).get();
        System.out.println("Максимальная сумма цифр= " + Max_sum);
    }

    public static void Z_4() {
        final String glass = "qeyuioaj";
        final String soglas = "wrtpsdfghklzxcvbnm";
        String text = "Returns a sequential Stream with this collection as its source";
        String[] slova = text.split(" ");
        for (String bukvi : slova) {
            List<String> Bukvs = new ArrayList<>();
            Bukvs = Arrays.asList(bukvi.split(""));
            int glas = (int) Bukvs.stream().filter(glass::contains).count();
            int sogl = (int) Bukvs.stream().filter(soglas::contains).count();
            if (glas > sogl) {
                System.out.println(bukvi);
            }

        }
    }

    public static void Z_5() {
        List<Integer> chisla = new ArrayList<>();
        chisla.add(23);
        chisla.add(-23);
        chisla.add(-5);
        chisla.add(-10);
        chisla.add(-1);
        chisla.add(4);
        chisla.add(8);
        chisla.add(100);
        chisla.add(-6);
        chisla.add(-15);

        int summ = chisla.stream().filter(s -> s % 2 == 0 && s > 0).mapToInt(s -> s).sum();
        int prizv = chisla.stream().filter(s -> s < -10).mapToInt(s -> s).reduce((s1, s2) -> s1 * s2).orElse(0);

        System.out.println("Summa= " + summ);
        System.out.println("Proizvedenie= " + prizv);
    }

    public static void Z_6() {
        List<Integer> chisla = new ArrayList<>();
        chisla.add(23);
        chisla.add(-23);
        chisla.add(-5);
        chisla.add(-10);
        chisla.add(-1);
        chisla.add(4);
        chisla.add(8);
        chisla.add(100);
        chisla.add(-6);
        chisla.add(-15);

        Integer[] sort = chisla.stream().sorted((s1, s2) -> s1 < s2 ? 1 : -1).toArray(Integer[]::new);

        System.out.println("Sort = " + Arrays.toString(sort));
    }

    public static void Z_7() {
        List<Abiturient> spisoc = new ArrayList<>();
        spisoc.add(new Abiturient("Vitalik V. V.", 10, 5, 5));
        spisoc.add(new Abiturient("Vladislav E. R.", 7, 4, 5));
        spisoc.add(new Abiturient("Kiril F. F.", 10, 5, 5));
        spisoc.add(new Abiturient("Ila D. D.", 10, 10, 5));
        spisoc.add(new Abiturient("Tola W. R.", 10, 5, 5));
        spisoc.add(new Abiturient("Nikto E. F.", 5, 5, 10));

        int max_ocenka = spisoc.stream().mapToInt(s->s.get().stream().max(Integer::compare).get()).max().getAsInt();
        System.out.println("Max ocenka = " + max_ocenka);

        //System.out.println(spisoc.stream().filter((s) -> s.o1 == max_ocenka).toString());
        spisoc.stream().filter((s) -> s.o1 == max_ocenka || s.o2 == max_ocenka || s.o3 == max_ocenka).forEachOrdered((s) -> Abiturient.tostring(s));
    }
}
