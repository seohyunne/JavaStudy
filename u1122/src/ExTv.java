public class ExTv {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel=100;
        t.volume=0;
        System.out.println("Channel: "+t.channel+" Volume: "+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH: "+t.channel+" Volume: "+t.volume);
    }
}
