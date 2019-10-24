package module_two.polymorphism;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
    private boolean isTurnOn;

    public ElectronicSecuredNotepad(int pages, String password) {
        super(pages, password);
        isTurnOn = false;
    }

    @Override
    public void start() {
        this.isTurnOn = true;
    }

    @Override
    public void stop() {
        this.isTurnOn = false;
    }

    @Override
    public boolean isStarted() {
        return isTurnOn;
    }

    @Override
    public void addTextToPage(String text, int page) {
        if (!isTurnOn) {
            System.out.println("Turn on the notepad first!");
            return;
        }

        super.addTextToPage(text, page);
    }

    @Override
    public void overridePageText(String text, int page) {
        if (!isTurnOn) {
            System.out.println("Turn on the notepad first!");
            return;
        }

        super.overridePageText(text, page);
    }

    @Override
    public void deletePageText(int page) {
        if (!isTurnOn) {
            System.out.println("Turn on the notepad first!");
            return;
        }

        super.deletePageText(page);
    }

    @Override
    public void viewNotepad() {
        if (!isTurnOn) {
            System.out.println("Turn on the notepad first!");
            return;
        }

        super.viewNotepad();
    }
        return false;
    }

    //to modify the pages: 1. correct password; 2. the device should be turned on -> override methods?
}
