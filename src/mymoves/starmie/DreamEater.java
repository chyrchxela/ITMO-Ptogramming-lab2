package mymoves.starmie;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove{
	public DreamEater(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		if (p.getCondition() == Status.SLEEP) {
            p.setMod(Stat.HP, -100);
        }
	}

}
