public class Transport implements Rideable,Swimable {
    public String type= "None";

    @Override
    public void ride() {
        System.out.println("Riding transport");
    }
}
