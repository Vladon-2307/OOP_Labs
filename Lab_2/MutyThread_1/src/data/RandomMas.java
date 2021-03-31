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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vlado
 */
public class RandomMas {

    private int[][] mas;

    public int[][] getMas() {
        return mas;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    private int x;
    private int y;
    private List<Thread> T = new ArrayList<>();

    public RandomMas(int x, int y) {
        this.x = x;
        this.y = y;
        mas = new int[x][y];
        zapolnenie();
        for (Thread a : T) {
            try {
                a.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Random mas" + Arrays.deepToString(mas));

    }

    private void zapolnenie() {
        for (int i = 0; i < x; i++) {
            zapS(i);
        }
    }

    private void zapS(int i) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int c = 0; c < y; c++) {
                    Random r = new Random();
                    int s = r.nextInt(10);
                    mas[i][c] = s;
                }
            }
        });
        t.start();
        T.add(t);
    }

}
