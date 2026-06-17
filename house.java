public class house
{
    String ownerName;
    String color;
    int rooms;
    double price;

    void showDetails()
    {
        System.out.println("Owner : " + ownerName);
        System.out.println("Color : " + color);
        System.out.println("Rooms : " + rooms);
        System.out.println("Price : ₹" + price);
    }

    public static void main(String[] args)
    {
        house house1 = new house();

        house1.ownerName = "Rahul";
        house1.color = "White";
        house1.rooms = 4;
        house1.price = 3500000;

        house1.showDetails();
    }
}