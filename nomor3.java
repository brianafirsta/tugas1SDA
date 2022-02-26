package com.Tugas1SDA;

import java.util.ArrayList;

public class nomor3 {
  
    public static void main(String[] args) {
        //String[] nama= {"R","S","T","A"}
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("R");
        nama.add("S");
        nama.add("T");
        nama.add("A");

        //NO 3 = get(0), get(2), get(6), get(-3)
        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
    }
}
