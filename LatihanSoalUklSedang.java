import java.util.Scanner;

public class LatihanSoalUklSedang {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari user
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();
        
        // Validasi agar bilangan harus positif
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;
            
            // Perulangan untuk menghitung faktorial
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            
            // Menampilkan hasil
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }

        input.close();
    }
}

