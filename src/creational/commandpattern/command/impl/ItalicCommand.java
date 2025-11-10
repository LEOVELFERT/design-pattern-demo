package creational.commandpattern.command.impl;

import commandpattern.command.Command;
import commandpattern.receiver.TextEditor;

public class ItalicCommand implements Command {
    private TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.textEditor.updateItalic();
    }
}
