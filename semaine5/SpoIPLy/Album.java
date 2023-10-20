public class Album {

    private String title;
    private String authorName;
    private String label;
    private String producer;
    private String country;
    private String vesrion;
    private String genre;
    private int year;
    private boolean remastered;
    private int originalYear;

    private Album(Builder builder){

    }

    private class Builder{
        private String title;
        private String authorName;
        private String label;
        private String producer;
        private String country;
        private String vesrion;
        private String genre;
        private int year;
        private boolean remastered;
        private int originalYear;

        public Builder(String title, String authorName){
            this.title = title;
            this.authorName = authorName;
        }



    }

}
