package Servlets;

import java.util.Date;

public class partes implements Comparable<partes>{
    String nombre,apellido1,apellido2;
    String nºSS;
    String fechaIngreso,fechaNacimiento;
    String CIF,CCC;
    String razonSocial;
    String descripcion;

    public partes(String nombre, String apellido1, String apellido2, String nºSS, String fechaIngreso, String fechaNacimiento, String CIF, String CCC, String razonSocial, String descripcion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nºSS = nºSS;
        this.fechaIngreso = fechaIngreso;
        this.fechaNacimiento = fechaNacimiento;
        this.CIF = CIF;
        this.CCC = CCC;
        this.razonSocial = razonSocial;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNºSS() {
        return nºSS;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCIF() {
        return CIF;
    }

    public String getCCC() {
        return CCC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNºSS(String nºSS) {
        this.nºSS = nºSS;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public void setCCC(String CCC) {
        this.CCC = CCC;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(partes o) {
        
        return this.apellido1.compareTo(o.getApellido1());
    }
    
    
}
