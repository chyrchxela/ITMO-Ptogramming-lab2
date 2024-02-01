package mymoves.poliwhirl;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BellyDrum extends StatusMove {
	public BellyDrum(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
		Effect e = new Effect().stat(Stat.ATTACK, +1);
		Effect d = new Effect().stat(Stat.HP, -1);
		p.addEffect(e);
		p.addEffect(d);
	}
}
