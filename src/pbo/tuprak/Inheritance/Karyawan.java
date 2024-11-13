package pbo.tuprak.Inheritance;

// Kelas Karyawan adalah kelas induk untuk semua tipe karyawan
class Karyawan {
    protected String nama; // Nama karyawan
    protected double gajiDasar; // Gaji dasar karyawan

    // Konstruktor untuk inisialisasi nama dan gaji dasar
    Karyawan(String nama, double gajiDasar) {
        this.nama = nama;
        this.gajiDasar = gajiDasar;
    }

    // Menampilkan data dasar karyawan
    void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Dasar: " + gajiDasar);
    }
}