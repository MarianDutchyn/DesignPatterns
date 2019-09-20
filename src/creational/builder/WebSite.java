package creational.builder;

public class WebSite {

    private String name;
    private Cms cms;
    private int price;

    public String getName() {
        return name;
    }

    public Cms getCms() {
        return cms;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }

    private WebSite(Builder builder) {
        this.name = builder.name;
        this.cms = builder.cms;
        this.price = builder.price;
    }

    static class Builder{
        private String name;
        private Cms cms;
        private int price;

        public Builder(String name) {
            this.name = name;
        }


        public Builder setCms(Cms cms) {
            this.cms = cms;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public WebSite build(){
            return new WebSite(this);
        }
    }
}
