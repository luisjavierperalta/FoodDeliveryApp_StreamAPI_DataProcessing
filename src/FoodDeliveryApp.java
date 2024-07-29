import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class FoodDeliveryApp { //1
    //2
    public static void main(String[] args) { //2 MAIN
        //3 Create List of @Restaurants Type @Generics
        List<Restaurant> restaurants = new ArrayList<>();

        //3.1 Add new @Restaurants to the List
        restaurants.add(new Restaurant("Pizza Joint", 7.6, true, "Italian"));
        restaurants.add(new Restaurant("Burger Plaza", 4.3, false, "American USA"));
        restaurants.add(new Restaurant("Sushi Central", 8, true, "Japanese"));
        restaurants.add(new Restaurant("Taco Way", 6.3, true, "Mexican"));
        restaurants.add(new Restaurant("Pasta Italiana", 6, false, "Italian"));

        //4 LIST of orders
        List<Order> orders = new ArrayList<>();
        //4.1 Add orders to the list
        orders.add(new Order(1, 25.5, "John", 30));
        orders.add(new Order(2, 40.0, "Jason", 45));
        orders.add(new Order(3, 19.75, "Alice", 20));
        orders.add(new Order(4, 33.0, "David", 35));

        //DATA PROCESSING > @TASK 1
        //@Filter + Sort Restaurant with @Stream API + @Lambda Expressions
        List<Restaurant> topItalianRestaurants = restaurants.stream()
                .filter( r -> r.isOpen() && r.getCuisineType().equalsIgnoreCase("Italian"))
                .sorted((r1, r2) -> Double.compare(r2.getRating(), r1.getRating()))
                .limit(5)
                .collect(toList());

        System.out.println("Top Italian Restaurants:");
        topItalianRestaurants.forEach(System.out::println);

        //DATA PROCESSING > @TASK 2 @Calculating Total Sales
        double totalSales = orders.stream()
                .mapToDouble(Order::getTotal)
                .sum();

        System.out.println("\n Total Sales $:" + totalSales);

        //DATA PROCESSING > @TASK 3 @Avg Delivery Time
        double averageDeliveryTime = orders.stream()
                .mapToInt(Order::getDeliveryTime)
                .average()
                .orElse(0.0);

        System.out.println("\nAvg Delivery Time :" + averageDeliveryTime + "minutes");

        //DATA PROCESSING > @TASK 4 @Order Summary

        List<OrderSummary> orderSummaries = orders.stream()
                .map(Order -> new OrderSummary(Order.getId(), Order.getCustomerName()))
                .collect(Collectors.toList());

        System.out.println("\n Order Summaries:");
        orderSummaries.forEach(System.out::println);






    }

}
class OrderSummary {

    private int id;
    private String customerName;

    public OrderSummary(int id, String customerName) {

        this.id = id;
        this.customerName = customerName;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //

    @Override
    public String toString() {
        return "orderSummary{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
