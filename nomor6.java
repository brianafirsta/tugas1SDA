package com.Tugas1SDA;

import java.util.ArrayList;

public class nomor6 {
    
    public static void main(String[] args) {
        //String[] nama= {"R","S","T","A"}
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("R");
        nama.add("S");
        nama.add("T");
        nama.add("A");

        //NO 6 = add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
        nama.add(0,"e");
        System.out.println("Setelah menambahkan string e " + nama);
    
        nama.add(2,"f");
        System.out.println("Setelah menambahkan string f " + nama);
    
        nama.add(3,"g");
        System.out.println("Setelah menambahkan string g " + nama);
    
        nama.add(4,"h");
        System.out.println("Setelah menambahkan string h " + nama);
    
        nama.add(6,"h");
        System.out.println("Setelah menambahkan string h " + nama);
    
        nama.add(-3,"j");
        System.out.println("Stelah menambahkan string j " + nama);
    }
}
