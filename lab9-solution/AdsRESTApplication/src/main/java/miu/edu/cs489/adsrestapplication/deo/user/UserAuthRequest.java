package miu.edu.cs489.adsrestapplication.deo.user;

public record UserAuthRequest(
        String username,
        String password
) {
}
