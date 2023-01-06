
public class MyOwnAutoShop {
   
    public static void main(String[] args) {

    Sedan mySedan = new Sedan(100, 10000, "Red", 25);
    Ford myFord1 = new Ford (120,20000,"Black",2015, 30);
    Ford myFord2 = new Ford (155,5000.0,"Pink",2001, 5);
    Car myCar = new Car (555, 56856.0, "Red"); 

    System.out.println("Sedan Sale Price" + mySedan.getSalePrice());
    System.out.println("Ford 1 Sale Price" + myFord1.getSalePrice());
    System.out.println("Ford 2 Sale Price" + myFord2.getSalePrice());
    System.out.println("Car Sale Price" + myCar.getSalePrice());
 }
}