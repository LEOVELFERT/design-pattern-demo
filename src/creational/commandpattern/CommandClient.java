package creational.commandpattern;

import commandpattern.command.impl.BlueCommand;
import commandpattern.command.impl.BoldCommand;
import commandpattern.command.impl.ItalicCommand;
import commandpattern.invoker.Button;
import commandpattern.receiver.TextEditor;

public class CommandClient {
    public static void main(String[] args) {
        //create the invoker
        //call the invoker by invoke method
        //invoke method will take care of the rest of the things
        Button button=new Button();
        TextEditor textEditor=new TextEditor();

        BoldCommand boldCommand=new BoldCommand(textEditor);
        button.setCommand(boldCommand);
        button.invoke();

        BlueCommand blueCommand=new BlueCommand(textEditor);
        button.setCommand(blueCommand);
        button.invoke();

        ItalicCommand italicCommand=new ItalicCommand(textEditor);
        button.setCommand(italicCommand);
        button.invoke();
    }
}
