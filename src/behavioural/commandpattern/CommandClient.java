package behavioural.commandpattern;


import behavioural.commandpattern.command.impl.BlueCommand;
import behavioural.commandpattern.command.impl.BoldCommand;
import behavioural.commandpattern.command.impl.ItalicCommand;
import behavioural.commandpattern.invoker.Button;
import behavioural.commandpattern.receiver.TextEditor;

public class CommandClient {
    public static void main(String[] args) {
        //create the invoker
        //call the invoker by invoke method
        //invoke method will take care of the rest of the things
        //invoker
        Button button=new Button();
        TextEditor textEditor=new TextEditor();  //receiver

        BoldCommand boldCommand=new BoldCommand(textEditor);  //command
        button.setCommand(boldCommand);
        button.invoke();

        BlueCommand blueCommand=new BlueCommand(textEditor);  //command
        button.setCommand(blueCommand);
        button.invoke();

        ItalicCommand italicCommand=new ItalicCommand(textEditor);  //command
        button.setCommand(italicCommand);
        button.invoke();
    }
}
