package org.example.learning;

public class Odev3Hakan {

    public static void main(String[] args) {

        int[] array = new int[]{123, 43, 123, 66, 434, 11, 234, 77, 554};
        int sonuc = 1;
        int aranan = 77;

        for(int sayi: array)
        {
            if(sayi == aranan)
            {
                sonuc = 1;
                break;
            }else
                sonuc = 0;
        }
        if(sonuc == 1)
        {
            System.out.println("Sayi Dizide Mevcut");
        }else
            System.out.println("Sayi Dizide Mevcut Degil");
     }
}
