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

    public boolean inputServis(String servis) {
        boolean fl = password.chekExist(servis);
        if (fl) {
            this.servis = servis;
        }
        return fl;
    }
}
