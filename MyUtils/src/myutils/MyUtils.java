package myutils;

public class MyUtils {

//Bir üçgenin çevresini hesaplar
    public static float ucgenCevre(float a, float b, float c) {
        float ucgeninCevresi = a + b + c;
        return ucgeninCevresi;

    }
//Bir üçgenin alanını hesaplar

    public static float ucgenAlan(float a, float b, float c) {
        float u = (a + b + c) / 2;
        float alan = (float) Math.sqrt(u * (u - a) * (u - b) * (u - c));
        return alan;
    }

//Bir çokgenin çevresini hesaplar
    public static float cokgenCevre(float... kenar) {
        float Cevre = 0;

        for (float f : kenar) {
            Cevre += f;
        }
        return Cevre;
    }

//Bir çokgenin alanını hesaplar
    public static float cokgenAlan(float... kenar) {
        int n = kenar.length;
        float x = kenar[0];

        double alan = x * x * n / 4 * (Math.tan(Math.PI / n));

        return (float) alan;
    }
//Verilen dizideki elemanları iki farklı fonksiyona aktarıp çıkış değerleri ile yeni bir dizi döndürür

    public static double[] fonksiyondondur(byte[] firstarray) {
        byte x;
        int ilkdiziuzunluk = firstarray.length;

        double[] arrayfonksiyon = new double[2 * ilkdiziuzunluk];

        for (int i = 0; i < firstarray.length; i++) {

            x = firstarray[i];
            double fx1 = 3 * x * x + 2 * Math.exp(x) + Math.sqrt(x);
            arrayfonksiyon[i] = fx1;

        }

        for (int i = 0; i < firstarray.length; i++) {
            x = firstarray[i];

            double fx2 = 1.0 / (1 + Math.exp(x));
            arrayfonksiyon[i + firstarray.length] = fx2;
        }

        return arrayfonksiyon;

    }
}
