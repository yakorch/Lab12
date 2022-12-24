package decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://test_korch/IMG_5234.PNG");
        System.out.println(document.parse());
    }
}
