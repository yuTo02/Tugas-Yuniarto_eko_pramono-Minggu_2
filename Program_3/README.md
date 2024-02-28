# PROGRAM_3 - Lulus Tidak Lulus

Deskripsi: Program ini meminta pengguna memasukkan nama dan nilai, kemudian menentukan status kelulusan berdasarkan nilai.

## Penggunaan Scanner

Penggunaan Scanner: `Scanner input = new Scanner(System.in);` untuk mendapatkan input nama dan nilai.

## Penggunaan try-catch-finally

Digunakan try-catch untuk menangkap `InputMismatchException` jika pengguna memasukkan nilai yang bukan integer. Kemudian digunakan `finally` untuk menutup Scanner.

## Contoh Penggunaan

- Jika input nama "Alice", nilai 85 -> Output: "Selamat Alice, nilai anda 85, Anda lulus dengan baik"
- Jika input nama "Bob", nilai 70 -> Output: "Selamat Bob, nilai anda 70, Anda lulus"
- Jika input nama "Charlie", nilai "abc" -> Output: "Hai Charlie, yang anda masukkan bukan angka"
