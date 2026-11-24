public class Klienti {
    String emri;
    String qyteti;
    String telefoni;

    void pershendet() {
        System.out.println("Klienti " + emri + " nga " + qyteti + " është gati për porosi.");
    }

    void shfaqKontaktin() {
        System.out.println("Emri: " + emri + " | Telefoni: " + telefoni);
    }
}