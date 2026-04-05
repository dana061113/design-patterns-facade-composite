package facade;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole game = new GameConsole();

        HomeTheaterFacade facade = new HomeTheaterFacade(tv, audio, dvd, game);

        facade.watchMovie();
        facade.playGame();
        facade.listenMusic();
        facade.setVolume(15);
        facade.shutdown();
    }
}
