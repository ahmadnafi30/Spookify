public class PenggunaFree extends Pengguna{

    PenggunaFree(String nama){
        super(nama);
        super.statusKeanggotaan = "Free";
    }

    @Override
    public void ambilListLagu() {
        Playlist.tampilkanDaftar();
    }
}
