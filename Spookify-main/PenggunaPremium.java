public class PenggunaPremium extends Pengguna{

    PenggunaPremium(String nama){
        super(nama);
        super.statusKeanggotaan = "Premium";
    }

    // @Override
    // public void ambilListLagu(int i) {
    //     if (i == 1) {
    //         if(playlist == null){
    //         System.out.println("Belum ada lagu yang ditambahkan");
    //         return;
    //     } 
    //     playlist.tampilkanDaftar();
    //     } else if (i == 2) {
    //         System.out.println("Old School:");
    //         MusikOldSchool.oldSchool.tampilkanDaftar(2);
    //     } else if (i == 3 ) {
    //         System.out.println("New School:");
    //         MusikNewSchool.newSchool.tampilkanDaftar(3);
    //     }
    // } 

    //Punya spookify
    // public void ListLaguLama(){
    //     MusikOldSchool.oldSchool.tampilkanDaftar();
    // }

    public void ListLaguBaru(){
        MusikNewSchool.newSchool.tampilkanDaftar(3);
    }

    //Punya pengguna
    // @Override
    public void tampilkanPlaylist() {
        playlist.tampilkanDaftar();
    }

   
}
