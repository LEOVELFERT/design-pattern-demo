package behavioural.commandpattern.invoker;


import behavioural.commandpattern.command.Command;

public class Button {
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void invoke(){
        command.execute();
    }
}
