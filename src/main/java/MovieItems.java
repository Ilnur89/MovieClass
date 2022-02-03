public class MovieItems {
    private int id;
    private String ganrName;
    private String movieName;


    public MovieItems(int id, String ganrName, String movieName) {
        this.id = id;
        this.ganrName = ganrName;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }
}
