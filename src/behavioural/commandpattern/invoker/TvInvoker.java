package behavioural.commandpattern.invoker;

import behavioural.commandpattern.command.TvCommand;

import java.util.ArrayList;
import java.util.List;

public class TvInvoker {
    List<TvCommand> tvCommands = new ArrayList<>();

    public void addCommand(TvCommand tvCommand) {
        tvCommands.add(tvCommand);
    }

    public void executeAll() {
        for (TvCommand command : tvCommands) {
            command.execute();
        }
        tvCommands.clear();
    }
}
