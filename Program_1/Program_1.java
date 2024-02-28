import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner cek = new Scanner(System.in);
        System.out.print("masukan angka : ");

        if (cek.hasNextInt()) {
            int number = cek.nextInt();

            if (number > 0) {
                System.out.println(number + " adalah angka positif");
            } else if (number < 0) {
                System.out.println(number + " adalah angka negatif");
            } else if (number == 0) {
                System.out.println(number + " adalah angka nol");
            }
        } else {
            System.out.println("yang anda masukan bukanlah angka");
        } 
        cek.close();
    }
}