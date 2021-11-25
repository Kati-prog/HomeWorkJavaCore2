import HomeWorkJavaCore.*;


public class Main {
    public static void main(String[] args) {

        Course c = new Course(new Cross(5),
                new Swim(3),
                new Jumping(7));

        Team team = new Team("GoGo",
                new Partner("Alex", 10),
                new Partner("John", 20),
                new Partner("Fred", 9),
                new Partner("Leon", 50));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}