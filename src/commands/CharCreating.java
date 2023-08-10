package commands;

import api.Command;
import utils.Utils;

public class CharCreating implements Command {
    private CharCreating() {
    }

    private static Command instance;

    public static synchronized Command getInstance() {
        if (instance == null) {
            instance = new CharCreating();
        }

        return instance;
    }

    @Override
    public Command execute() {
        Utils.printSeparator();
        System.out.println("Choice your destiny");
        Utils.printOption("1", "huy");
        Utils.printOption("2", "pizda");
        Utils.printOption("0", "exit");
        Utils.printSeparator();
        Utils.printPrompt();

        int choice = Utils.getScannerChoice();

        switch (choice) {
            case 0:
                return ExitCommand.getInstance();
            case 1:
                return Start.getInstance();
            case 2:
                return Start.getInstance();
            default:
                System.out.println("Unexpected command!");
                return this;
        }
    }
}