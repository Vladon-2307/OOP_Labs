/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.*;
import java.util.Scanner;

/**
 *
 * @author vlado
 */
public class Main {
    
    public static void z1(){
        SearchE_mailAddresses S = new SearchE_mailAddresses();
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();
        while(!url.equals("")){
            System.out.println("Введите путь к файелу");
            S.addFile(url);
            url = in.nextLine();
        }
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\t1.txt");
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\t2.txt");
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\t3.txt");
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\non.txt");
        S.startSearch();
    }
    
    public static void z2(){
        //E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к котологк");
        String url = in.nextLine();
        System.out.println("Введите тип искомого файла");
        String tip = in.nextLine();
        SearchFiles files = new SearchFiles(url, ".txt");
        files.start();
    }

    public static void main(String[] args) {
        z1();
        z2();
        
    }
}
