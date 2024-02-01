package mypokemons;

import mymoves.poliwag.Psychic;
import mymoves.poliwag.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon{
	public Poliwag(String name, int level) {
		super(name, level);
		super.setType(Type.WATER);
		super.setStats(40, 50, 40, 40, 40, 90);
		
		Psychic psychic = new Psychic(90, 100);
		Waterfall waterfall = new Waterfall(80,100);
		
		super.setMove(psychic, waterfall);

	}
}