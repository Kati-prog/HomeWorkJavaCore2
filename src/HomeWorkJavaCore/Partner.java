package HomeWorkJavaCore;

public class Partner {
    private Status status = Status.NoPassedDistance;
    private String namePartner;
    private int power;

    public Partner(String namePartner, int power) {
        this.namePartner = namePartner;
        this.power = power;
    }

    public Status getStatus() {

        return status;
    }

    public String getNameTeamPartner() {

        return namePartner;
    }


    public void jump(int courseDifficulty){
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," преодолел барьер");
        }
        else{
            changeStatus(Status.NoPassedDistance," не преодолел барьер");
        }
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," пробежал кросс");
        }
        else{
            changeStatus(Status.NoPassedDistance,"  не пробежал кросс");
        }
    }

    public void swim(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," проплыл дистанцию");
        }
        else{
            changeStatus(Status.NoPassedDistance," не проплыл дистанцию");
        }
    }

    private boolean checkPower(int courseDifficulty) {

        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(namePartner + message);
    }

}
