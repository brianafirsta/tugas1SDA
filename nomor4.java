package com.Tugas1SDA;

import java.util.ArrayList;

public class nomor4 {
    
    public static void main(String[] args) {
        //String[] nama= {"R","S","T","A"}
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("R");
        nama.add("S");
        nama.add("T");
        nama.add("A");
 
        //NO 4 = indexOf(a), indexOf(c), indexOf(q)
        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));   
    }
}
