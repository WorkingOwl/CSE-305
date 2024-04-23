import java.util.HashMap;
import java.util.Map;

public class Tenant extends User{
    private Map<String, RentalContract> contractList;

    public Tenant(String id, String pass, String mail, UserType type){
        super(id, pass, mail, type);
        contractList= new HashMap<>();
    }

    public void createContract(RentalContract contract){
        contractList.put(contract.getContractID(), contract);
    }

    public void deleteContract(String id){
        contractList.remove(id);
    }



}   