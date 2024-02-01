package mypokemons;

import mymoves.togedemaru.BrutalSwing;
import mymoves.togedemaru.Bulldoze;
import mymoves.togedemaru.DragonClaw;
import mymoves.togedemaru.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togedemaru extends Pokemon{
	public Togedemaru(String name, int level) {
		super(name, level);
		super.setType(Type.FIGHTING, Type.GHOST);
		super.setStats(65, 98, 63, 40, 73, 96);
		
		Tackle tackle = new Tackle(40, 100);
		BrutalSwing brutalSwing = new BrutalSwing(60, 100);
		Bulldoze bulldoze = new Bulldoze(60, 100);
		DragonClaw dragonClaw = new DragonClaw(80, 100);
		
		super.setMove(tackle, brutalSwing, bulldoze, dragonClaw);
	}

}
