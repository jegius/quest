package aplication;

import api.Command;

public class ApplicationRunner {
    private Command command;

    public ApplicationRunner(Command start) {
        this.command = start;
    }


    public void run() {
        while (command != null) {
            this.command = command.execute();
        }
    }
}
