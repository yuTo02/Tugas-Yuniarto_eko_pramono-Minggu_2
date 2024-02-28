import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan usia anda saat ini: ");

        try {
            int age = input.nextInt();

            if (age < 18) {
                System.out.println(age + "th, anda belum cukup umur");
            } else if (age >= 18 && age <= 25) {
                System.out.println(age + "th, anda adalah pemuda dewasa");
            } else {
                System.out.println(age + "th, anda adalah orang dewasa");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input yang anda masukkan bukan angka");
        }

        input.close();
    }
}
