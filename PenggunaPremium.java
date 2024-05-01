public class PenggunaPremium extends Pengguna{

    PenggunaPremium(String nama){
        super(nama);
        super.statusKeanggotaan = "Premium";
    }

    // public void ListLaguBaru(){
    //     MusikNewSchool.newSchool.tampilkanDaftar(3);
    // }

    public void tampilkanPlaylist() {
        playlist.tampilkanDaftar();
    }

    @Override
    public void ambilListLagu(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ambilListLagu'");
    }

   
}
