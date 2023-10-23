public class Album {

    private final String title;
    private final String authorName;
    private final String label;
    private final String producer;
    private final String country;
    private final String version;
    private final String genre;
    private final int year;
    private final boolean remastered;
    private final int originalYear;

    public Album(Builder builder) {
        this.title = builder.title;
        this.authorName = builder.authorName;
        this.label = builder.label;
        this.producer = builder.producer;
        this.country = builder.country;
        this.version = builder.version;
        this.genre = builder.genre;
        this.year = builder.year;
        this.remastered = builder.remastered;
        this.originalYear = builder.originalYear;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", label='" + label + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", version='" + version + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", remastered=" + remastered +
                ", originalYear=" + originalYear +
                '}';
    }
}

