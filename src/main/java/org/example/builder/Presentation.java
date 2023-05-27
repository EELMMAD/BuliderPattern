package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {   //This class is composite because the presentation is collection of slides

    private List<Slide> slides = new ArrayList<Slide>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    //here need to specify target format and for that we need an Enum
    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright"));
       for(Slide slide: slides){
           builder.addSlide(slide);
       }
    }
}
