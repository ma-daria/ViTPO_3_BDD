public class Game {
    private Password password;
    String servis;
    int number_true;

    public Game(Password password){
        number_true = 0;
        this.password = password;
    }

    public boolean addPassword(String servis, String password) {
        return this.password.addPassword(servis, password);
    }

    public boolean inputLetter(String letter) {
        int ch = number_true;
        number_true+= password.chekLetter(letter, servis);
        if (number_true == ch)
            return false;
        else
            return true;
    }

    public boolean inputServis(String servis) {
        number_true = 0;
        boolean fl = password.chekExist(servis);
        if (fl) {
            this.servis = servis;
        }
        return fl;
    }

    public String getPassword() {
        if (number_true >= 3)
            return password.getPassword(servis);
        else
            return null;
    }
}
