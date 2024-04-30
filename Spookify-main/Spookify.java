import java.util.*;

public class Spookify {

    public static void main(String[] args) {

        Musik thriller = new MusikOldSchool("Thriller", "Pop", "1982", "Michael Jackson", "Michael Jackson");
        Musik bornInTheUSA = new MusikOldSchool("Born in the U.S.A.", "Rock", "1984", "Bruce Springsteen", "Bruce Springsteen");
        Musik purpleRain = new MusikOldSchool("Purple Rain", "Rock", "1984", "Prince", "Prince");
        Musik rumours = new MusikOldSchool("Rumours", "Pop Rock", "1977", "Fleetwood Mac", "Fleetwood Mac");
        Musik theImmaculateCollection = new MusikOldSchool("The Immaculate Collection", "Pop", "1990", "Madonna", "Madonna");
        Musik hotelCalifornia = new MusikOldSchool("Hotel California", "Rock", "1976", "Eagles", "Eagles");
        Musik backInBlack = new MusikOldSchool("Back in Black", "Hard Rock", "1980", "AC/DC", "AC/DC");
        Musik theWall = new MusikOldSchool("The Wall", "Progressive Rock", "1979", "Pink Floyd", "Pink Floyd");
        Musik appetiteForDestruction = new MusikOldSchool("Appetite for Destruction", "Hard Rock", "1987", "Guns N' Roses", "Guns N' Roses");
        Musik nevermind = new MusikOldSchool("Nevermind", "Grunge", "1991", "Nirvana", "Nirvana");
    
        Musik folklore = new MusikNewSchool("Folklore", "Alternative", "2021", "Taylor Swift", "Taylor Swift");
        Musik afterHours = new MusikNewSchool("After Hours", "R&B", "2021", "The Weeknd", "The Weeknd");
        Musik chromatica = new MusikNewSchool("Chromatica", "Pop", "2021", "Lady Gaga", "Lady Gaga");
        Musik sawayama = new MusikNewSchool("Sawayama", "Pop", "2021", "Rina Sawayama", "Rina Sawayama");
        Musik punisher = new MusikNewSchool("Punisher", "Indie Rock", "2021", "Phoebe Bridgers", "Phoebe Bridgers");
        Musik plasticHearts = new MusikNewSchool("Plastic Hearts", "Pop Rock", "2021", "Miley Cyrus", "Miley Cyrus");
        Musik fetchTheBoltCutters = new MusikNewSchool("Fetch the Bolt Cutters", "Alternative", "2021", "Fiona Apple", "Fiona Apple");
        Musik notesOnAConditionalForm = new MusikNewSchool("Notes on a Conditional Form", "Indie Rock", "2021", "The 1975", "The 1975");
        Musik positions = new MusikNewSchool("Positions", "Pop", "2021", "Ariana Grande", "Ariana Grande");
        Musik elUltimoTourDelMundo = new MusikNewSchool("El Ultimo Tour Del Mundo", "Latin Pop", "2021", "Bad Bunny", "Bad Bunny");
        
        Musik style = new MusikNewSchool("Style", "Horror", "2020", "Taylor Swift", "TaylorSwift");
        Musik romeo = new MusikOldSchool("Romeo", "Action", "2010", "Artist1", "Pencipta1");
    
       
        // System.out.println(taylor3.toString());
        Pengguna fadil = new PenggunaPremium("fadil jelek");
        Pengguna barok = new PenggunaFree("barok");

        barok.tambahPlaylist("Style");
        barok.playlist.tampilkanDaftar();
        fadil.playlist.tampilkanDaftar();
        System.out.println(""" 
        ======================= Selamat Datang di Spookifyy ========================
        """);

        // System.out.println(fadil.toString());
        // System.out.println(barok.toString());
        // // MusikNewSchool.newSchool.tampilkanDaftar();

        // fadil.

        // ((PenggunaPremium)fadil).ambilListLagu(2);
        // ((PenggunaPremium)fadil).ambilListLagu(3);
        // ((PenggunaPremium)fadil).ambilListLagu(1);

        // ((PenggunaFree)barok).ambilListLagu(1);
        // ((PenggunaFree)barok).ambilListLagu(3); 
        // ((PenggunaFree)fadil).ListLaguLama(); 
        

        // fadil.tambahPlaylist(taylor3);

    }

}
