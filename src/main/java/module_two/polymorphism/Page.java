package module_two.polymorphism;

public class Page {

    private String title;
    private String text;

    public Page(String title, String text) {
        setTitle(title);
        setText(text);
    }

    private void setTitle(String title) {
        this.title = title != null ? title : "default_title";
    }

    private void setText(String text) {
        this.text = text != null ? text : "";
    }

    public void addText(String text) {
        if (text != null) {
            this.text = this.text.isEmpty() ? text : this.text.concat(" " + text);
        }
    }

    public void deleteText() {
        this.text = "";
    }

    public String viewPage() {
        return String.format("%s%n%s", this.title, this.text);
    }

    // second part of the description

    public boolean searchWord(String word) {
        return word != null && (this.text.contains(word) || this.title.contains(word));
    }

    public boolean containsDigits() {
        return this.text.matches("[0-9]+") || this.title.matches("[0-9]+");
    }
}
