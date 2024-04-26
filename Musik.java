public class Musik{
    private String judul, genre, tahun, artist, pencipta;

    public Musik(String judul, String genre, String tahun, String artist, String pencipta) {
        this.judul = judul;
        this.genre = genre;
        this.tahun = tahun;
        this.artist = artist;
        this.pencipta = pencipta;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTahun() {
        return this.tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPencipta() {
        return this.pencipta;
    }

    public void setPencipta(String pencipta) {
        this.pencipta = pencipta;
    }

    
}