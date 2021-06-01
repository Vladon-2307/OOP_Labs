/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.Z3;

/**
 *
 * @author vlado
 */
public class Krepesh {

    private int count;

    volatile public static int countGaika = 0;
    volatile public static int countShaiba = 0;
    volatile public static int countVint = 0;

    public Krepesh(int count) {
        this.count = count;
    }

    public void start() {
        Vint v = new Vint(count);
        Shaiba s = new Shaiba(count);
        Gaika g = new Gaika(count);
        v.start();
        s.start();
        g.start();
        for (int i = 0; i < count; i++) {

            while (true) {
                if (countGaika > 0 && countShaiba > 0 && countVint > 0) {
                    break;
                }

            }
            countGaika--;
            countShaiba--;
            countVint--;

            System.out.println("Произвиденно " + i + " крепежей.");
        }
        try {
            v.join();
            s.join();
            g.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Производство " + count + " крепежей окончено.");
    }
}
