package AbsFact.ScrollBar;

public class MacScrollBar implements IScrollBar {
    
    @Override
    public int scrollUp(int loc) {
        System.out.println("Mac Scroll Bar" +  ++loc);
        return loc + 1;
    }

    @Override
    public int scrollDown(int loc) {
        System.out.println("Mac Scroll Bar" + --loc);
        return loc - 1;
    }
}
