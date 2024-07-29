

/* 1
FOOD DELIVERY APP > Processing Data by @Filter, @Sort and Aggregate Data for report generation
Multiple classes definition to represent @Restaurant
@Order
@Customer
 */
class Restaurant { //1
    //Class's fields
    private String name;
    private double rating;
    private boolean isOpen;
    private String cuisineType;

    //CONSTRUCTOR

    public Restaurant(String name, double rating, boolean isOpen, String cuisineType) {
        this.name = name;
        this.rating = rating;
        this.isOpen = isOpen;
        this.cuisineType = cuisineType;
    }

    //GETTER + SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }


    //@Override

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", isOpen=" + isOpen +
                ", cuisineType='" + cuisineType + '\'' +
                '}';
    }

}

//ORDER CLASS
class Order { //1
    //2 Class's instance fields
    private int id;
    private double total;
    private String customerName;
    private int deliveryTime;

    public Order( int id, double total, String customerName, int deliveryTime) {
        this.id = id;
        this.total = total;
        this.customerName = customerName;
        this.deliveryTime = deliveryTime;
    }

    //GETTER + SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    //@Override @toString()

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", total=" + total +
                ", customerName='" + customerName + '\'' +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}

//ORDER SUMMARY CLASS
