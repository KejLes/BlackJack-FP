

import java.util.ArrayList;
import java.util.List;

public class Baraja {
	ArrayList<String> barajaCrupier = new ArrayList<>(List.of(
		"A♠","2♠","3♠","4♠","5♠","6♠","7♠","8♠","9♠","10♠","J♠","Q♠","K♠",
		"A♥","2♥","3♥","4♥","5♥","6♥","7♥","8♥","9♥","10♥","J♥","Q♥","K♥",
		"A♦","2♦","3♦","4♦","5♦","6♦","7♦","8♦","9♦","10♦","J♦","Q♦","K♦",
		"A♣","2♣","3♣","4♣","5♣","6♣","7♣","8♣","9♣","10♣","J♣","Q♣","K♣"
	));
	
	public Baraja(){}
	
	public void barajar(){
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
	}
}
