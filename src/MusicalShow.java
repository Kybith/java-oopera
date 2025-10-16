class MusicalShow extends Show {
    public String musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Метод для печати либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля '" + title + "':");
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return super.toString() + ", композитор: " + musicAuthor + " (музыкальный спектакль)";
    }
}