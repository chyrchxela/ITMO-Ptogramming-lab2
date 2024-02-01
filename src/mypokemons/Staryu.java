package mypokemons;

import mymoves.staryu.FlashCannon;
import mymoves.staryu.IceBeam;
import mymoves.staryu.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Staryu extends Pokemon{
	public Staryu(String name, int level) {
		super(name, level);
		super.setType(Type.WATER);
		super.setStats(30, 45, 55, 70, 55, 85);
		
		ThunderWave thunderWave = new ThunderWave(0,90);
		IceBeam iceBeam = new IceBeam(90, 100);
		FlashCannon flashCannon = new FlashCannon(80, 100);
		
		super.setMove(thunderWave, iceBeam, flashCannon);
		
	}
}
