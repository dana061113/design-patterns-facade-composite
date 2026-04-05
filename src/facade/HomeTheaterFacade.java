package facade;

public class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;
    private GameConsole game;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole game) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.game = game;
    }

    // 🎬 Фильм көру
    public void watchMovie() {
        System.out.println("\n=== Фильм режимі ===");
        tv.on();
        audio.on();
        audio.setVolume(10);
        dvd.play();
    }

    // 🎮 Ойын режимі
    public void playGame() {
        System.out.println("\n=== Ойын режимі ===");
        tv.on();
        game.on();
        game.startGame();
    }

    // 🎵 Музыка
    public void listenMusic() {
        System.out.println("\n=== Музыка режимі ===");
        tv.on();
        audio.on();
        audio.setVolume(7);
    }

    public void setVolume(int volume) {
        audio.setVolume(volume);
    }

    public void shutdown() {
        System.out.println("\n=== Барлығы өшірілді ===");
        tv.off();
        audio.off();
        dvd.stop();
    }
}
