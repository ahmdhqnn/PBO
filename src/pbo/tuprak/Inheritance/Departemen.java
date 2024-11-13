package pbo.tuprak.Inheritance;

import java.util.*;
// Kelas Departemen mewakili departemen yang berisi daftar karyawan
class Departemen {
    private String nama; // Nama departemen
    private List<Karyawan> karyawanList = new ArrayList<>(); // Daftar karyawan dalam departemen

    // Konstruktor untuk menginisialisasi nama departemen
    Departemen(String nama) {
        this.nama = nama;
    }

    // Menambahkan objek karyawan ke dalam daftar karyawan departemen
    void addKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }

    // Menampilkan data karyawan tetap dalam departemen
    void displayKaryawanTetap() {
        System.out.println("Karyawan Tetap di Departemen " + nama);
        for (Karyawan karyawan : karyawanList) {
            if (karyawan instanceof KaryawanTetap) { // Mengecek apakah karyawan adalah objek dari KaryawanTetap
                karyawan.display();
            }
        }
    }

    // Menampilkan data karyawan kontrak dalam departemen
    void displayKaryawanKontrak() {
        System.out.println("Karyawan Kontrak di Departemen " + nama);
        for (Karyawan karyawan : karyawanList) {
            if (karyawan instanceof KaryawanKontrak) { // Mengecek apakah karyawan adalah objek dari KaryawanKontrak
                karyawan.display();
            }
        }
    }

    // Menampilkan data semua karyawan dalam departemen
    void displaySemuaKaryawan() {
        System.out.println("Semua Karyawan di Departemen " + nama);
        for (Karyawan karyawan : karyawanList) {
            karyawan.display();
        }
    }
}