import java.util.LinkedList;
import java.util.List;

/**
 * Playlist
 */
public class Playlist{

    List<Musik> list = new LinkedList<>();
   
    public void tambahMusik(String judul){
        List<Musik> data = DaftarLagu.list;
        for (Musik musik : data) {
            if (musik.getJudul().equals(judul)) {
                list.add(musik);
                return;
            }
        }
        System.out.println("Lagu tidak ada");
    }
    public void tampilkanDaftar(){
        if (list.isEmpty()) {
            System.out.println("Tidak ada lagu yang ditambahkan ke dalam playlist");
        }
       for (Musik musik : list) {
        System.out.println(musik.getJudul());
       }
    }
}

