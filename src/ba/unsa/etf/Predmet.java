package ba.unsa.etf;

public class Predmet {
    private Student[] studenti = null;

    private int curr = 0;
    private String nazivPredmeta;
    private int sifraPredmeta;
    private int maxStudenata;

    public Predmet(String naziv, int sifra, int max) {
        nazivPredmeta = naziv;
        sifraPredmeta = sifra;
        maxStudenata = max;
        studenti = new Student[maxStudenata];
    }

    public void upisi(Student s){
        if(curr < studenti.length) {
            studenti[curr] = s;
            curr++;
        }
    }

    public void ispisi(Student s){

    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public int getMaxStudenata() {
        return maxStudenata;
    }
}
