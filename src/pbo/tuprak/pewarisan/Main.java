package pbo.tuprak.pewarisan;

// Kelas Main sebagai titik awal eksekusi program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Departemen bernama IT
        Departemen departemenIT = new Departemen("IT");

        // Membuat objek KaryawanTetap dan KaryawanKontrak
        KaryawanTetap karyawanTetap1 = new KaryawanTetap("Ahmad", 1500000, 1900000);
        KaryawanKontrak karyawanKontrak1 = new KaryawanKontrak("Jani", 12, 6000000);

        // Menambahkan karyawan tetap dan kontrak ke dalam departemen IT
        departemenIT.addKaryawan(karyawanTetap1);
        departemenIT.addKaryawan(karyawanKontrak1);

        // Menampilkan informasi karyawan berdasarkan jenis mereka
        departemenIT.displayKaryawanTetap();     // Menampilkan semua KaryawanTetap
        departemenIT.displayKaryawanKontrak();   // Menampilkan semua KaryawanKontrak
        departemenIT.displaySemuaKaryawan();     // Menampilkan semua Karyawan di departemen IT
    }
}