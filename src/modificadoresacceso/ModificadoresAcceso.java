package modificadoresacceso;

public class ModificadoresAcceso {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario();
        
        usuario.username ="Balckman";
        //usuario.password = "123456";
        
        usuario.setPassword("123456");
        
        System.out.println("Username:" + usuario.username);
        System.out.println("Password: " + usuario.getPassword());
        
        
        usuario.saludar();
             
        
    }
    
}
