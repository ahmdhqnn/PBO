package pbo.tuprak.Inheritance;

// Kelas KaryawanTetap yang mewarisi dari Karyawan
class KaryawanTetap extends Karyawan {
    double tunjanganDasar; // Tunjangan dasar karyawan tetap

    // Konstruktor untuk inisialisasi nama, gaji dasar, dan tunjangan dasar
    KaryawanTetap(String nama, double gajiDasar, double tunjanganDasar) {
        super(nama, gajiDasar);
        this.tunjanganDasar = tunjanganDasar;
    }

    // Override metode display() untuk menampilkan data tambahan tentang tunjangan dasar
    @Override
    void display() {
        super.display();
        System.out.println("Tunjangan Dasar: " + tunjanganDasar);
    }
}