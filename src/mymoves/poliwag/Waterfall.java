package mymoves.poliwag;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
	public Waterfall(double pow, double acc) {
		super(Type.WATER, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		if(Program.chance(0.2)) {
			Effect.flinch(p);
		}
	}
}