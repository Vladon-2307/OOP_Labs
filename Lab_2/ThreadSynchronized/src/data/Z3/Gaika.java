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
public class Gaika extends Thread {

    private int count;

    public Gaika(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        work();
    }
    
    private synchronized void work(){
        try {
            for (int i = 0; i < count; i++) {
                sleep(3000);
                Krepesh.isGaika++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
