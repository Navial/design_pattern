public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("Sun7", "HOUDI");
        Album album = builder.originalYear(2023)
                .version("1")
                .genre("rap")
                .build();
        System.out.println(album);
    }
}
