import java.util.ArrayList;

public class Mano {

	public ArrayList<String> mano = new ArrayList<>();

	public Mano() {};

	// Método para identificar el valor de las cartas
	public int valorMano()
	{
		int valorMano = 0;
		int numAses = 0;
		String cartaStr;
		for (int i = 0; i < mano.size(); i++)
		{
			cartaStr = mano.get(i);
			if (cartaStr.contains("J") || cartaStr.contains("Q") ||
				cartaStr.contains("K") || cartaStr.contains("10"))
				valorMano += 10;
			else if (cartaStr.contains("2"))
				valorMano += 2;
			else if (cartaStr.contains("3"))
				valorMano += 3;
			else if (cartaStr.contains("4"))
				valorMano += 4;
			else if (cartaStr.contains("5"))
				valorMano += 5;
			else if (cartaStr.contains("6"))
				valorMano += 6;
			else if (cartaStr.contains("7"))
				valorMano += 7;
			else if (cartaStr.contains("8"))
				valorMano += 8;
			else if (cartaStr.contains("9"))
				valorMano += 9;
			else if (cartaStr.contains("A"))
				numAses++;
		}
		/*	Para los Ases, solamente compruebo con el último as si le sumo 1 o 11, todos los demás posibles ases le sumo 1
			Si con el último As sobrepaso el 21, le sumo 1, sino le sumo 11.
		*/
		for (int i = 0; i < numAses; i++)
		{
			if (i != numAses - 1)
				valorMano++;
			else
			{
				if (valorMano + 11 <= 21)
					valorMano += 11;
				else
					valorMano++;
			}
		}
		return (valorMano);
	}

	// Reemplazar la carta oculta por la carta real y llamar a imprimirMano
	public void imprimirManoSinOcultar() {
		if (this.mano.get(0).contains("#"))
			this.mano.set(0, this.mano.get(0).substring(1));
		imprimirMano();
	}

	public void imprimirMano() {
		try {
			// Imprimir linaa 1
			for (int i = 0; i < this.mano.size(); i++)
				System.out.print(" ___  ");
			System.out.print("\n");
			// Imprimir linea 2
			for (int i = 0; i < this.mano.size(); i++) {
				if (this.mano.get(i).charAt(0) == '#')
					System.out.print("|## | ");
				else if (this.mano.get(i).contains("10"))
					System.out.print("|10 | ");
				else
					System.out.print("|" + this.mano.get(i).charAt(0) + "  | ");
			}
			System.out.print("\n");
			// Imprimir linaa 3
			for (int i = 0; i < this.mano.size(); i++) {
				if (this.mano.get(i).charAt(0) == '#')
					System.out.print("|###| ");
				else if (this.mano.get(i).contains("10"))
					System.out.print("| " + this.mano.get(i).charAt(2) + " | ");
				else
					System.out.print("| " + this.mano.get(i).charAt(1) + " | ");
			}
			System.out.print("\n");
			// Imprimir linaa 4
			for (int i = 0; i < this.mano.size(); i++) {
				if (this.mano.get(i).charAt(0) == '#')
					System.out.print("|_##| ");
				else if (this.mano.get(i).contains("10"))
					System.out.print("|_10| ");
				else

					System.out.print("|__" + this.mano.get(i).charAt(0) + "| ");
			}
			System.out.print("\n");
		} catch (Exception e) {
			System.out.println("Error al imprimir mano: " + e.getMessage());
		}
	}

	public void reiniciarMano() {
		mano.clear();
	}
}