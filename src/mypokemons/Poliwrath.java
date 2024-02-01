package mypokemons;

import mymoves.poliwag.Psychic;
import mymoves.poliwag.Waterfall;
import mymoves.poliwhirl.BellyDrum;
import mymoves.poliwrath.BulkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwrath extends Pokemon{
	public Poliwrath(String name, int level) {
		super(name, level);
		super.setType(Type.WATER, Type.FIGHTING);
		super.setStats(90, 95, 95, 70, 90, 70);
		
		Psychic psychic = new Psychic(90, 100);
		Waterfall waterfall = new Waterfall(80,100);
		BellyDrum bellyDrum = new BellyDrum(0, 0);
		BulkUp bulkUp = new BulkUp(0,0);
		
		super.setMove(psychic, waterfall, bellyDrum, bulkUp);

	}
}