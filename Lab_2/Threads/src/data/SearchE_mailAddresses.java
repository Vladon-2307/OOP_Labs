/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vlado
 */
public class SearchE_mailAddresses {

    private List<String> theWay = new ArrayList<>();

    private void search(String way) {
        List<String> rezult = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(way)));
            String line = reader.readLine();
            while (line != null) {
                String sech[] = line.split(" ");
                for (String sech1 : sech) {
                    if (sech1.contains("@")) {
                        rezult.add(sech1);
                    }
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(Thread.currentThread().getName() + ": файл не найден");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (rezult.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + ": e-mail адреса отсуствуют");
        } else {
            System.out.println(Thread.currentThread().getName() + ": e-mail адреса: " + rezult.toString());
        }
    }

    public void addFile(String URL) {
        theWay.add(URL);
    }

    public void startSearch() {
        List<Thread> ts = new ArrayList<>();
        theWay.stream().map((url) -> new Thread(() -> {
            search(url);
        })).map((t) -> {
            ts.add(t);
            return t;
        }).forEachOrdered((t) -> {
            t.start();
        });
        ts.stream().forEachOrdered(t -> {
            try {
                t.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
    }
}
