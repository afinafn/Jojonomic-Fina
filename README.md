# Jawaban-Jojonomic-Fina
 Jojonomic-Fina

How to build:
Ganti driver menjadi geckodriver, jika komputer user menggunakan windows
kemudian url dari geckodriver sebelumnya diganti, kemudian klik kanan-> copy path/reference
pada absolute path, copy paste URL tersebut -> paste pada System.setProperty("webdriver.chrome.driver", "/Users/finafany/Documents/Jojonomic-Fina/driver/chromedriver");

menggunakan Java Version dengan Version 15
Note : Untuk automation ini masih menggunakan full selenium belum menggunakan BDD/OOP.


Run Test:
1. Buka file Jojonomic-Fina
2. Open file tersebut menggunakan Intelij IDEA CE
3. Ketika sudah dibuka file nya, buka File src-> test-> java -> Jojonomic -> Homepage
4. File Homepage berhasil dibuka, klik tombol Run 'Homepage'
5. Browser akan terbuka dan menjalankan automasi web tersebut

note:
ada beberapa step pada halaman pencarian "Apply for a number plate" saya skip, dikarenakan saat menjalankan browser menjadi di halaman bawah,
sebelum nya bisa dijalankan. 