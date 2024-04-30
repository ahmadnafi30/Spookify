public class MusikOldSchool extends Musik {
    static DaftarLaguLama oldSchool = new DaftarLaguLama() ;
    Musik m;
    
    public MusikOldSchool(String judul, String genre, String tahun, String artist, String pencipta) {
        super(judul, genre, tahun, artist, pencipta);
        m = new Musik(judul, genre, tahun, artist, pencipta);
        addDataMusik(m);
        // addDataMusik(m);
    }

    void addDataMusik(Musik m){
        DaftarLaguLama.tambahMusik(m);
    }
}
