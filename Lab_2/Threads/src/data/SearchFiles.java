/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vlado
 */
public class SearchFiles {

    File file;
    String tip;
    List<Thread> t = new ArrayList();

    public SearchFiles(String url, String tip) {
        this.file = new File(url);
        this.tip = tip;

    }

    public void start() {
        Thread p = new Thread(() -> search(file));
        t.add(p);
        p.start();
    }

    public List<Thread> getT() {
        return t;
    }
    
    private void search(File f) {
        File[] spisoc = f.listFiles();
        long count = Arrays.stream(spisoc).filter(s -> s.getName().contains(tip)).count();
        for (File fl : spisoc) {
            if (fl.isDirectory()) {
                Thread p = new Thread(() -> search(fl));
                t.add(p);
                p.start();
            } else {
                continue;
            }
        }
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + f.getName() + ": " + count);
        } else {
            System.out.println(Thread.currentThread().getName() + ": " + f.getName() + ": файлов нужного типа не найдено.");
        }
        
    }

}
