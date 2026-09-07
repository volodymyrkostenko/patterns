package adapter;

public class Order {

    public Integer id;
    public Integer sellerId;
    public Double total;

    public Order(Integer id, Integer sellerId, Double total) {
        this.id = id;
        this.sellerId = sellerId;
        this.total = total;
    }

    public String findSellerEmail() {
        System.out.println("finding seller email");
        return "seller@email.com";
    }

    public String findSellerCard() {
        System.out.println("finding seller card");
        return "4242-4242-4242-4242";
    }
}
