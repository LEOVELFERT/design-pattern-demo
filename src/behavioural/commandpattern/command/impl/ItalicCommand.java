package behavioural.commandpattern.command.impl;


import behavioural.commandpattern.command.Command;
import behavioural.commandpattern.receiver.TextEditor;

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
