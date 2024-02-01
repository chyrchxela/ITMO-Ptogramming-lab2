package mymoves.staryu;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FlashCannon extends SpecialMove{
	public FlashCannon(double pow, double acc) {
		super(Type.STEEL, pow, acc);
	}
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		if(Program.chance(0.1)) {
			Effect e= new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
			p.addEffect(e);
		}
	}

}
