public class Restoranti {
    String emri;
    String kuzhina;
    boolean iHapur;

    void shfaqStatusin() {
        String statusi = iHapur ? "Hapur" : "Mbyllur";
        System.out.println("Restoranti: " + emri + " (" + kuzhina + ") - " + statusi);
    }

    void hapRestorantin() {
        iHapur = true;
        System.out.println(emri + " tani është i hapur.");
    }
}