package Model;

/**
 * Created by Abhiprae on 8/6/2017.
 */

public class SellBuyStock {

    String email, stock_name;
    double stock_price;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public double getPrice() {
        return stock_price;
    }

    public void setPrice(double price) {
        this.stock_price = price;
    }
}
