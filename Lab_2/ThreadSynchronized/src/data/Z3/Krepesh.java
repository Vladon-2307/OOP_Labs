/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.Z3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vlado
 */
public class Krepesh {

    private int count;

    volatile public static int isGaika = 0;
    volatile public static int isShaiba = 0;
    volatile public static int isVint = 0;

    public Krepesh(int count) {
        this.count = count;
    }

    public synchronized void start() {
        Vint v = new Vint(count);
        Shaiba s = new Shaiba(count);
        Gaika g = new Gaika(count);
        v.start();
        s.start();
        g.start();
        for (int i = 0; i < count; i++) {
            
            while (true) {
                if(isGaika>0 && isShaiba>0 && isVint>0){
                    break;
                }
                
            }
            isGaika--;
            isShaiba--;
            isVint--;
            
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
