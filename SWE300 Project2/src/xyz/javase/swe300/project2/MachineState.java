package xyz.javase.swe300.project2;

public class MachineState implements State{

	private double v = 0;
	private double p = 0;
	private int s = 0;
	private State state = new StartState();
	
	public MachineState(IntegerState integerState, int s, double v, double p) {
		this.v = v;
		this.p = p;
		this.s = s;
		this.state = integerState;
	}
	


	public MachineState(DecimalState decimalState, int s, double v, double p) {
		this.v = v;
		this.p = p;
		this.s = s;
		this.state = decimalState;
	}



	@Override
	public State handleCharacter(char input, int s, double v, double p) {
		//input = c, s is for the sign, v is the running total, p is for the decimal

			state.handleCharacter(input, s, v, p);	
		
		return null;
	}

	
	public int getS() {
		return s;
	}

	
	public double getV() {
		return v;
	}

	
	public double getP() {
		return p;
	}

	
	public State getState() {
		return state;
	}

}
