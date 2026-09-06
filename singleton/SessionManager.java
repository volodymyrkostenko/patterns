package singleton;

import java.util.UUID;

public final class SessionManager {

    private String accessToken;
    private static SessionManager instance;

    private SessionManager() {
        this.accessToken = UUID.randomUUID().toString();
    }

    public static SessionManager getInstance() {
        SessionManager result = instance;

        if (result != null) {

            return instance;
        }

        synchronized (SessionManager.class) {
            if (instance == null) {
                instance = new SessionManager();
            }
            return instance;
        }
    }

    public String getAccessToken() {
        return accessToken;
    }

}
