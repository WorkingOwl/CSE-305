import java.util.HashMap;
import java.util.Map;

public class PropertyOwner extends User {

    private Map<String, Property> propertyMap;

    public PropertyOwner(String userID, String password, String email, User.UserType userType) {
        super(userID, password, email, userType);
        propertyMap = new HashMap<>();
    }

    public void addProperty(Property property) {
        propertyMap.put(property.getPropertyID(), property);
    }

    public void removeProperty(String propertyID) {
        propertyMap.remove(propertyID);
    }

    public Map<String, Property> getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(Map<String, Property> propertyMap) {
        this.propertyMap = propertyMap;
    }

}
