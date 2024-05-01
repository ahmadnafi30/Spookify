public abstract class Pengguna implements Mendengarkan{
    static int idPengguna = 1;

    private int kodePelanggan;
    protected String nama;
    protected DaftarLaguPengguna playlist = new DaftarLaguPengguna();
    protected String statusKeanggotaan;

    Pengguna(String nama){
        this.kodePelanggan = 2340 + idPengguna;
        idPengguna++;
        this.nama = nama;
    }

    public String toString(){
        return 
        "Kode Pelanggan     : " 
        + this.kodePelanggan + " \n" + 
        "Nama Pelanggan     : " + this.nama + " \n" + 
        "Status Keanggotaan : " + this.statusKeanggotaan;
    }

    public void ambilListLagu() {
        if(playlist == null){
            System.out.println("Belum ada lagu yang ditambahkan");
            return;
        }
        playlist.tampilkanDaftar();
    } 
    
    public void tambahPlaylist(String m){
        playlist.tambahMusik(m, this.statusKeanggotaan);
    }

}
