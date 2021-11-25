package HomeWorkJavaCore;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Partner partner: team.getPartners()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(partner);
                if (partner.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }

}
