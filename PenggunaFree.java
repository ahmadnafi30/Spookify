public class PenggunaFree extends Pengguna{

    PenggunaFree(String nama){
        super(nama);
        super.statusKeanggotaan = "Free";
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
            System.out.println(super.nama + "! Premium dulu dong");
        }
    } 

    //Punya spookify
    public void ListLaguLama(){
        MusikOldSchool.oldSchool.tampilkanDaftar(2);
    }


    //Punya pengguna
    public void tampilkanPlaylist() {
        playlist.tampilkanDaftar();
    }
    
}
