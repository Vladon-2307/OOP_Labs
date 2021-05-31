/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vlado
 */
public class Zadanie1 {

    private List<Integer> mas = new ArrayList<>();
    private int lon;
    private int sum = 0;
    private double srArf = 0;

    public Zadanie1(int lon) {
        this.lon = lon;
    }

    public void start() {
        Thread zap = new Thread(() -> {
            for (int i = 0; i < lon; i++) {
                Random ran = new Random();
                mas.add(ran.nextInt());
            }
        });
        zap.start();
        try {
            zap.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        Thread su = new Thread(() -> {
            sum = mas.stream().mapToInt(Integer::valueOf).sum();
        });
        su.start();
        Thread sr = new Thread(() -> {
            int sums = 0;
            sums = mas.stream().mapToInt(Integer::valueOf).sum();
            srArf = sums / mas.size();
        });
        sr.start();
        try {
            su.join();
            sr.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("summa: " + sum);
        System.out.println("Srednie arefmeticheckoe: " + srArf);
    }

}
