public class Main {
    public static void main(String[] args) {

        Car mazda = new Car();
   //     System.out.println(mazda);

        Car lada = new Car("Lada", 80, false,20f);
    //    System.out.println(lada);

        float mazdaSpeed= mazda.countSpeed(10);
        System.out.println(mazdaSpeed);
        System.out.println(lada.countSpeed(10));

        mazda.ride();
        Boat  boat = new Boat();
        Transport transport = new Transport();

        rideSomeTransport(mazda);
        rideSomeTransport(transport);
        rideSomeTransport(boat);
    }

    public static void rideSomeTransport(Rideable rideable){
        rideable.ride();
    }
}
