package ATMSubsystem;

public class Bank {
    private static final String BANK_NAME = "Cal Poly Pomona Credit Union";
    private static final String BANK_ADDRESS = "3801 W Temple Ave, Pomona, CA 91768";
    private static final String BANK_PHONE = "(909) 869-7659";

    private int branchId;
    private String branchAddress;

    public Bank(int branchId, String branchAddress) {
        this.branchId = branchId;
        this.branchAddress = branchAddress;
    }

    public String getBankName() {
        return BANK_NAME;
    }

    public String getBankAddress() {
        return BANK_ADDRESS;
    }

    public String getBankPhone() {
        return BANK_PHONE;
    }

    public int getBranchId() {
        return this.branchId;
    }

    public String getBranchAddress() {
        return this.branchAddress;
    }
}
