package behavioural.commandpattern.command.impl;

import behavioural.commandpattern.command.TvCommand;
import behavioural.commandpattern.receiver.Tv;

public class TurnOffTvCommand implements TvCommand {
    private Tv tv;

    public TurnOffTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }
}
