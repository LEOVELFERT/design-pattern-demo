package behavioural.commandpattern.command.impl;


import behavioural.commandpattern.command.Command;
import behavioural.commandpattern.receiver.TextEditor;

public class BoldCommand implements Command {
    private TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.updateBold();
    }
}
