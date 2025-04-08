package java_assignment2;
interface Clickable {
    void click(); 
}
class Button implements Clickable {
    private String label;

    public Button(String label) {
        this.label = label;
    }
    public void click() {
        System.out.println("Button '" + label + "' clicked!");
    }
}
class Link implements Clickable {
    private String url;

    public Link(String url) {
        this.url = url;
    }
    public void click() {
        System.out.println("Navigating to URL: " + url);
    }
}
public class program19 {
    public static void main(String[] args) { 
        Clickable button = new Button("Submit");
        Clickable link = new Link("https://example.com");
        button.click();
        link.click();
    }
}
