package miu.edu.cs489.adsrestapplication.deo.user;

public record UserAuthResponse(
        String jwtToken,
        String firstName,
        String lastName
) {
}
