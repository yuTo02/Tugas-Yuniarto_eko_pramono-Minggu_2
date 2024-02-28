import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama anda: ");
        String nama = input.nextLine();

        try {
            System.out.print("masukan nilai anda: ");
            int nilai = input.nextInt();
            
            if (nilai >= 80) {
                System.out.println("Selamat " + nama + ", nilai anda " + nilai + ", Anda lulus dengan baik");
            } else if (nilai >= 60 && nilai <= 75) {
                System.out.println("Selamat " + nama + ", nilai anda " + nilai + ", Anda lulus");
            } else {
                System.out.println("Maaf " + nama + ", anda tidak lulus");
            }
        } catch (InputMismatchException e) {
            System.out.println("Hai " + nama + ", yang anda masukkan bukan angka");
        } finally {
            input.close();
        }
    }
}
