package pbo.assignment.asgmnt1;

public class Main {
    public static void main(String[] args) {
        TempatWisata tw1 = new TempatWisata("Dressrosa", 500);
        TempatWisata tw2 = new TempatWisata("Water Seven", 300);
        TempatWisata tw3 = new TempatWisata("Sabody Archipelago", 200);

        Traveller tl1 = new Traveller("Luffy", "East Blue");
        Traveller tl2 = new Traveller("Zoro", "East Blue");
        Traveller tl3 = new Traveller("Nami", "East Blue");
        Traveller tl4 = new Traveller("Usopp", "East Blue");
        Traveller tl5 = new Traveller("Sanji", "North Blue");
        Traveller tl6 = new Traveller("Chopper", "Paradise");
        Traveller tl7 = new Traveller("Robin", "West Blue");
        Traveller tl8 = new Traveller("Franky", "Paradise");
        Traveller tl9 = new Traveller("Brook", "West Blue");
        Traveller tl10 = new Traveller("Jinbe", "Paradise");

        Travel tr1 = new Travel("Paket 1",
                new Kendaraan("Caravel", 50),
                new Hotel("Alabasta Hotel", 50));

        tr1.addWisata(tw1);
        tr1.addWisata(tw2);

        tr1.addTraveller(tl1.getNama());
        tr1.addTraveller(tl2.getNama());
        tr1.addTraveller(tl3.getNama());
        tr1.addTraveller(tl4.getNama());
        tr1.addTraveller(tl5.getNama());
        tr1.addTraveller(tl6.getNama());

        Travel tr2 = new Travel("Paket 2",
                new Kendaraan("Cruise Ship", 100),
                new Hotel("Mermaid Hotel", 40));

        tr2.addWisata(tw1);
        tr2.addWisata(tw2);
        tr2.addWisata(tw3);

        tr2.addTraveller(tl7.getNama());
        tr2.addTraveller(tl8.getNama());
        tr2.addTraveller(tl9.getNama());
        tr2.addTraveller(tl10.getNama());

        System.out.println("--- Data Paket 1 ---");
        tr1.displayData();

        System.out.println("\n--- Data Paket 2 ---");
        tr2.displayData();
    }
}
