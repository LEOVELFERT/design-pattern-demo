package creational.commandpattern.command.impl;

import commandpattern.command.Command;
import commandpattern.receiver.TextEditor;

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
