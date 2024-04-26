public abstract class Pengguna implements Mendengarkan{
    static int idPengguna = 0;

    private int kodePelanggan;
    protected String nama;
    protected DaftarLagu Playlist;
    protected String statusKeanggotaan;

    Pengguna(String nama){
        this.kodePelanggan = idPengguna;
        idPengguna++;
        this.nama = nama;
    }
}
