/**
 * Created by eugene on 22-4-17.
 * the class for a professional cycling team
 */
class ProTeam extends Team {
    private double sponsorAmount;

    ProTeam() {
    }

    public ProTeam(String name) {
        super(name);
    }

    double getSponsorAmount() {
        return sponsorAmount;
    }

    void setSponsorAmount(double sponsorAmount) {
        this.sponsorAmount = sponsorAmount;
    }
}
