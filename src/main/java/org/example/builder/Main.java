package org.example.builder;

public class Main {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();

        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        PdfDocumentBuilder presentationBuilder = new PdfDocumentBuilder();
        presentation.export(presentationBuilder);
        presentationBuilder.getPdfDocument();

        MovieBuilder builder = new MovieBuilder();
        presentation.export(builder);
        builder.getMovie();
    }
}
