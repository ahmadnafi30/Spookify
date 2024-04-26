public class Spookify {

    public static void main(String[] args) {
        
        Musik[] oldSchoolSongs = new MusikOldSchool[10];
        Musik[] newSchoolSongs = new MusicNewSchool[10];

        // Instantiating 10 objects of MusikOldSchool
        for (int i = 0; i < 10; i++) {
            oldSchoolSongs[i] = new MusikOldSchool("Judul" + (i + 1), "Genre" + (i + 1), "2020", "Artist" + (i + 1), "Pencipta" + (i + 1));
        }

        // Instantiating 10 objects of MusikNewSchool
        for (int i = 0; i < 10; i++) {
            newSchoolSongs[i] = new MusicNewSchool("Judul" + (i + 1), "Genre" + (i + 1), "2020", "Artist" + (i + 1), "Pencipta" + (i + 1));
        }

        // Example usage:
        MusikOldSchool taylor = new MusikOldSchool("Judul1", "Genre1", "2020", "Artist1", "Pencipta1");
        MusicNewSchool edSheeran = new MusicNewSchool("Judul1", "Genre1", "2020", "Artist1", "Pencipta1");
        Pengguna pengguna1 = new PenggunaFree("Nafi");
        MusicNewSchool.newSchool.tampilkanDaftar();
        
        
    }

}
