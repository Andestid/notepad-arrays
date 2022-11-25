
package Objeto;

public class Texto {
    private String texto;
    private String nombre;

    public Texto(String texto, String nombre) {
        this.texto = texto;
        this.nombre = nombre;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
