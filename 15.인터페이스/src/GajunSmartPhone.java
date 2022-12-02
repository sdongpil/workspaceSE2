
public class GajunSmartPhone implements GajunVolume, GajunOnOff {
    @Override
    public void on() {
        System.out.println("GajunSmartPhone On");
    }

    @Override
    public void off() {
        System.out.println("GajunSmartPhone Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("GajunSmartPhone volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("GajunSmartPhone volumeDown");
    }
}
