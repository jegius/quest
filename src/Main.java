import aplication.ApplicationRunner;
import commands.MainMenu;
import commands.CreateNewChar;

public class Main {
    public static void main(String[] args) {
        new ApplicationRunner(MainMenu.getInstance()).run();
    }
}