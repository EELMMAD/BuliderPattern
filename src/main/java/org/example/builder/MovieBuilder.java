package org.example.builder;

public class MovieBuilder implements PresentationBuilder{
    private Movie movie = new Movie();

    public void addSlide(Slide slide) {
    movie.addFrame(slide.getText(), 3);
    }

    public Movie getMovie(){
        return movie;
    }
}
