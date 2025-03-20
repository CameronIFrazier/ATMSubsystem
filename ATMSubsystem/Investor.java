package ATMSubsystem;

public class Investor{
    String investorID;
    String investmentAmount;

    public Investor(String investorID, String investmentAmount) {
        this.investorID = investorID;
        this.investmentAmount = investmentAmount;
    }

    public void setInvestorID(String investorID) {
        this.investorID = investorID;
    }

    public String getInvestorID() {
        return this.investorID;
    }

    public void setInvestmentAmount(String investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public String getInvestmentAmount() {
        return this.investmentAmount;
    }

    public void veiewFinacialReports() {
        //implement
    }
}