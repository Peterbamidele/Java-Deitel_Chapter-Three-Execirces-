public class SmartTvTest {
    public static void main(String[] args) {
//
//        SmartTv MyTv = new SmartTv();
//        MyTv.setTvName("LG");
//        MyTv.setChannel(10);
//        MyTv.setWifi(true);
//        MyTv.setVolume(6);
//        MyTv.setPower(true);
//        System.out.println(MyTv.tostring());


        SmartTv MyTv2 = new SmartTv();
//        System.out.printf(MyTtv2.tostring(),MyTtv2.getTvName(),MyTtv2.isPower(),MyTtv2.getChannel(),MyTtv2.getVolume(),MyTtv2.isWifi());

        MyTv2.setPower(true);
        MyTv2.channelUp();
        MyTv2.Volume();
        System.out.println(MyTv2.getVolume(),MyTv2.getChannel());

    }
}
