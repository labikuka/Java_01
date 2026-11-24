public class Libri {
    String titulli;
    String autori;
    int faqet;
    double cmimi;

    void shfaqInfo() {
        System.out.println("Libri: " + titulli + " | Autori: " + autori +
                " | Faqe: " + faqet + " | Çmimi: " + cmimi + " €");
    }

    boolean eshteILlogshem() {
        return cmimi < 10.0;
    }
}