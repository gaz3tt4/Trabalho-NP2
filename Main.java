public class Main {
    public static void main(String[] args) {
        // Obtendo a instância de autenticação (Singleton)
        AuthService authService = AuthService.getInstance();
        authService.login("AdminUser");

        // Criando usuários com diferentes estratégias de permissão
        User admin = new User("AdminUser", new AdminPermission());
        User user = new User("RegularUser", new UserPermission());
        User guest = new User("GuestUser", new GuestPermission());

        // Cada usuário tenta acessar recursos
        admin.access();  // Acesso total
        user.access();   // Acesso limitado
        guest.access();  // Acesso restrito

        // Logout
        authService.logout();
    }
}