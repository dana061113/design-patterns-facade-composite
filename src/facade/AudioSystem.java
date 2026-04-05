package facade;

public class AudioSystem {
    public void on() {
        System.out.println("Аудио система қосылды");
    }

    public void off() {
        System.out.println("Аудио система өшірілді");
    }

    public void setVolume(int volume) {
        System.out.println("Дыбыс деңгейі: " + volume);
    }
}
