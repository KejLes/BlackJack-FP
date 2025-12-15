public class Jugador {
	Mano manoJugador = new Mano();
	int	dinero = 5000;

	public Jugador(){};

	//Método para decidir la siguiente jugada: hit, stand, double

	public String decidirJugada(Scanner sc)
	{
		while (true)
		{
			System.out.println("¿Qué desea hacer? (H)it, (S)tand, (D)ouble");
			String eleccion = sc.nextLine().toUpperCase();
			if (eleccion.equals("H") || eleccion.equals("S") || eleccion.equals("D"))
				return(eleccion);
			else
				System.out.println("Opción no válida, por favor elija H, S o D.");
		}
	}
}

