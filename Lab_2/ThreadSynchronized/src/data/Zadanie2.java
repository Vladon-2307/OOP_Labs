/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vlado
 */
public class Zadanie2 {

    /**
     *
     */
    public File file;

    public Zadanie2(String url) {
        this.file = new File(url);
    }

    public void start() {
        Thread zap = new Thread(() -> zap());
        Thread fac = new Thread(() -> factorial());
        Thread pros = new Thread(() -> prostShislo());
        zap.start();
        try {
            zap.join();
            fac.start();
            pros.start();
            fac.join();
            pros.join();
            System.out.println("Задание 2 выполнено");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void zap() {
        try (FileWriter writer = new FileWriter(file, false)) {
            for (int i = 0; i < 50; i++) {
                Random ran = new Random();
                String zaps = Integer.toString(ran.nextInt(10));
                writer.write(zaps + " ");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private synchronized void writ(String s) {
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(s);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void factorial() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            String[] mas = line.split(" ");
            FileWriter writer = new FileWriter(new File("E:\\OOP\\Labs\\Lab_2\\ThreadSynchronized\\resurse\\Z2 fac.txt"), false);
            for (String s : mas) {
                writer.write(Integer.toString(getFactorial(Integer.parseInt(s))) + " ");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void prostShislo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            String[] mas = line.split(" ");
            FileWriter writer = new FileWriter(new File("E:\\OOP\\Labs\\Lab_2\\ThreadSynchronized\\resurse\\Z2 prost.txt"), false);
            for (String s : mas) {
                if (isProstShislo(Integer.parseInt(s))) {
                    writer.write(s + " ");
                }
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public boolean isProstShislo(int num) {
        boolean isPrime = true;
        int temp;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
