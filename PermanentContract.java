public class PermanentContract implements Contract {
    private String contractID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;

    @Override
    public void BuildContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public void BuildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void BuildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void BuildRentAmount(double amount) {
        rentAmount = amount;
    }

    @Override
    public Contract SignContract() {
        return this;
    }

}
