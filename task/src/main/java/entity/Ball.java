package entity;

public class Ball extends SportEquipment {

    private String type;
    private String title;
    private int quantity;
    private int price;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ball ball = (Ball) o;

        if (quantity != ball.quantity) return false;
        if (price != ball.price) return false;
        if (!type.equals(ball.type)) return false;
        return title.equals(ball.title);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + quantity;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
