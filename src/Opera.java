class Opera extends MusicalShow {
    public int choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", размер хора: " + choirSize + " человек (опера)";
    }
}