package xyz.javase.swe300.project2;

public class IntegerState implements State {
	
    @Override
    public State handleCharacter(char input, int s, double v, double p) {	
    	if ((input >= '0') && (input <= '9')) {
    		
    		v = (v * 10) + (input - '0');
    		return new MachineState( new IntegerState(), s, v, p);
    	} else if (input == '.') {
        	p = 0.1;
        	return new MachineState( new DecimalState(), s, v, p);
        } 

        return null;
    }
}
