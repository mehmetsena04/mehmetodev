/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

/**
 *
 * @author Administrator
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MyUtils deki metotların test edilmesi
        System.out.println("Test sonuçları\n");
System.out.println("---------------------------------------------------");
        float ucgencevre = MyUtils.ucgenCevre(3, 4, 5);
        System.out.println("Uçgenin çevresi:" + ucgencevre);
System.out.println("---------------------------------------------------");
        float ucgenalan = MyUtils.ucgenAlan(3, 4, 5);
        System.out.println("Uçgenin alanı:" + ucgenalan);
System.out.println("---------------------------------------------------");
        float cokgencevre = MyUtils.cokgenCevre(6, 7, 8, 9, 5, 4);
        System.out.println("Çokgenin çevresi:" + cokgencevre);
System.out.println("---------------------------------------------------");
        float cokgenalan = MyUtils.cokgenAlan(8, 8, 8, 8);
        System.out.println("Çokgenin alanı:" + cokgenalan);
System.out.println("---------------------------------------------------");
        byte[] verilendizi = {1, 2, 3, 4, 5, 6, 10};

        double[] yenidizi = MyUtils.fonksiyondondur(verilendizi);
        int i = 1;
        for (double yenielemanlar : yenidizi) {
            if(i<=yenidizi.length/2)
            {System.out.println(i + "." + "Yeni dizi elemanları --1.fonksiyonun için:\n" + yenielemanlar);} 
            else{
              {System.out.println(i + "." + "Yeni dizi elemanları --2.fonksiyonun için\n" + yenielemanlar);} 
            }
            i++;
            
        }

    }

}
