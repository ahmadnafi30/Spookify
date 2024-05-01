import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class MusikMechanic extends Musik {

	public static void play(Scanner in, Pengguna pengguna, String yangDiputar) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        File[] file = new File[30];
        int i = 0;
		if(yangDiputar.equals("Playlist Spokify")){
			if(DaftarLaguSpookify.list.isEmpty()){
				System.out.println("Playlist Kosong");
				return;
			}
            if(pengguna.statusKeanggotaan.equals("Free")){
                for(Musik m : DaftarLaguSpookify.list) {
                    if(m.jenisLagu.equals("Old School")) {
                        file[i++] = new File("./DaftarLagu/OldSchool/"+m.getJudul() + ".wav");
                    }
                }
            } else if(pengguna.statusKeanggotaan.equals("Premium")){
				for(Musik m : DaftarLaguSpookify.list) {
                    if(m.jenisLagu.equals("Old School")) {
                        file[i++] = new File("./DaftarLagu/OldSchool/"+m.getJudul() + ".wav");
                    }
					if(m.jenisLagu.equals("New School")) {
						file[i++] = new File("./DaftarLagu/NewSchool/"+m.getJudul() + ".wav");
					}
                }
            }
		} else if(yangDiputar.equals("Playlist Pengguna")){
			if(pengguna.playlist.list.isEmpty()) {
				System.out.println("Playlist Kosong");
				return;
			}
			if(pengguna.statusKeanggotaan.equals("Free")){
				for(Musik m : pengguna.playlist.list) {
					if(m.jenisLagu.equals("Old School")) {
						file[i++] = new File("./DaftarLagu/OldSchool/"+m.getJudul() + ".wav");
					}
				}
			} else if(pengguna.statusKeanggotaan.equals("Premium")){
				for(Musik m : pengguna.playlist.list) {
					if(m.jenisLagu.equals("Old School")) {
						file[i++] = new File("./DaftarLagu/OldSchool/"+m.getJudul() + ".wav");
					}
					if(m.jenisLagu.equals("New School")) {
						file[i++] = new File("./DaftarLagu/NewSchool/"+m.getJudul() + ".wav");
					}
				}
			}
			
		}
		
		int banyakLagu = hitungTotalLagu(file);
		System.out.println("Daftar Lagu: ");
		printList(file);
		System.out.print("Pilih nomor lagu yang ingin Anda putar: ");
		int pilihan = in.nextInt();
		String response = "";
		if(pilihan > banyakLagu) {
			System.out.println("Nomor lagu tidak ada");
			response = "D";
		}
		while(true) {				
			if(response.equals("Q")) {
				return;
			} else if(response.equals("D")) {
				System.out.println("Daftar Lagu: ");
				printList(file);
				System.out.print("Pilih nomor lagu yang ingin Anda putar: ");
				pilihan = in.nextInt();
			} else if(response.equals("N")) {
				if(pilihan == banyakLagu) {
					pilihan = 1;
				} else pilihan++;
			}
			response = "";
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file[pilihan-1]);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			String fileName = file[pilihan-1].getName();
			String judul[] = fileName.split(".wav");
			System.out.println();
			System.out.println("Playing " + DaftarLaguSpookify.cariMusik(judul[0]));
			System.out.println(			
					"""		
					0:35 ━❍──────── -5:32
					↻     ⊲  Ⅱ  ⊳     ↺
					VOLUME: ▁▂▃▄▅▆▇ 100%
					""");
				
			while(!response.equals("N") && !response.equals("Q") && !response.equals("D")) {
				System.out.println("P = play, S = Stop, R = Reset, N = Next, M = Menu, Q = Quit");
				System.out.print("Enter your choice: ");
				
				response = in.next();
				response = response.toUpperCase();
				System.out.println(response);
				
				switch(response) {
					case ("P"): clip.start();
					break;
					case ("S"): clip.stop();
					break;
					case ("R"): clip.setMicrosecondPosition(0);
					break;
					case ("N"): clip.close();
					break;
					case ("D"): clip.close();
					return;
					case ("Q"): clip.close();
					break;
					default: System.out.println("Not a valid response");
				}
				System.out.println();
			 }
		}
	}

	public static void printList(File[] file){
		int i = 1;
		for(File f: file){
			if(f == null) break;
			String fileName = f.getName();
			String judul[] = fileName.split(".wav");
			for(String s : judul) {
				System.out.println((i++) +". " + s);
			}
		}
	}

	public static int hitungTotalLagu(File[] file){
		int i = 0;
		for(File f: file){
			if(f == null) break;
			i++;
		}
		return i;
	}
}