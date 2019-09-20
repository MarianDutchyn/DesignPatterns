package creational.builder;

public class Test {

    public static void main(String[] args) {
        WebSite webSite = new WebSite.Builder("Visit Card").setCms(Cms.Joomla).setPrice(500).build();
        System.out.println(webSite);
    }

}
