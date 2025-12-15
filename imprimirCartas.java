

import java.util.ArrayList;

public class ImprimirCartas {
	public ImprimirCartas (){}

	public void imprimir(ArrayList<String> cartas)
	{
		System.out.println(cartas);
		//Imprimir linaa 1
		for(int i = 0; i < cartas.size(); i++)
		{
			System.out.print(" ___  ");
		}
		System.out.print("\n");
		//Imprimir linea 2
		for(int i = 0; i < cartas.size(); i++)
		{
			if (cartas.get(i).charAt(0) == '#')
				System.out.print("|## | ");
			else if (cartas.get(i).contains("10"))
				System.out.print("|10 | ");
			else
				System.out.print("|" + cartas.get(i).charAt(0) + "  | ");
		}
		System.out.print("\n");
		//Imprimir linaa 3
		for(int i = 0; i < cartas.size(); i++)
		{
			if (cartas.get(i).charAt(0) == '#')
				System.out.print("|###| ");
			else if (cartas.get(i).contains("10"))
				System.out.print("| " + cartas.get(i).charAt(2) + " | ");
			else
				System.out.print("| " + cartas.get(i).charAt(1) + " | ");
		}
		System.out.print("\n");
		//Imprimir linaa 4
		for(int i = 0; i < cartas.size(); i++)
		{
			if (cartas.get(i).charAt(0) == '#')
				System.out.print("|_##| ");
			else if (cartas.get(i).contains("10"))
				System.out.print("|_10| ");
			else
				
				System.out.print("|__" + cartas.get(i).charAt(0) + "| ");
		}
		System.out.print("\n");
	}
}
