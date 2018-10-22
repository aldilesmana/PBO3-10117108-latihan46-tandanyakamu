import java.util.Scanner;
//NAMA  :Aldi Lesmana
//NIM   :10117108    
//KELAS :IF-3

/**
 *
 * @author Aldi Lesmana
 */
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Kamu objKamu = new Kamu(2018);
        System.out.print("Masukan tahun Lahir Anda : ");
        objKamu.setYearBirth(scan.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda "+objKamu.getYearBirth());
        System.out.println("Hari ini Tahun : "+objKamu.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "+objKamu.hitungUmur
        ()+" tahun ");
        System.out.println("Tandanya Kamu "+objKamu.tandanyaKamu(objKamu.hitungUmur()));
        
    }
}

