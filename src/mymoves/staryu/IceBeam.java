package mymoves.staryu;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
	public IceBeam(double pow, double acc) {
		super(Type.ICE, pow, acc);
	}
	
		@Override
		protected String describe() {
			String[] pieces = this.getClass().toString().split("\\.");
			return "does " + pieces[pieces.length-1];
		}

		@Override
		protected void applyOppEffects(Pokemon p) {
			super.applyOppEffects(p);
			
			if(Program.chance(0.1)) {
				Effect.freeze(p);
			}
		}
}
