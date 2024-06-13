package User.Domain;

import java.util.UUID;

public class UserId {

    private UUID userId;

    public UserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
