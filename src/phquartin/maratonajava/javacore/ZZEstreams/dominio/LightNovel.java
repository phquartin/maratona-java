package phquartin.maratonajava.javacore.ZZEstreams.dominio;

public class LightNovel {
    private String title;
    private double price;
    private Category category;

    public LightNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
