import com.sun.tools.javac.Main;


class Personne implements PersonneInterface {
    String username;
    Main main;

    public Personne(String username) {
        this.username = username;
        this.main = new Main();
    }
}