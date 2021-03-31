/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vlado
 */
public class SortMas {

    private List<Thread> T = new ArrayList<>();
    private int[][] mas;
    private int x;
    private int y;

    public SortMas(int[][] mas, int x, int y) {
        this.mas = mas;
        this.x = x;
        this.y = y;
        zapolnenie();
        for (Thread a : T) {
            try {
                a.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Sorted mas" + Arrays.deepToString(mas));

    }

    private void zapolnenie() {
        for (int i = 0; i < y; i++) {
            zapS(i);
        }
    }

    private void zapS(int i) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < x; j++) {
                    for (int c = 0; c < x - 1; c++) {
                        if (mas[c][i] > mas[c + 1][i]) {
                            int temp = mas[c][i];
                            mas[c][i] = mas[c + 1][i];
                            mas[c + 1][i] = temp;
                        }
                    }
                }
            }
        });
        t.start();

        T.add(t);
    }

}
