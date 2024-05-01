public class MusikNewSchool extends Musik {
    static DaftarLaguBaru newSchool = new DaftarLaguBaru();
    Musik m;
    
    public MusikNewSchool(String judul, String genre, String tahun, String artist, String pencipta) {
        super(judul, genre, tahun, artist, pencipta);
        m = new Musik(judul, genre, tahun, artist, pencipta);
        addDataMusik(m);
    }

    void addDataMusik(Musik m){
        DaftarLaguBaru.tambahMusik(m);
    }
}
