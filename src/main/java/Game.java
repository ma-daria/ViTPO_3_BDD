public class Game {
    private Password password;

    public Game(Password password){
        this.password = password;
    }

    public boolean addPassword(String servis, String password) {
        return this.password.addPassword(servis, password);
    }

    public boolean inputLetter(String lettre) {
        return true;
    }
}
