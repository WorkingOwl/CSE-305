public class User {
    private String userID;
    private String password;
    private String email;
    private UserType userType;

    public static enum UserType {
        TENANT,
        MANAGER,
        OWNER
    }

    public User(String userID, String password, String email, UserType userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public User createUser(String userID, String password, String email, UserType userType) {
        return new User(userID, password, email, userType);
    }

    public void resetPassword(String newPassword) {
        password = newPassword;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}