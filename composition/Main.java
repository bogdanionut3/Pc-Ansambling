package composition;

public class Main {
    public static void main(String[] args) {
        PC myPc = new PC();
        System.out.println("My pc configuration: ");
        System.out.println("------------------------");
        System.out.println(myPc.toString());
        System.out.println("------------------------");
        System.out.println(myPc.getTheCase());
        System.out.println(myPc.getMotherboard());
        System.out.println(myPc.getMonitor());

    }
}
