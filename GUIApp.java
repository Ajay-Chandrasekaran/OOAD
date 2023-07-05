// Abscract Factory Example
import AbsFact.WidgetAbstractFactory;
import AbsFact.Buttons.IButtons;
import AbsFact.Factory.IWidgetFactory;
import AbsFact.ScrollBar.IScrollBar;


public class GUIApp {
    public static void main(String[] args) {
        IWidgetFactory wf = WidgetAbstractFactory.getWidgetFactory(0);
        IScrollBar scr = wf.getScrollBar();
        IButtons btn = wf.geButtons();

        scr.scrollUp(0);
        btn.press();

        System.out.println("************");

        wf = WidgetAbstractFactory.getWidgetFactory(1);
        scr = wf.getScrollBar();
        btn = wf.geButtons();

        scr.scrollUp(0);
        btn.press();
    }
}
