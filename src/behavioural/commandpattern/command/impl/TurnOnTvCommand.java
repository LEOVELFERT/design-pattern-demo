package behavioural.commandpattern.command.impl;

import behavioural.commandpattern.command.TvCommand;
import behavioural.commandpattern.receiver.Tv;

public class TurnOnTvCommand implements TvCommand {
    private Tv tv;

    public TurnOnTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }
}
