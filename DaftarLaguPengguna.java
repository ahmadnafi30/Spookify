import java.util.LinkedList;
import java.util.List;

/**
 * Playlist
 */
public class DaftarLaguPengguna{

    public List<Musik> list = new LinkedList<>();
   
    public void tambahMusik(String judul, String statusKeanggotaan){
        List<Musik> data = DaftarLaguSpookify.list;
        for (Musik musik : data) {
            if(statusKeanggotaan.equalsIgnoreCase("Free")){
                if (musik.getJudul().equals(judul)) {
                    if(musik.jenisLagu.equals("Old School")){
                        list.add(musik);
                        System.out.println("Sukses menambahkan "+ judul +" ke playlist");
                    } else System.out.println("Langganan premium dulu bray!");
                    return;
                }
            }
            else if(statusKeanggotaan.equalsIgnoreCase("Premium")){
                if (musik.getJudul().equals(judul)) {
                    list.add(musik);
                    System.out.println("Sukses menambahkan "+ judul +" ke playlist");
                    return;
                }
            }
        }
        System.out.println("Lagu tidak ditemukan");
    }
    public void tampilkanDaftar(){
        if (list.isEmpty()) {
            System.out.println("Tidak ada lagu yang ditambahkan ke dalam playlist");
        }
       for (Musik musik : list) {
            System.out.println("----------------------------");
            System.out.println("No. " + (list.indexOf(musik) + 1));
            System.out.println(musik.toString());
            System.out.println("----------------------------");
       }
    }
}

