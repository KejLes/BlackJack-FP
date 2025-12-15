

import java.util.ArrayList;
import java.util.List;

public class baraja {
	ArrayList<String> barajaCrupier = new ArrayList<>(List.of(
		"A♠","2♠","3♠","4♠","5♠","6♠","7♠","8♠","9♠","10♠","J♠","Q♠","K♠",
		"A♥","2♥","3♥","4♥","5♥","6♥","7♥","8♥","9♥","10♥","J♥","Q♥","K♥",
		"A♦","2♦","3♦","4♦","5♦","6♦","7♦","8♦","9♦","10♦","J♦","Q♦","K♦",
		"A♣","2♣","3♣","4♣","5♣","6♣","7♣","8♣","9♣","10♣","J♣","Q♣","K♣"
	));
	
	public baraja(){}
	
	public ArrayList<String> barajar(){
		int randNum;
		for (int i = 0; i < 10; i++)
		{
			ArrayList<String> barajaTemp = new ArrayList<>();
			while (!barajaCrupier.isEmpty())
			{
				randNum = (int)(Math.random() * (barajaCrupier.size()));
				barajaTemp.add(barajaCrupier.get(randNum));
				barajaCrupier.remove(randNum);
			}
			barajaCrupier = barajaTemp;
			barajaTemp = null;
		}
		return (barajaCrupier);
	}
	public static void main(String[] args) {
		baraja baraja = new baraja();
		imprimirCartas imp = new imprimirCartas();

		System.out.println(baraja.barajar());

		ArrayList<String> list = new ArrayList<>();

		String a = "#" + baraja.barajaCrupier.get(0);
		list.add(a);
		list.add(baraja.barajaCrupier.get(1));
		list.add(baraja.barajaCrupier.get(2));
		list.add(baraja.barajaCrupier.get(3));

		imp.imprimir(list);
	}
}
