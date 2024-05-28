package app.demo.domain;

import java.sql.Date;

import lombok.Data;


@Data
public class Tutorial {
    private Long id;
    private String nombre;
    private String descripcion;
    private String url;
    private String estado; 
    private Date fecha;
    private String autor;

    
  
    public String obtenerInformacionDetallada() {
        return "ID: " + id +
                "\nNombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nURL: " + url +
                "\nEstado: " + estado +
                "\nFecha: " + fecha +
                "\nAutor: " + autor;
    }
    
    public Tutorial (){
        
    }

}
