package mymoves.togedemaru;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bulldoze extends PhysicalMove{
	public Bulldoze(double pow, double acc) {
		super(Type.GROUND, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		Effect e= new Effect().stat(Stat.SPEED, -1);
		
		p.addEffect(e);
	}

}
