package HomeWorkJavaCore;

public class Jumping extends Obstacle {

    public Jumping(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(Partner partner) {
        partner.jump(super.getDifficulty());
    }
}