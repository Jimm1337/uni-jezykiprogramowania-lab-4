package tb.soft.gui.swing;

import tb.soft.gui.IGui;
import tb.soft.gui.IWindow;

import javax.swing.*;

abstract class WindowBase extends JFrame implements IWindow {
    protected final Content content;
    protected final IGui manager;

    protected WindowBase(IGui manager, String title) {
        super(title);
        this.manager = manager;
        content = new Content(this);
        setContentPane(content);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public IGui getManager() {
        return manager;
    }

    public Content getContent() {
        return content;
    }

    abstract protected void setSize();
}
