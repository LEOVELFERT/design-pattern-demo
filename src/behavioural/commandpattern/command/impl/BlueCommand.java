package behavioural.commandpattern.command.impl;


import behavioural.commandpattern.command.Command;
import behavioural.commandpattern.receiver.TextEditor;

public class BlueCommand implements Command {
    private TextEditor textEditor;

    public BlueCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.updateBlue();
    }
}
