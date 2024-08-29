import java.util.Scanner;

public class kalkulator {
    
    public static void main(String[] args){
        int operator, nilai1, nilai2;
        
        System.out.println("Pilih 1 untuk penjumlahan" + "\n"
         + "pilih 2 untuk perkalian" + "\n" + "pilih 3 untuk modulus");

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Pilihan : ");
        operator = sc.nextInt();

        System.out.print("Masukan nilai pertama : ");
        nilai1 = sc.nextInt();

        System.out.print("Masukan nilai kedua : ");
        nilai2 = sc.nextInt();

        int result = 0;

        if (operator == 1) {
            result = nilai1 + nilai2;
            System.out.println("hasil : " + result);
        } else if (operator == 2) {
             result = nilai1 * nilai2;
            System.out.println("hasil : " + result);
        } 
        else if (operator == 3) {
             result = nilai1 % nilai2;
            System.out.println("hasil : " + result);
            
        }else {
              System.out.print("Masukan Pilihan");
              operator = sc.nextInt();
        }

        sc.close();

    }
}
