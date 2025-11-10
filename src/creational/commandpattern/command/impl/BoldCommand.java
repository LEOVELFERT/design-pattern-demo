package creational.commandpattern.command.impl;

import commandpattern.command.Command;
import commandpattern.receiver.TextEditor;

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
