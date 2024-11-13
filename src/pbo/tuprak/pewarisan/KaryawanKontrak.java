package pbo.tuprak.pewarisan;

// Kelas KaryawanKontrak yang mewarisi dari Karyawan
class KaryawanKontrak extends Karyawan {
    int waktuKontrak; // Durasi kontrak dalam bulan

    // Konstruktor untuk inisialisasi nama, waktu kontrak, dan gaji dasar
    KaryawanKontrak(String nama, int waktuKontrak, double gajiDasar) {
        super(nama, gajiDasar);
        this.waktuKontrak = waktuKontrak;
    }

    // Override metode display() untuk menampilkan data tambahan tentang waktu kontrak
    @Override
    void display() {
        super.display();
        System.out.println("Waktu Kontrak: " + waktuKontrak + " bulan");
    }
}