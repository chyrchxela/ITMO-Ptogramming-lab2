package mymoves.staryu;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove{
	public ThunderWave(double pow, double acc) {
		super(Type.ELECTRIC, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		Effect.paralyze(p);
		Effect e = new Effect().attack(0.75);
		p.addEffect(e);
	}

}
