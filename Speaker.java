package com.juliakosno;
import java.util.Objects;

/**
 * A bluetooth speaker that is made by some brand, can be switched on/off, has a maximal volume and current volume (minimal is 0). The size of a Speaker can be
 * described with casual words (small, medium etc).
 * @author Julia Kosno, Oliwia Wieczorek
 * @version 1.0.0
 */

public class Speaker {
    private String brand = "JBL";
    private boolean on = false;
    private int maxVolume = 30;
    private int currentVolume = 0;
    private String size = "small";

    public Speaker() {
    }

    public Speaker(String brand, boolean on, int maxVolume, int currentVolume, String size) {
        this.brand = brand;
        this.on = on;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isOn() {
        return on;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getSize() {
        return size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setSize(String size) {
        this.size = size;
    }
    /**
     * Method which connects Speaker to device of a given name.
     * @param deviceName name of a device Speaker connects to.
     */

    public void connect(String deviceName) {
        System.out.println( "Speaker connected to " + deviceName + ".");
    }

    /**
     * Method increases current volume
     * @param a the value which we add to increase the current volume
     */

    public void volumeUp(int a) {
        if (getCurrentVolume() + a > getMaxVolume())
            this.currentVolume = this.maxVolume;
        else
            this.currentVolume += a;
    }
    /**
     * Method decreases current volume
     * @param b the value which we subtract in order to decrease the current volume
     */
    public void volumeDown(int b) {
        if (getCurrentVolume() - b < 0)
            this.currentVolume = 0;
        else
            this.currentVolume -= b;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Speaker)) return false;
        Speaker speaker = (Speaker) obj;
        return isOn() == speaker.isOn() && getCurrentVolume() == speaker.getCurrentVolume() &&
                getMaxVolume() == speaker.getMaxVolume() &&
                getBrand().equals(speaker.getBrand()) &&
                getSize().equals(speaker.getSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), isOn(), getCurrentVolume(), getMaxVolume(), getSize());
    }


    @Override
    public String toString() {
        return "Speaker{" +
                "brand='" + getBrand() + '\'' +
                ", on=" + isOn() +
                ", maxVolume=" +getMaxVolume() +
                ", currentVolume=" + getCurrentVolume() +
                ", size='" + getSize() + '\'' +
                '}';
    }

    /**
     * A short test of this class.
     * @param args not used.
     */
    public static void main(String[] args) {
        Speaker s1 = new Speaker();
        Speaker s2 = new Speaker();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.printf("s1 = [%s], s1.hashCode() = %d%n", s1, s1.hashCode());
        s1.setBrand("Sony");
        s1.setOn(true);
        s1.setCurrentVolume(8);
        s1.setSize("medium");
        s1.setMaxVolume(40);
        System.out.printf("s1 = [%s], s1.hashCode() = %d%n", s1, s1.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        s1.volumeDown(10);
        s2.volumeUp(3);
        System.out.printf("s1 = [%s], s1.hashCode() = %d%n", s1, s1.hashCode());
        System.out.printf("s2 = [%s], s2.hashCode() = %d%n", s2, s2.hashCode());
        s1.connect("Hłałej420");

    }
}
