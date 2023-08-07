package commands;

import api.Command;

public class ExitCommand implements Command {

    private ExitCommand() {}

    private static Command instance;

    @Override
    public Command execute() {
        return null;
    }

    public static synchronized Command getInstance() {
        if (instance == null) {
            instance = new ExitCommand();
        }

        return instance;
    }
}
