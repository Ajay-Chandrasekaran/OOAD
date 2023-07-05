package AbsFact.Factory;

import AbsFact.Buttons.IButtons;
import AbsFact.Buttons.MacButton;
import AbsFact.ScrollBar.IScrollBar;
import AbsFact.ScrollBar.MacScrollBar;

public class MacWidgetsFactory implements IWidgetFactory {

    @Override
    public IButtons geButtons() {
        return new MacButton();
    }

    @Override
    public IScrollBar getScrollBar() {
        return new MacScrollBar();
    }
    
}
