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

    public void addPassword(String servis, String password) {
        if (this.password.get(servis)  == null) {
            this.password.put(servis, password);
        }
    }

    public String getPassword(String servis) {
        String st = password.get(servis);
        if (st == null)
            return null;
        else
            return st;
    }
}
