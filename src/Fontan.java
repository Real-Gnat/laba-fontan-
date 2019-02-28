public class Fontan {

    private String name;
    private double volume;
     private String address;
    private double consuption;
    protected String color;

    public Fontan(String name, double volume, String address,String color) {

    }

    public Fontan(String name, double volume, String address) {

        this(name, volume, address, null);
    }

    public Fontan(String name, double volume, String address, double consuption, String color) {
        setName(name);
        setVolume(volume);
        setAddress(address);
        setConsuption(consuption);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getConsuption() {
        return consuption;
    }

    public void setConsuption(double consuption) {
        this.consuption = consuption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void printStaticElements() {

    }

    @Override
    public String toString() {
        return "Fontan{" +
                "name='" + name + '\'' +
                ", volume='" + volume + '\'' +
                ", address='" + address + '\'' +
                ", consuption=" + consuption +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fontan zeus = new Fontan("zeus", 600, "Center", 550,"grey");
        System.out.println("Name:  " + zeus.getName());
        System.out.println("volume:  " + zeus.getVolume());
        System.out.println("adcress:  " + zeus.getAddress());
        System.out.println("consuption:  " + zeus.getConsuption());
        System.out.println("color:  " + zeus.getColor() + "\n\n");

        Fontan baltika = new Fontan("baltika", 500, "700", 630,"white");
        System.out.println("Name: " + baltika.getName());
        System.out.println("volume: " + baltika.getVolume());
        System.out.println("adres: " + baltika.getAddress());
        System.out.println("consuption: " + baltika.getConsuption());
        System.out.println("color: " + baltika.getColor() + "\n\n");

        printStaticElements();


    }


}