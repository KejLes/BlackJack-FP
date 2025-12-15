import java.util.ArrayList;

public class MainPrueba {
	public static void main(String[] args) {
		Jugador jugador = new Jugador();
		Crupier crupier = new Crupier(jugador);

		crupier.barajar();
		System.out.println(crupier.baraja.barajaCrupier);
		System.out.println(crupier.baraja.barajaCrupier.size());
		
		crupier.repartirInicio();

		crupier.repartirUnaCartaJugador();
		crupier.turnoCrupier();

		System.out.println(jugador.dinero);
		System.out.println(jugador.manoJugador.mano);
		jugador.manoJugador.imprimirMano();
		System.out.println(jugador.manoJugador.valorMano());

		System.out.println(crupier.manoCrupier.mano);
		crupier.manoCrupier.imprimirMano();
		System.out.println(crupier.manoCrupier.valorMano());

		System.out.println(crupier.baraja.barajaCrupier);
		System.out.println(crupier.baraja.barajaCrupier.size());
		
	}
}
