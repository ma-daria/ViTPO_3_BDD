public class Game {
    private Password password;
    String servis;

    public Game(Password password){
        this.password = password;
    }

    public boolean addPassword(String servis, String password) {
        return this.password.addPassword(servis, password);
    }

    public boolean inputLetter(String letter) {
        int ch = password.chekLetter(letter, servis);
        if (ch == 0)
            return false;
        else
            return true;
    }

    public void inputServis(String arg0) {
        servis = arg0;
    }
}
