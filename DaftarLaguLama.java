/**
 * DaftarLaguLama
 */
public class DaftarLaguLama extends DaftarLagu{
    public DaftarLaguLama() {
        super();
    }

    @Override
    public void tambahMusik(Musik m){
        // Musik data = new Musik() {};
        if(m instanceof MusikOldSchool){
            list.add(m);
        }
    }
    
}