public class HealthInsurance extends InsurancePolicy implements InsuranceDeduct {
    private double amtdeduct;
    private double totaldeductpaid = 0;
    private double amtcopayment;
    private double totalcopayment = 0;
    private double totaloutpocket;
    //constructor. didn't know what to name it. 
    //THIS is calling upon the attributes and policies above
    public HealthInsur(String policyholdfullname, double amtdeduct, double amtcopayment, double totaloutpocket) {
        super(policyholdfullname);
        this.amtdeduct = amtdeduct;
        this.amtcopayment = amtcopayment;
        this.totaloutpocket = totaloutpocket;
    }
    //getters
    public double getdedamt() {
        return amtdeduct;
    }

    public double gettotaldedpaid() {
        return totaldeductpaid;
    }

    public double getamtcoypayment() {
        return amtcopayment;
    }

    public gettotalcopayment() {
        return totalcopayment;
    }

    public gettotaloutpocket() {
        return totaloutpocket;
    }
    //setters
    public double setdedamt() {
        return amtdeduct;
    }

    public double settotaldedpaid {
        return totaldeductpaid;
    }
    
    public double setamtcopayment() {
        return amtcopayment;
    }

    public double settotalcopayment() {
        return totalcopayment;
    }

    public double settotaloutpocket() {
        return totaloutpocket;
    }

    @Override //premium amount = amtdeduct/12. premium amount is that much
    public void calcpremium() {
        premiumamount = (amtdeduct/12);
    }

    @Override //returns false if the deduct + copayment isnt greater or
    //equal to totaloutpocket
    public boolean DeductMet() {
        return (totaldeductpaid + totalcopayment) >= totaloutpocket;
    }

    @Override
    public String toString() {
        return "Deductible Amount: " + amtdeduct,
        "Total Deductible Paid: " + totaldeductpaid,
        "Co-payment Amount: " + amtcopayment,
        "Total Co-payment Amount: " + totalcopayment,
        "Total Out Pocket Amount: " + totaloutpocket;
    }
}