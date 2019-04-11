public class Password {

    String password;

    public Password()
    {

    }

    public void addPassword(String servis, String password) {
        this.password = password;
    }

    public String getPassword(String servis) {
        return  password;
    }
}
