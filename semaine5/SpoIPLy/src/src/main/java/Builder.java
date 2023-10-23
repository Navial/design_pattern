public class Builder {
    final String title;
    final String authorName;
    String label;
    String producer;
    String country;
    String version;
    String genre;
    int year;
    boolean remastered;
    int originalYear;

    public Builder(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
    }

    public Builder label(String label) {
        this.label = label;
        return this;
    }

    public Builder producer(String producer) {
        this.producer = producer;
        return this;
    }

    public Builder country(String country) {
        this.country = country;
        return this;
    }

    public Builder version(String version) {
        this.version = version;
        return this;
    }

    public Builder genre(String genre) {
        this.genre = genre;
        return this;
    }

    public Builder year(int year) {
        this.year = year;
        return this;
    }

    public Builder remastered(Boolean remastered) {
        this.remastered = remastered;
        return this;
    }

    public Builder originalYear(int originalYear) {
        this.originalYear = originalYear;
        return this;
    }

    public Album build() {
        return new Album(this);
    }
}
