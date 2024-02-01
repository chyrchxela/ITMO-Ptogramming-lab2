package mypokemons;

import mymoves.poliwag.Psychic;
import mymoves.poliwag.Waterfall;
import mymoves.poliwhirl.BellyDrum;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Pokemon{
	public Poliwhirl(String name, int level) {
		super(name, level);
		super.setType(Type.WATER);
		super.setStats(65, 65, 65, 50, 50, 90);
		
		Psychic psychic = new Psychic(90, 100);
		Waterfall waterfall = new Waterfall(80,100);
		BellyDrum bellyDrum = new BellyDrum(0, 0);
		
		super.setMove(psychic, waterfall, bellyDrum);

	}
}
