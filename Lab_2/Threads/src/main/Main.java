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
            S.addFile(url);
            url = in.nextLine();
        }
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\t1.txt");
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\t2.txt");
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\t3.txt");
//        S.addFile("E:\\OOP\\Labs\\Lab_2\\Threads\\src\\Files\\non.txt");
        S.startSearch();
    }

    public static void main(String[] args) {
        z1();
    }
}
