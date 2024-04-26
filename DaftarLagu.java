import java.util.*;

public abstract class DaftarLagu{
    List<Musik> list = new LinkedList<>();

    public abstract void tambahMusik(Musik musik);

    public void tampilkanDaftar(){
        for (Musik musik : list){
            System.out.println(musik.getJudul());
        }
    }

    // public void tampilkanDaftarLama(){
    //     for (musik : list) {
    //         if (musik instanceof DaftarLaguLama) {
                
    //         }
    //     }
    // }

}

