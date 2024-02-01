package lab2;

import mypokemons.Poliwag;
import mypokemons.Poliwhirl;
import mypokemons.Poliwrath;
import mypokemons.Starmie;
import mypokemons.Staryu;
import mypokemons.Togedemaru;
import ru.ifmo.se.pokemon.Battle;

public class Program {

	public static void main(String[] args) {
		Battle b = new Battle();
		
		Togedemaru p1 = new Togedemaru("Strange", 1);
		Starmie p2 = new Starmie("Coconut", 1);
		Staryu p3 = new Staryu("Melki", 1);
		Poliwrath p4 = new Poliwrath("Ambal",1);
		Poliwhirl p5 = new Poliwhirl("Whoho",1);
		Poliwag p6 = new Poliwag("Poli",1);
		
		b.addAlly(p1);
		b.addAlly(p6);
		b.addAlly(p3);
		
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p5);
		
		b.go();
	}
	public static boolean chance(double d) {
		return d > Math.random();
	}

}
