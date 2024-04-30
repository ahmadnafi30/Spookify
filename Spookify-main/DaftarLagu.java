import java.util.*;

public abstract class DaftarLagu{
   static List<Musik> list = new LinkedList<>();

    // public abstract void tambahMusik(Musik musik);
    
    public void tampilkanDaftar(int pilihan){
        if(list.isEmpty()){
            System.out.println("Daftar Lagu Kosong");
            return;
        }
        for (Musik musik : list){
            if(pilihan == 2){
                if (musik.jenisLagu.equals("Old School")) {
                    System.out.println(musik.getJudul());
                }
            } else if(pilihan == 3){
                if (musik.jenisLagu.equals("New School")) {
                    System.out.println(musik.getJudul());
                }
                // System.out.println(musik.getJudul());
            }
        } 
        
        
    }

    // public void tampilkanDaftarLama(){
    //     for (musik : list) {
    //         if (musik instanceof DaftarLaguLama) {
                
    //         }
    //     }
    // }

}

