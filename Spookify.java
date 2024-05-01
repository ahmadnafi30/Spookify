import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Spookify {

    static int banyakPelanggan;

    public static void main(String[] args) {
        
        Musik happier = new MusikOldSchool("Happier", "Pop", "2017", "Ed Sheeran", "Ed Sheeran");
        Musik musik1 = new MusikOldSchool("505", "Rock", "2007", "Arctic Monkeys", "Arctic Monkeys");
        Musik musik2 = new MusikOldSchool("Champagne Supernova", "Rock", "1995", "Oasis", "Oasis");
        Musik musik3 = new MusikOldSchool("Hey Jude", "Pop", "1968", "The Beatles", "The Beatles");
        Musik musik4 = new MusikOldSchool("Married With Children", "Pop Rock", "1994", "Oasis", "Oasis");
        Musik musik5 = new MusikOldSchool("No Surprises", "Rock", "1997", "Radiohead", "Radiohead");
        Musik musik6 = new MusikOldSchool("Sparks", "Rock", "2000", "Coldplay", "Coldplay");
        Musik musik7 = new MusikOldSchool("Stand By Me", "Rock", "1997", "Oasis", "Oasis");
        Musik musik8 = new MusikOldSchool("I Love You So", "Rock", "2015", "The Walters", "The Walters");
        Musik musik9 = new MusikOldSchool("Wonderwall", "Rock", "1995", "Oasis", "Oasis");

        Musik shivers = new MusikNewSchool("Shivers", "Pop", "2021", "Ed Sheeran", "Ed Sheeran");
        Musik glimpse = new MusikNewSchool("Glimpse of Us", "R&B", "2022", "Joji", "Joji");
        Musik fallingBehind = new MusikNewSchool("Falling Behind", "Jazz", "2022", "Laufey", "Laufey");
        Musik fromTheStart = new MusikNewSchool("From The Start", "Bossa Nova", "2023", "Laufey", "Laufey");
        Musik leaveTheDoorOpen = new MusikNewSchool("Leave the door open", "R&B/Soul", "2021", "Rex Orange County", "Rex Orange County");
        Musik amazing = new MusikNewSchool("AMAZING", "Alternative/Indie", "2022", "Rex Orange County", "Rex Orange County");
        Musik sweet = new MusikNewSchool("I Thought You Wanted To Dance", "Hip Hop", "2021", "Tyler, The Creator", "Tyler, The Creator");
        // Musik thriller = new MusikOldSchool("Thriller", "Pop", "1982", "Michael Jackson", "Michael Jackson"); 
        // Musik bornInTheUSA = new MusikOldSchool("Born in the U.S.A.", "Rock", "1984", "Bruce Springsteen", "Bruce Springsteen");
        // Musik purpleRain = new MusikOldSchool("Purple Rain", "Rock", "1984", "Prince", "Prince");
        // Musik rumours = new MusikOldSchool("Rumours", "Pop Rock", "1977", "Fleetwood Mac", "Fleetwood Mac");
        // Musik theImmaculateCollection = new MusikOldSchool("The Immaculate Collection", "Pop", "1990", "Madonna", "Madonna");
        // Musik hotelCalifornia = new MusikOldSchool("Hotel California", "Rock", "1976", "Eagles", "Eagles");
        // Musik backInBlack = new MusikOldSchool("Back in Black", "Hard Rock", "1980", "AC/DC", "AC/DC");
        // Musik theWall = new MusikOldSchool("The Wall", "Progressive Rock", "1979", "Pink Floyd", "Pink Floyd");
        // Musik appetiteForDestruction = new MusikOldSchool("Appetite for Destruction", "Hard Rock", "1987", "Guns N' Roses", "Guns N' Roses");
        // Musik nevermind = new MusikOldSchool("Nevermind", "Grunge", "1991", "Nirvana", "Nirvana");
    
        // Musik folklore = new MusikNewSchool("Folklore", "Alternative", "2021", "Taylor Swift", "Taylor Swift");
        // Musik afterHours = new MusikNewSchool("After Hours", "R&B", "2021", "The Weeknd", "The Weeknd");
        // Musik chromatica = new MusikNewSchool("Chromatica", "Pop", "2021", "Lady Gaga", "Lady Gaga");
        // Musik sawayama = new MusikNewSchool("Sawayama", "Pop", "2021", "Rina Sawayama", "Rina Sawayama");
        // Musik punisher = new MusikNewSchool("Punisher", "Indie Rock", "2021", "Phoebe Bridgers", "Phoebe Bridgers");
        // Musik plasticHearts = new MusikNewSchool("Plastic Hearts", "Pop Rock", "2021", "Miley Cyrus", "Miley Cyrus");
        // Musik fetchTheBoltCutters = new MusikNewSchool("Fetch the Bolt Cutters", "Alternative", "2021", "Fiona Apple", "Fiona Apple");
        // Musik notesOnAConditionalForm = new MusikNewSchool("Notes on a Conditional Form", "Indie Rock", "2021", "The 1975", "The 1975");
        // Musik positions = new MusikNewSchool("Positions", "Pop", "2021", "Ariana Grande", "Ariana Grande");
        // Musik elUltimoTourDelMundo = new MusikNewSchool("El Ultimo Tour Del Mundo", "Latin Pop", "2021", "Bad Bunny", "Bad Bunny");
        
        // Musik style = new MusikNewSchool("Style", "Horror", "2020", "Taylor Swift", "TaylorSwift");
        // Musik romeo = new MusikOldSchool("Romeo", "Action", "2010", "Artist1", "Pencipta1");

System.out.println(""" 
        ======================= Selamat Datang di Spookify =========================

                                      ████████████████                  
                                   ████░░░░░░░░░░░░░░████              
                                 ██░░░░              ░░░░██            
                               ██░░                      ░░██          
                             ██░░                          ░░██        
                           ██░░                              ░░██      
                           ██░░                              ░░██      
                         ██░░            ████          ████  ░░░░██    
                         ██░░            ████          ████    ░░██    
                         ██░░            ████          ████    ░░██    
                         ██░░        ░░░░                  ░░░░░░██    
                         ██░░        ░░░░        ████      ░░░░░░██    
                         ██░░                                  ░░████  
                         ██░░                                    ░░░░██
                         ██░░                                      ░░██
                 ██    ██░░                                    ░░░░░░██
               ██░░████░░                                    ░░████████
               ██░░░░░░                                    ░░██        
               ██░░                                        ░░██        
               ██░░░░                                    ░░██          
                 ████░░                                ░░██            
                     ██░░░░                        ░░░░██              
                       ████░░░░░░░░░░░░░░░░░░░░░░░░████                
                         ██████████████████████████                 

        ==========================================================================
        """);
        Scanner in = new Scanner(System.in);
        Pengguna[] listPengguna = new Pengguna[10];
        System.out.println("Sebelum menggunakan aplikasi, silahkan mendaftar terlebih dahulu");
        tambahPengguna(listPengguna, in);

        String penggunaSekarang = listPengguna[0].nama;
        int indexPenggunaSekarang = 0;
        int pilihan = 0;
        boolean berjalan = true;
        while(berjalan){
            System.out.println("Berikut adalah hal-hal yang Anda bisa lakukan :");
            System.out.println("1. Tampilkan List Lagu Spookify yang Bisa Anda Tambah/Mainkan");
            System.out.println("2. Tambah Lagu ke Playlist Anda");
            System.out.println("3. Putar Lagu dari Playlist Spookify");
            System.out.println("4. Putar Lagu dari Playlist Anda");
            System.out.println("5. Tampilkan Playlist Anda");
            System.out.println("6. Tambah Pengguna");
            System.out.println("7. Ganti Pengguna");
            System.out.println("8. Data Profil Anda");
            System.out.println("9. Keluar");
            System.out.print("Masukkan nomor menu yang ingin dilakukan : ");
            
            pilihan = in.nextInt();

            System.out.println();
            switch (pilihan) {
                case 1:   
                    System.out.println("Daftar Lagu: ");
                    if(listPengguna[indexPenggunaSekarang].statusKeanggotaan.equalsIgnoreCase("Premium")){
                        System.out.println("\nOld School: ");
                        DaftarLaguSpookify.tampilkanDaftar(1);
                        System.out.println();
                        System.out.println("New School: ");
                        DaftarLaguSpookify.tampilkanDaftar(2);
                    } else{
                        DaftarLaguSpookify.tampilkanDaftar(1);
                    }
                    break;
                case 2:
                    in.nextLine();
                    System.out.print("Masukkan judul lagu yang ingin ditambahkan ke playlist : ");
                    String lagu = in.nextLine();
                    listPengguna[indexPenggunaSekarang].tambahPlaylist(lagu);
                    break;
                case 3:
                    try {
                        MusikMechanic.play(in, listPengguna[indexPenggunaSekarang], "Playlist Spokify");
                    } catch (UnsupportedAudioFileException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        MusikMechanic.play(in, listPengguna[indexPenggunaSekarang], "Playlist Pengguna");
                    } catch (UnsupportedAudioFileException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    listPengguna[indexPenggunaSekarang].ambilListLagu();
                    break;
                case 6:
                    in.nextLine();
                    tambahPengguna(listPengguna, in);
                    break;
                case 7:
                    System.out.print("Masukkan nama pengguna yang ingin digunakan : ");
                    in.nextLine();
                    String pengguna = in.nextLine();    
                    int temp = cariPelanggan(pengguna, listPengguna);
                    if(temp == -1){
                        System.out.println("Pengguna tidak ditemukan");
                        break;
                    } else indexPenggunaSekarang = temp;
                    System.out.println("Selamat datang kembali " + listPengguna[indexPenggunaSekarang].nama);
                    break;
                case 8:
                    System.out.println(listPengguna[indexPenggunaSekarang].toString());
                    break;
                case 9:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    berjalan = false;
                    break;
                default:
                    break;
            }
            System.out.println();
        }
                

    }

    public static void tambahPengguna(Pengguna[] listPengguna, Scanner in){

        if(banyakPelanggan == listPengguna.length){
            System.out.println("Pengguna sudah penuh");
            return; 
        }
        
        System.out.print("Masukkan nama Anda               : ");
        String namaPelanggan = in.nextLine();
        System.out.print("Apakah Anda ingin premium? (y/n) : ");
        String statusKeanggotaan = in.nextLine();
        System.out.println();
        
        if(statusKeanggotaan.equalsIgnoreCase("y")){
            listPengguna[banyakPelanggan] = new PenggunaPremium(namaPelanggan);
        } else if(statusKeanggotaan.equalsIgnoreCase("n")){
            listPengguna[banyakPelanggan] = new PenggunaFree(namaPelanggan); 
        }
        System.out.println("Selamat Datang, "+ namaPelanggan +"! Berikut adalah informasi akun Anda\n" + listPengguna[banyakPelanggan++].toString());
        System.out.println();
    }

    public static int cariPelanggan(String nama, Pengguna[] listPengguna){
        for (int i = 0; i < listPengguna.length; i++) {
            if(listPengguna[i] != null)
                if (listPengguna[i].nama.equals(nama)) {
                    return i;
                }
        }
        return -1;
    }
}
