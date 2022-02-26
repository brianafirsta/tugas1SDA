package com.Tugas1SDA;

import java.util.ArrayList;

public class nomor5 {
    
    public static void main(String[] args) {
        //String[] nama= {"R","S","T","A"}
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("R");
        nama.add("S");
        nama.add("T");
        nama.add("A");

        System.out.println("Array sebelum perintah Remove :");
        for(String var: nama){
            System.out.println(var);
        }

         //NO 5 = remove(0), remove(3), remove(2)
        nama.remove(0);
        nama.remove(3);
        nama.remove(2);
    

        System.out.println("Array setelah perintah Remove :");
            for(String var2: nama){
                System.out.println(var2);
            }

    }
    }
