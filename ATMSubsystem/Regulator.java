package ATMSubsystem;

public class Regulator{
    String reuglatorID;
    String authority;

    public Regulator(String reuglatorID, String authority) {
        this.reuglatorID = reuglatorID;
        this.authority = authority;
    }

    public void setReuglatorID(String reuglatorID) {
        this.reuglatorID = reuglatorID;
    }

    public String getReuglatorID() {
        return this.reuglatorID;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void enforceReuglation() {
        //implement
    }

    public void conductAudit() {
        //implement
    }
}