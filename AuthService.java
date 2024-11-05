public class AuthService {
    private static AuthService instance;
    private String currentUser;

    private AuthService() {
        // Inicialização da autenticação
    }

    public static AuthService getInstance() {
        if (instance == null) {
            instance = new AuthService();
        }
        return instance;
    }

    public void login(String username) {
        this.currentUser = username;
        System.out.println("Usuário " + username + " autenticado com sucesso.");
    }

    public void logout() {
        System.out.println("Usuário " + currentUser + " fez logout.");
        this.currentUser = null;
    }

    public String getCurrentUser() {
        return currentUser;
    }
}
