public class UserPermission implements PermissionStrategy {
    @Override
    public void accessResource() {
        System.out.println("Acesso limitado para Usuário Comum.");
    }
}
