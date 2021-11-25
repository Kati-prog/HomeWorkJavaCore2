package HomeWorkJavaCore;

public class Team {
    private Partner[] partners;
    private final String nameTeam;

    public Team(String nameTeam, Partner... partners) {
        this.partners = partners;
        this.nameTeam = nameTeam;
    }

    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий преодолевала команда: " + nameTeam);
        for (Partner partner:partners) {
            if (partner.getStatus()== Status.NoPassedDistance){
                showResultPartnerNoPassed(partner);
            }
            else {
                showResultPartnerPassed(partner);
            }
        }
        printDivider();
    }

    private void showResultPartnerNoPassed(Partner partner) {
        printDivider();
        System.out.println(partner.getNameTeamPartner() + " Не прошел полосу препятствий");
    }

    private void showResultPartnerPassed(Partner member) {
        printDivider();
        System.out.println(member.getNameTeamPartner() + " Успешно прошел полосу препятствий");
    }

    public Partner[] getPartners() {
        return partners;
    }

    private void printDivider() {

        System.out.println("-----");
    }

    public void getTeamInfo() {
    }
}
//