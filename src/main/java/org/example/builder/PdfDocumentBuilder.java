package org.example.builder;

public class PdfDocumentBuilder implements PresentationBuilder{
    private PdfDocument document = new PdfDocument();

    public void addSlide(Slide slide) {
      document.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument(){
        return document;
    }
}
