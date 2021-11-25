package HomeWorkJavaCore;

public class Cross extends Obstacle {

    public Cross(int difficulty) {

        super(difficulty);
    }

    @Override
    public void goChallenge(Partner partner) {

        partner.run(super.getDifficulty());
    }

}
//