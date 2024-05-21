public class Client {

    public static RentalContract requestCreateRentalContract(String type) {
        Contract contract;
        switch (type) {

            case "LongTerm":
                contract = new LongTermContract();
                break;
            case "ShortTerm":
                contract = new ShortTermContract();
                break;
            case "Permanent":
                contract = new PermanentContract();
                break;
            default:
                return null;
        }
        contract.BuildContractID("01");
        contract.BuildPropertyID("01");
        contract.BuildRentAmount(50.0);
        contract.BuildTenantID("01");
        return contract.SignContract();
    };

    public static Document newDocument(String type) {
        DocumentInterface document;
        switch (type) {
            case "Normal":
                document = new NormalDoc();
                break;
            case "Confidential":
                document = new ConfidentialDoc();
                break;
            default:
                return null;
        }
        document.SetExtension();
        document.setEncryption();
        return document.BuildDoc();
    }

    public static void main(String[] args) {
        RentalContract contract = requestCreateRentalContract("LongTerm");
        System.out.println(contract.getContractID() + "\n" + contract.getPropertyID() + "\n" + contract.getRentAmount()
                + "\n" + contract.getTenantID());
        Document document = newDocument("Normal");
        System.out.println(document.getEncryption() + "\n" + document.getExtension());
    }
}