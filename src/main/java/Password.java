import java.util.HashMap;
import java.util.Map;

public class Password {

    private Map<String, String> password;
    private String string;

    public Password()
    {
        password = new HashMap<String, String>();
        string = "";
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

    public int chekLetter(String letter, String servis) {
        String password = getPassword(servis);
        int kol = 0;
        char[] st = password.toCharArray();
        char[] stt = string.toCharArray();
        for(int i=0; i < st.length; i++)
            if (st[i] == letter.toCharArray()[0] ) {
                kol++;
                stt[i] = st[i];
            }
        string = new String(stt);
        return  kol;
    }

    public boolean chekExist(String servis) {
        String st = password.get(servis);
        if (st  == null)
            return false;
        else {
            ToDoNull(servis);
            return true;
        }
    }


    public void ToDoNull(String servis) {
        String st = password.get(servis);
        char[] ch = new char[st.length()];
        for (int i = 0; i < st.length(); i++)
            ch[i] = '*';
        string =  new String(ch);
    }

    public String getString(String arg0) {
        return string;
    }
}
