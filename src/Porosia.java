public class Porosia {
    int numriPorosise;
    Klienti klienti;
    Restoranti restoranti;
    Artikulli artikulli;

    double llogaritTotalin() {
        if (artikulli == null) {
            return 0.0;
        }
        return artikulli.vlertaTotale();
    }

    void shfaqFaturen() {
        System.out.println("=== Porosia #" + numriPorosise + " ===");
        if (klienti != null) {
            System.out.println("Klienti: " + klienti.emri + " (" + klienti.qyteti + ")");
        }
        if (restoranti != null) {
            System.out.println("Restoranti: " + restoranti.emri);
        }
        if (artikulli != null) {
            artikulli.shfaqArtikullin();
        }
        System.out.println("Totali: " + llogaritTotalin() + " €");
    }
}