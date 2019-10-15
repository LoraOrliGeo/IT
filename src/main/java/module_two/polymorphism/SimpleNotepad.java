package module_two.polymorphism;

public class SimpleNotepad implements INotepad {
    private Page[] pages;

    public SimpleNotepad(int numberOfPages) {
        if (numberOfPages > 0) {
            this.pages = new Page[numberOfPages];
            this.appendPages();
        } else {
            System.out.println("You can not create notepad without any pages!");
        }
    }

    @Override
    public void addTextToPage(String text, int page) {
        if (!pageExists(page)) {
            System.out.println("Page not exists!");
            return;
        }
        pages[page - 1].addText(text);
    }

    @Override
    public void overridePageText(String text, int page) {
        if (!pageExists(page)) {
            System.out.println("Page not exists!");
            return;
        }

        deletePageText(page);
        this.pages[page - 1].addText(text);
    }

    @Override
    public void deletePageText(int page) {
        if (!pageExists(page)) {
            System.out.println("Page not exists!");
            return;
        }

        this.pages[page - 1].deleteText();
    }

    @Override
    public void viewNotepad() {
        for (Page page : this.pages) {
            System.out.println(page.viewPage());
        }
    }

    private void appendPages() {
        for (int i = 0; i < this.pages.length; i++) {
            pages[i] = new Page("Title " + (i + 1), "");
        }
    }

    private boolean pageExists(int page) {
        return 1 <= page && page <= this.pages.length;
    }

    @Override
    public boolean searchWord(String word) {
        for (Page page : this.pages) {
            if (page.searchWord(word)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        for (Page page : this.pages) {
            if (page.containsDigits()) {
                System.out.println(page.viewPage());
            }
        }
    }
}
