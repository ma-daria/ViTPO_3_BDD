import java.util.HashMap;
import java.util.Map;

public class Password {

    private Map<String, String> password;
    private Map<String, String> string;

    public Password()
    {
        password = new HashMap<String, String>();
        string = new HashMap<String, String>();
    }

    public boolean addPassword(String servis, String password) {
        if (this.password.get(servis)  == null) {
            this.password.put(servis, password);
            return true;
        }
        return false;
    }

    public String getPassword(String servis) {
        String st = password.get(servis);
        if (st == null)
            return null;
        else
            return st;
    }

    public boolean Edit(String servis, String password) {
        if (this.password.get(servis) == null)
            return false;
        this.password.put(servis,  password);
        return true;
    }
}
