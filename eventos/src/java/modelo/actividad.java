package modelo;

public class actividad {
        
        String nombre;
        String lugar;
        String fecha;
        String hora;
        String destinado;
        String actividad;
        String curso;
        String profesor;
        String observaciones;

    public actividad() {
    }
        

    public actividad(String nombre, String lugar, String fecha, String hora, String destinado, String actividad, String curso, String profesor, String observaciones) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.destinado = destinado;
        this.actividad = actividad;
        this.curso = curso;
        this.profesor = profesor;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDestinado() {
        return destinado;
    }

    public void setDestinado(String destinado) {
        this.destinado = destinado;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
