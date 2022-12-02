
public class GajunAudio implements GajunVolume, GajunOnOff {
    @Override
    public void on() {
        System.out.println("GajunAudio ON");
    }

    @Override
    public void off() {
        System.out.println("GajunAudio Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("GajunAudio volumUp");

    }

    @Override
    public void volumeDown() {
        System.out.println("GajunAudio volumDown");
    }
}
