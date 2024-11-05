public class GuestPermission implements PermissionStrategy {
    @Override
    public void accessResource() {
        System.out.println("Acesso restrito para Convidado.");
    }
}

// Contexto de uso
public class User {
    private PermissionStrategy permissionStrategy;
    private String username;

    public User(String username, PermissionStrategy permissionStrategy) {
        this.username = username;
        this.permissionStrategy = permissionStrategy;
    }

    public void setPermissionStrategy(PermissionStrategy permissionStrategy) {
        this.permissionStrategy = permissionStrategy;
    }

    public void access() {
        System.out.print(username + ": ");
        permissionStrategy.accessResource();
    }
}
