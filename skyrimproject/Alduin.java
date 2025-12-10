
package skyrimproject;


public class Alduin extends Personaje implements GritoDragon {
    private boolean vuela;

    public Alduin(String nombre, int vida, int nivel, int magia, int fuerza, boolean vuela) {
        super(nombre, vida, nivel, magia, fuerza);
        this.vuela = vuela;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    @Override
    public void usarThuum() {
        System.out.println("YOL TOOR SHUL (Fuego infernal)");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Enemigo: " + getNombre() + " | Nivel: " + getNivel() + " | Vida: " + getVida() + " | Magia: " + getMagia() + " | Fuerza: " + getFuerza());
    }
}
