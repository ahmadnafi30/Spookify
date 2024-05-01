import java.util.*;

public abstract class DaftarLaguSpookify{
   static List<Musik> list = new LinkedList<>();

    
    public static void tampilkanDaftar(int pilihan){
        if(list.isEmpty()){
            System.out.println("Daftar Lagu Kosong");
            return;
        }
        int i = 1;
        for (Musik musik : list){
            if(pilihan == 1){
                if (musik.jenisLagu.equals("Old School")) {
                    System.out.print((i++) + ". ");
                    System.out.println(musik.getJudul());
                }
            } else if(pilihan == 2){
                if (musik.jenisLagu.equals("New School")) {
                    System.out.print((i++) + ". ");
                    System.out.println(musik.getJudul());
                }
            }
        }   
    }

    public static String cariMusik(String judul){
        for (Musik musik : list) {
            if (musik.getJudul().equals(judul)) {
                return musik.getJudul() + " - " + musik.getArtist();
            }
        }
        return "Lagu tidak ditemukan";
    }       

}

