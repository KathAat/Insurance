public class termLife extends insurance {
    private String beneficiaryfullname;
    private int policyterm;
    private double termpayout;
    //constructor. didn't know what to name it.
    public ConsInsurance(String policyholdfullname, string beneficiaryfullname, int policyterm, double termpayout) {
        this.beneficiaryfullname = beneficiaryfullname;
        this.policyterm = policyterm;
        this.termpayout = termpayout;
        super(policyholdfullname);
    }
    //getters
    public String getbeneficiaryfullname() {
        return beneficiaryfullname;
    }

    public int getpolicyterm() {
        return policyterm;
    }

    public double gettermpayout() {
        return termpayout;
    }
    //setters
    public String setbeneificaryfullname() {
        this.beneficiaryfullname = beneficiaryfullname;
    }

    public double settermpayout() {
        this.termpayout = termpayout;
    }

    public int setpolicyterm() {
        this.policyterm = policyterm;
    }
    //overriders
    @Override
    public void calcpremium() {
        premiumamount = (termpayout/12) * policyterm;
    }

    @Override
    public String toString() {
        return "Beneficiary: " + beneficiaryfullname,
        "Policy Term: " + policyterm,
        "Term Payout: " + termpayout;
    }
}