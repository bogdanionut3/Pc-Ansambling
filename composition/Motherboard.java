package composition;

public class Motherboard {
   private String model;
   private String manufacturer;
   private int ramSlots;
   private int cardSlots;
   private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String loadProgram(String programName){
        return "Program "+programName+" is now loading";
    }

    @Override
    public String toString(){
        return "Motherboard model "+model+"\n"+
                "Motherboard manufacturer "+manufacturer+"\n"+
                "Motherborad ram Slots "+ramSlots+"\n"+
                "Motherboard card Slots "+cardSlots+"\n"+
                "Motherboard bios "+bios;
    }
}
