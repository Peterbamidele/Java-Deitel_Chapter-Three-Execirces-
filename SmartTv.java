public class SmartTv {
    /*
    * Design a class named SmartTv to present smart tV, eACH Tv is an object with state(current channel), current
    Volume level, Wifi on or off,and power on or off) and behaviors (change channels,adjust volume, turm wif on/off,turn power on/off)
    * A no-arg constructor that create a defULT Tv.
    * A Constructor that creates a default Tv with the specific channel, volume and wifi.
    * The greater and setter methods for all four data fields
    * A method need toString() that return a string description for the Tv
    * Write a test program that create two object and invokes the methods on the object to perform action for setting
    * channels and volume levels for a increasing or decreasing channel and volume */

    private int channel = 1;
    private String TvName;
    private int volume = 1;
    private boolean wifi;
    private boolean power;

    public SmartTv(int channel, int volume, boolean wifi,String TvName, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.wifi = wifi;
        this.TvName = TvName;
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void channelUp(){
        if (power == true && channel < 100) // tv is already on you can change it up to 100
            System.out.println("SmartTv has been change to new channel");
            channel++;
    }
    public void channelDown(){
        if(power == true && channel > 100)
            System.out.println("SmartTv has been changed backward");
            channel--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void VolumeUp(){
        if(power == true && volume < 50) // Tv is already on you can set the volume to 50
            System.out.println("You have increased the Volume of your Tv: %d");
         volume++;
    }

    public void Volume(){
        if (power == true && volume > 50)
            System.out.println("You have reduced the volume of your TvSet");
    }

    public boolean isWifi() {
        return wifi;
    }


    public String getTvName() {
        return TvName;
    }

    public void setTvName(String tvName) {
        TvName = tvName;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
    public String tostring(){
         return " TvName " + TvName + ", Channel " + channel  + ", Volume " + volume + ", wifi " + wifi + ", power " + power;
    }
}
