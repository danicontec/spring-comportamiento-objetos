package usospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Empleado implements Informe{
    private String nombre;
    private String apellido;
    private String direccion;
    private String Informe;
    @Autowired
    private Informe informe;
    @Autowired
    public Empleado(Informe informe) {
        this.informe = informe;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setInforme(String informe) {
        Informe = informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getInforme() {
        return Informe;
    }

    @Override
    public String getDocument() {
        return getInforme();
    }


}
