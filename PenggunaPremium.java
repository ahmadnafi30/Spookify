public class PenggunaPremium  extends Pengguna{
    private String statusKeanggotaan;

    PenggunaPremium(String nama){
        super(nama);
        this.statusKeanggotaan = "Premium";
    }

    @Override
    public void ambilListLagu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ambilListLagu'");
    }
}
