package AbsFact.Factory;

import AbsFact.Buttons.IButtons;
import AbsFact.Buttons.WindowsButton;
import AbsFact.ScrollBar.IScrollBar;
import AbsFact.ScrollBar.WindowsScrollBar;

public class WindowsWidgetsFactory implements IWidgetFactory {

    @Override
    public IButtons geButtons() {
        return new WindowsButton();
    }

    @Override
    public IScrollBar getScrollBar() {
        return new WindowsScrollBar();
    }
    
}
