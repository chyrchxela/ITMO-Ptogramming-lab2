package mypokemons;

import mymoves.starmie.DreamEater;
import mymoves.staryu.FlashCannon;
import mymoves.staryu.IceBeam;
import mymoves.staryu.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Starmie extends Pokemon{
	public Starmie(String name, int level) {
		super(name, level);
		super.setType(Type.WATER, Type.PSYCHIC);
		super.setStats(60, 75, 85, 100, 85, 115);
		
		DreamEater dreamEater = new DreamEater(100,100);
		ThunderWave thunderWave = new ThunderWave(0,90);
		IceBeam iceBeam = new IceBeam(90, 100);
		FlashCannon flashCannon = new FlashCannon(80, 100);
		
		super.setMove(dreamEater, thunderWave, iceBeam, flashCannon);
		
	}
}
