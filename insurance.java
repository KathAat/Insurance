public abstract class insurance {
    private String policyholdfullname;
    private int policynum;
    private static int policies = 0;
    public double premiumamount = 0;

    public insurance(String policyholdfullname) {
        this.policyholdfullname = policyholdfullname;
        policies = policies + 1;
        this.policynum = policies;
    }

    public String getpolicyfullname() {
        return policyholdfullname;
    }

    public int getpolicynum() {
        return policynum;
    }

    public double getpremiumamount() {
        return premiumamount;
    }

    public void setpolicyfullname(String policyholdfullname) {
        this.policyholdfullname = policyholdfullname;
    }

    public abstract void calcpremium();

    @Override
    public String toString() {
        return "Policyholder: " + policyholdfullname, "Policy number: "
        + policynum, "Premium Amount: " + premiumamount;
    }
}