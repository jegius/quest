package commands;

import api.Command;

public class Start implements Command {
    private Start() {}

    private static Command instance;

    public static synchronized Command getInstance() {
        if (instance == null) {
            instance = new Start();
        }

        return instance;
    }

    @Override
    public Command execute() {
        System.out.println("This is start of application!");

        return MainMenu.getInstance();
    }

}
