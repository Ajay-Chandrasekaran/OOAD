package AbsFact;

import AbsFact.Factory.IWidgetFactory;
import AbsFact.Factory.MacWidgetsFactory;
import AbsFact.Factory.WindowsWidgetsFactory;

public class WidgetAbstractFactory {

    public static IWidgetFactory getWidgetFactory(int type) {
        if (type == 0) {
            return new WindowsWidgetsFactory();
        } else {
            return new MacWidgetsFactory();
        }
    }
}
