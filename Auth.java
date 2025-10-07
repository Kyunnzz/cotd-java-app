public class Auth {
    
    public boolean login(String username, String password) {
        // Logic for user login
        // This is a placeholder for actual authentication logic
        return username.equals("admin") && password.equals("password");
    }

    public boolean register(String username, String password) {
        // Logic for user registration
        // This is a placeholder for actual registration logic
        return true; // Assume registration is always successful for this example
    }

    public boolean validateUser(String username) {
        // Logic to validate if a user exists
        // This is a placeholder for actual validation logic
        return username.equals("admin");
    }
}