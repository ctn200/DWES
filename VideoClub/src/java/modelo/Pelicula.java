package modelo;

public class Pelicula {
    
        String titulo,fecha,director;

    public Pelicula(String titulo, String director, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
        
}
