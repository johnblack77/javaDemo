package staticproxy;

public class Cinema implements Movie {

    RealMovie movie;

    public Cinema(RealMovie movie) {
        super();
        this.movie = movie;
    }


    @Override
    public void play() {

        movie.play();

    }
}