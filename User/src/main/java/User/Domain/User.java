package User.Domain;

public class User {

    private UserId userId;
    private Email email;
    private LastName lastName;
    private Password password;
    private Username username;

    public User(UserId userId, Email email, LastName lastName, Password password, Username username) {
        this.userId = userId;
        this.email = email;
        this.lastName = lastName;
        this.password = password;
        this.username = username;
    }

    public UserId getUserId() {
        return userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public LastName getLastName() {
        return lastName;
    }

    public void setLastName(LastName lastName) {
        this.lastName = lastName;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }
}
