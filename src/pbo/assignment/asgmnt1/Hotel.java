package pbo.assignment.asgmnt1;

public class Hotel {
    private String nama;
    private int harga; // Mengubah tipe data menjadi int

    public Hotel(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
