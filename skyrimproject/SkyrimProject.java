
package skyrimproject;


public class SkyrimProject {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada Daedrica", 50);
        
        Dovahkiin jugador = new Dovahkiin("Sangre de Dragon", 500, 45, 200, 80, espada);
        Alduin dragon = new Alduin("El Devorador de Mundos", 5000, 100, 1000, 500, true);

        jugador.mostrarInfo();
        jugador.atacar();
        jugador.usarThuum();

        System.out.println("-----------------");

        dragon.mostrarInfo();
        dragon.usarThuum();
    }
}

