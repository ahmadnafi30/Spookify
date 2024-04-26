public class MusikOldSchool extends Musik {
    static DaftarLaguLama newSchool;
    Musik m;
    
    public MusikOldSchool(String judul, String genre, String tahun, String artist, String pencipta) {
        super(judul, genre, tahun, artist, pencipta);
        m = new Musik(judul, genre, tahun, artist, pencipta);
        addDataMusik(m);
    }

    void addDataMusik(Musik m){
        newSchool.tambahMusik(m);
    }
}
