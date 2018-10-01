package composition;

public class Monitor {
    String model;
    String manufacturer;
    int size;
    private Resolution nativeResolution;


    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String drawPixelAt(int x, int y, String color){
        return "Drawing pixel at "+x+" , "+y+" in colour "+color;
    }

    @Override
    public String toString(){
        return "Monitor model "+model+"\n"+
                "Monitor manufacturer "+manufacturer+"\n"+
                "Monitor size "+size+"\n"+
                nativeResolution;
    }
}
