package composition;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }
   public String pressPowerButton(){
        return "Power button pressed ";
   }

   @Override
    public String toString(){
        return "Case model "+model+"\n"+
                "Case manufacturer "+manufacturer+"\n"+
                "Case power supply "+powerSupply+"\n"+
                dimension;
   }
}
