package com.basit.pdfadmin;

public class PdfClass {
    private String pdfName  , pdfUrl , unit , clas , subject ;

    public PdfClass(String pdfName, String pdfUrl, String unit, String clas, String subject) {
        this.pdfName = pdfName;
        this.pdfUrl = pdfUrl;
        this.unit = unit;
        this.clas = clas;
        this.subject = subject;
    }

    public PdfClass() {
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
