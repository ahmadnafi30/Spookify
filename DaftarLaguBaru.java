public class DaftarLaguBaru extends DaftarLagu {
    
    public DaftarLaguBaru() {
        super();
    }

    @Override
    public void tambahMusik(Musik m){
        // Musik data = new Musik() {};
        if(m instanceof MusicNewSchool){
            list.add(m);
        }
    }

    
}