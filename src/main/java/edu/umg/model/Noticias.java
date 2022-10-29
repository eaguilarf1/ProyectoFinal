package edu.umg.model;

public class Noticias {
    private String correlativo;
    private String title;
    private String abstracto;
    private String byline;
    private String url;

    /**
     *
     * @param correlativo
     * @param title
     * @param abstracto
     * @param byline
     * @param url
     */

    //Constructor
    public Noticias(String correlativo, String title, String abstracto, String byline, String url) {
        this.correlativo = correlativo; //indentificador de la noticia
        this.title = title; // titulo de la noticia
        this.abstracto = abstracto; // Descripcion de la noticia
        this.byline = byline; // autor de la noticia
        this.url = url; // link que redirige a una imagen
    }

    /**
     *
     * @return
     */


    // setters y getters

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstracto() {
        return abstracto;
    }

    public void setAbstracto(String abstracto) {
        this.abstracto = abstracto;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
