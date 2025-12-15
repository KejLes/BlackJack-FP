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
	public void repartirUnaCartaJugador()
	{
		jugador.manoJugador.mano.add(baraja.barajaCrupier.get(0));
		baraja.barajaCrupier.remove(0);
	}

	//	El crupier se reparte cartas a sí mismo hasta alcanzar un valor de mano igual o mayor a 17
	public void turnoCrupier()
	{
		int valorManoCrupier;
		while (true)
		{
			valorManoCrupier = manoCrupier.valorMano();
			if (valorManoCrupier < 17)
			{
				manoCrupier.mano.add(baraja.barajaCrupier.get(0));
				baraja.barajaCrupier.remove(0);
			}
			else
				break;
		}
	}

	//	Método para decidir si repartirse una carta a sí mismo
}
