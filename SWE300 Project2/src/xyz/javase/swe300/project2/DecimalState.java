package xyz.javase.swe300.project2;

public class DecimalState implements State {

	@Override
	public State handleCharacter(char input, int s, double v, double p) {
		
		if ((input >= '0') && (input <= '9')) {
			v += p * (input - '0');
			p /= 10;
			return new MachineState( new DecimalState(), s, v, p);
		}
	
		return null;
	}

}
