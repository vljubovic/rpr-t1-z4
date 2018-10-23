package ba.unsa.etf;

public class Predmet {
    private Student[] studenti = null;

    private String nazivPredmeta;
    private int sifraPredmeta;
    private int maxStudenata;
    private int size = 0;

    public Predmet(String naziv, int sifra, int max) {
        nazivPredmeta = naziv;
        sifraPredmeta = sifra;
        maxStudenata = max;
        size = 0;
        studenti = new Student[maxStudenata];
    }

    public void upisi(Student s){
        if(size < maxStudenata) {
            studenti[size] = s;
            size++;
        }
    }

    public void ispisi(Student s){
        int idx = 0;
        for(idx = 0; idx < size; idx++) {
            if(studenti[idx] == s)
                break;
        }

        for(int i = idx; i < size-1; i++) {
            studenti[i] = studenti[i+1];
        }
        studenti[size-1] = null;
        size--;
    }

    @Override
    public String toString() {
        String s = "";

        for(int i = 0; i < size; i++) {
            s += i + ". " + studenti[i] + "\n";
        }

        return s;
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
