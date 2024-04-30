public abstract class Pengguna implements Mendengarkan{
    static int idPengguna = 1;

    private int kodePelanggan;
    protected String nama;
    protected Playlist playlist = new Playlist();
    protected String statusKeanggotaan;

    Pengguna(String nama){
        this.kodePelanggan = idPengguna;
        idPengguna++;
        this.nama = nama;
    }

    public String toString(){
        return "Kode Pelanggan : " + this.kodePelanggan + " \n" + "Nama Pelanggan : " + this.nama + " \n" + "Status Keanggotaan : " + this.statusKeanggotaan;
    }

    public void ambilListLagu(int i) {
        if (i == 1) {
            if(playlist == null){
            System.out.println("Belum ada lagu yang ditambahkan");
            return;
        } 
        playlist.tampilkanDaftar();
        } else if (i == 2) {
            System.out.println("Old School:");
            MusikOldSchool.oldSchool.tampilkanDaftar(2);
        } else if (i == 3 ) {
            System.out.println("New School:");
            MusikNewSchool.newSchool.tampilkanDaftar(3);
        }
    } 
    
    public void tambahPlaylist(String m){
        playlist.tambahMusik(m);
    }
    public void tambahMusik(){
        
    }
}
