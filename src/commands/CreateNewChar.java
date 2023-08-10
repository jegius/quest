package commands;

import api.Command;
import utils.Utils;

public class CreateNewChar implements Command {

    private CreateNewChar() {}

    private static Command instance;

    public static synchronized Command getInstance() {
        if (instance == null) {
            instance = new CreateNewChar();
        }

        return instance;
    }

    @Override
    public Command execute() {
        Utils.printSeparator();
        Utils.printOption("1", "Create New Char");
        Utils.printOption("0", "Exit");
        Utils.printSeparator();
        Utils.printPrompt();

        int choice = Utils.getScannerChoice();

        switch (choice) {
            case 0:
                return ExitCommand.getInstance();
            case 1:
                return CharCreating.getInstance();
            default:
                System.out.println("Unexpected command!");
                return this;
        }
    }
}
