public class Crupier{
	Mano manoCrupier = new Mano();
	Baraja baraja = new Baraja();
	Jugador jugador;

	public Crupier(Jugador jugador)
	{
		this.jugador = jugador;
	}

	public void barajar(){
		baraja.barajar();
	}

	//Se reparten dos cartas al jugador y dos cartas al crupier, y se eliminan de la baraja.
	public void repartirInicio(){
		String cartaOculta = "#" + baraja.barajaCrupier.get(1);

		jugador.manoJugador.mano.add(baraja.barajaCrupier.get(0));
		manoCrupier.mano.add(cartaOculta);
		jugador.manoJugador.mano.add(baraja.barajaCrupier.get(2));
		manoCrupier.mano.add(baraja.barajaCrupier.get(3));
		for (int i = 0; i < 4; i++)
			baraja.barajaCrupier.remove(0);
			//Se coloca el indice 0, pq cada vez que se elimina un elemento del ArrayList, este ajusta el índice
	}

	//	Repartir una carta a jugador cuando lo solicite
	public boolean repartirUnaCartaJugador()
	{
		jugador.manoJugador.mano.add(baraja.barajaCrupier.get(0));
		baraja.barajaCrupier.remove(0);
		return (jugador.manoJugador.valorMano() <= 21); // Devuelve true si el jugador no se ha pasado de 21, puede seguir jugando
	}	

	//	El crupier se reparte cartas a sí mismo hasta alcanzar un valor de mano igual o mayor a 17
	public boolean  turnoCrupier()
	{
		int valorManoCrupier;
		while (true)
		{
			if (manoCrupier.valorMano() < 17)
			{
				manoCrupier.mano.add(baraja.barajaCrupier.get(0));
				baraja.barajaCrupier.remove(0);
			}
			else
				break;
		}
		return(manoCrupier.valorMano() <= 21); // Devuelve true si el crupier no se ha pasado de 21
	}
	
	public String verificarGanador () {
		if (jugador.manoJugador.valorMano() > manoCrupier.valorMano())
			return ("Jugador gana");
		else if (jugador.manoJugador.valorMano() < manoCrupier.valorMano())
			return ("Crupier gana");
		else
			return ("Empate");
	}
	
		public void reiniciarPartida() {
			manoCrupier.reiniciarMano();
			jugador.manoJugador.reiniciarMano();
			baraja.reiniciarBaraja();
		}
}
