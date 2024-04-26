public class MusicNewSchool extends Musik {
    static DaftarLaguBaru newSchool = new DaftarLaguBaru();
    Musik m;
    
    public MusicNewSchool(String judul, String genre, String tahun, String artist, String pencipta) {
        super(judul, genre, tahun, artist, pencipta);
        m = new Musik(judul, genre, tahun, artist, pencipta);
    }

    void addDataMusik(){
        newSchool.tambahMusik(m);
    }
}
