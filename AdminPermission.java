public class AdminPermission implements PermissionStrategy {
    @Override
    public void accessResource() {
        System.out.println("Acesso total concedido ao Administrador.");
    }
}
