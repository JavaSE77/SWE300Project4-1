package xyz.javase.swe300.project2;

public interface State {
    State handleCharacter(char input, int s, double v, double p);

}
