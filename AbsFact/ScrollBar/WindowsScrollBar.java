package AbsFact.ScrollBar;

public class WindowsScrollBar implements IScrollBar {

    @Override
    public int scrollUp(int loc) {
        System.out.println("Windows Scroll Bar" + ++loc);
        return loc + 1;
    }

    @Override
    public int scrollDown(int loc) {
        System.out.println("Windows Scroll Bar" + --loc);
        return loc - 1;
    }
    
}
