package singleton;

public final class AppConfig {

    private static AppConfig instance;

    public int width;
    public int length;

    private AppConfig() {
        this.length = 100;
        this.width = 200;
    }

    public static AppConfig getInstance() {

        if (instance == null) {
            instance = new AppConfig();

            return instance;
        }

        return instance;

    }
}
