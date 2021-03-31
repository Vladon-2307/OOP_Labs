/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vlado
 */
public class ThreadEven extends Thread {

    private List<Integer> mas = new ArrayList<>();

    public ThreadEven(List<Integer> mas) {
        this.mas = mas;
    }

    private void sort() {
        Integer[] rezult = mas.stream().filter(s -> s % 2 == 0).toArray(Integer[]::new);
        System.out.println("Even: " + Arrays.toString(rezult));
    }

    @Override
    public void run() {
        sort();
    }

}
