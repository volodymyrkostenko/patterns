package singleton;

public class Main {

    public static void main(String[] args) {
        AppConfig conf1 = AppConfig.getInstance();
        AppConfig conf2 = AppConfig.getInstance();

        conf1.width = 135;

        System.out.println(conf1.width == conf2.width); // true

        SessionManager session1 = SessionManager.getInstance();
        SessionManager session2 = SessionManager.getInstance();

        System.out.println(session1.getAccessToken() == session2.getAccessToken());

    }
}
