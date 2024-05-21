public interface Contract {
    public void BuildContractID(String contractID);

    public void BuildPropertyID(String propertyID);

    public void BuildTenantID(String tenantID);

    public void BuildRentAmount(double amount);

    public Contract SignContract();
}
