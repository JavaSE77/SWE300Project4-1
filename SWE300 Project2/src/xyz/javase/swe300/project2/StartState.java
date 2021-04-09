package xyz.javase.swe300.project2;

public class StartState implements State {
    @Override
    public State handleCharacter(char input, int s, double v, double p) {
        if (input == '+')
        {
        	s = 1;
            return new MachineState( new IntegerState(), s, v, p);
        } else if ((input >= '0') && (input <= '9'))
        {
            v = input - '0';
            s = 1;
           return new MachineState( new IntegerState(), s, v, p);
        } else if (input == '-') {
        	s = -1;
        	return new MachineState( new IntegerState(), s, v, p);
        } else if (input == '.') {
        	s = 1;
        	p = 0.1;
        	return new MachineState( new DecimalState(), s, v, p);
        } 

        return null;
    }
}
