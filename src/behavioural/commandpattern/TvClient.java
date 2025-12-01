package behavioural.commandpattern;

import behavioural.commandpattern.command.impl.TurnOffTvCommand;
import behavioural.commandpattern.command.impl.TurnOnTvCommand;
import behavioural.commandpattern.invoker.TvInvoker;
import behavioural.commandpattern.receiver.Tv;

public class TvClient {
    public static void main(String[] args) {

        TvInvoker invoker = new TvInvoker();
        Tv tv = new Tv();

        TurnOnTvCommand turnOn = new TurnOnTvCommand(tv);
        TurnOffTvCommand turnOff = new TurnOffTvCommand(tv);

        invoker.addCommand(turnOn);
        invoker.addCommand(turnOff);

        invoker.executeAll();
    }
}
