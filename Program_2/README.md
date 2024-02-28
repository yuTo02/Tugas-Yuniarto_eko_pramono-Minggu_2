# Program_2 - Input Usia

Deskripsi: Program ini meminta pengguna memasukkan usia, kemudian menentukan status berdasarkan rentang usia.

## Penggunaan Scanner

Penggunaan Scanner: `Scanner input = new Scanner(System.in);` untuk mendapatkan input usia.

## Penggunaan nextInt()

Digunakan untuk mengambil nilai usia dari pengguna.

## Penggunaan try-catch

Digunakan try-catch untuk menangkap `InputMismatchException` jika pengguna memasukkan nilai yang bukan integer.

## Contoh Penggunaan

- Jika input 15 -> Output: "15th, anda belum cukup umur"
- Jika input 20 -> Output: "20th, anda adalah pemuda dewasa"
- Jika input "abc" -> Output: "Input yang anda masukkan bukan angka"