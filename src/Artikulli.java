public class Artikulli {
    String emri;
    double cmimi;
    int sasia;

    double vlertaTotale() {
        return cmimi * sasia;
    }

    void shfaqArtikullin() {
        System.out.println(sasia + "x " + emri + " -> " + vlertaTotale() + " €");
    }
}