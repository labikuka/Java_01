public class Main {
    public static void main(String[] args) {
        // Testimi i klasës Libri
        Libri libri1 = new Libri();
        libri1.titulli = "Clean Code";
        libri1.autori = "Robert C. Martin";
        libri1.faqet = 464;
        libri1.cmimi = 8.5;

        libri1.shfaqInfo();
        System.out.println("A është çmimi i arsyeshëm (< 10 €)? " + libri1.eshteILlogshem());
        System.out.println();

        // Testimi i skenarit të porosisë së ushqimit
        Klienti klienti1 = new Klienti();
        klienti1.emri = "Labinot";
        klienti1.qyteti = "Prishtinë";
        klienti1.telefoni = "+38349000000";
        klienti1.pershendet();

        Restoranti restoranti1 = new Restoranti();
        restoranti1.emri = "Bistro 24";
        restoranti1.kuzhina = "Tradicionale";
        restoranti1.iHapur = false;
        restoranti1.hapRestorantin();
        restoranti1.shfaqStatusin();

        Artikulli artikulli1 = new Artikulli();
        artikulli1.emri = "Burger Shtëpie";
        artikulli1.cmimi = 4.5;
        artikulli1.sasia = 2;

        Porosia porosia1 = new Porosia();
        porosia1.numriPorosise = 101;
        porosia1.klienti = klienti1;
        porosia1.restoranti = restoranti1;
        porosia1.artikulli = artikulli1;

        porosia1.shfaqFaturen();
    }
}