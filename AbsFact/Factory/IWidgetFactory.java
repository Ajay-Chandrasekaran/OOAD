package AbsFact.Factory;

import AbsFact.Buttons.IButtons;
import AbsFact.ScrollBar.IScrollBar;

public interface IWidgetFactory {
    public IButtons geButtons();
    public IScrollBar getScrollBar();
}
