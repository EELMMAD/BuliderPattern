package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {   //This class is composite because the presentation is collection of slides

    private List<Slide> slides = new ArrayList<Slide>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    //here need to specify target format and for that we need an Enum
    public void export(PresentationFormat format) {
        if (format == PresentationFormat.PDF) {
            PdfDocument pdf = new PdfDocument();
            for (Slide slide : slides) {
                pdf.addPage(slide.getText());
            }
        } else if (format == PresentationFormat.MOVIE) {
            Movie movie = new Movie();
            for (Slide slide : slides) {
                movie.addFrame(slide.getText(), 3);
            }
        }
    }
}
