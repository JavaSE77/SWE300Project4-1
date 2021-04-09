/**
 * 
 */
package xyz.javase.swe300.project2;


public class Context {

    double parse(String input)
    {
        State state = new StartState();
        int s = 0;
        double v = 0;
        double p = 0;
        for (int i=0;i<input.length();i++)
        {
        	State newState = state.handleCharacter(input.charAt(i), s, v, p);
        	if(newState == null) {
        		s = 0;
        		break;
        	}

            MachineState bigState = (MachineState) newState;
            s = bigState.getS();
            //Changed V to not include floating point errors
            v = Math.round(bigState.getV() * Math.pow(10, i)) / Math.pow(10, i);
            p = bigState.getP();
            state = bigState.getState();
        }
        return s*v;
    }
}
