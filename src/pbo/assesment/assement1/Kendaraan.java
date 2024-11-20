package pbo.assesment.assement1;

public class Kendaraan {
    private String tipe;
    private int harga;

    public Kendaraan(String tipe, int harga) {
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }
}
