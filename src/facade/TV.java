package facade;

public class TV {
    public void on() {
        System.out.println("TV қосылды");
    }

    public void off() {
        System.out.println("TV өшірілді");
    }

    public void setChannel(String channel) {
        System.out.println("TV каналға ауысты: " + channel);
    }
}
