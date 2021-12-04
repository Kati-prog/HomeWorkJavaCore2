package HomeWorkJavaCore;


public class Swim extends Obstacle {
    public Swim(int difficulty) {

        super(difficulty);
    }

    @Override
    public void goChallenge(Partner partner) {
        partner.swim(super.getDifficulty());
    }
}
