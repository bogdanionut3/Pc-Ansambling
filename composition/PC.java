package composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(){
        this.theCase= new Case("2208","Dell","220V",new Dimension(30,10,5));
        this.monitor= new Monitor("27 Inch","Acer",27, new Resolution(2500, 1400));
        this.motherboard= new Motherboard("B3 200","Assus",4,6,"V2.44");

    }

    public String getMonitor() {
        return monitor.drawPixelAt(1500,1200,"red");
    }

    public String getMotherboard() {
        return motherboard.loadProgram("Windows 10");
    }
    public String getTheCase() {
        return theCase.pressPowerButton();
    }

    @Override
    public String toString(){
        return  theCase+"\n"+
                monitor+"\n"+
                motherboard;
    }
}
