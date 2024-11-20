package pbo.assignment.asgmnt1;

import java.util.ArrayList;

public class Travel {
    private String namaPaket;
    private int harga;
    private Kendaraan kendaraan;
    private Hotel hotel;
    private ArrayList<TempatWisata> listWisata = new ArrayList<>();
    private ArrayList<String> listTraveller = new ArrayList<>();

    public Travel(String namaPaket, Kendaraan kendaraan, Hotel hotel) {
        this.namaPaket = namaPaket;
        this.kendaraan = kendaraan;
        this.hotel = hotel;
    }

    public void addWisata(TempatWisata wisata) {
        listWisata.add(wisata);
    }

    public void addTraveller(String namaTraveller) {
        listTraveller.add(namaTraveller);
    }

    public int getHarga() {
        return harga;
    }

    public void displayData() {
        System.out.println("Nama Paket    : " + namaPaket);
        System.out.println("Kendaraan     : " + kendaraan.getTipe() + " ( " + kendaraan.getHarga() +" Beri ) ");
        System.out.println("Penginapan    : " + hotel.getNama()  + " ( " + hotel.getHarga() +" Beri ) ");
        
        System.out.println();
        System.out.println("Daftar Wisata");
        for (TempatWisata wisata : listWisata) {
            System.out.println("- " + wisata.getNama() + " ( " + wisata.getHargaTiket() + " Beri )");
        }
        System.out.println();
        
        System.out.println("Daftar Traveller" + " (" + listTraveller.size()+ " orang" + ") ");
        for (String traveller : listTraveller) {
            System.out.println("- " + traveller);
        }

        

        System.out.println();
        System.out.println("Total Biaya : " + ((kendaraan.getHarga() + hotel.getHarga()) * listTraveller.size()) + " Beri / "+ listTraveller.size() + " orang");
    }
}
