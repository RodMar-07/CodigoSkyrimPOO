
package skyrimproject;


public abstract class Personaje {
    private String nombre;
    private int vida;
    private int nivel;
    private int magia;
    private int fuerza;

    public Personaje(String nombre, int vida, int nivel, int magia, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.magia = magia;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public abstract void mostrarInfo();
}
