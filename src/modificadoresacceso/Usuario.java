package modificadoresacceso;

class Usuario {
String username;
private String password;

// Default
// private
// public
// protected

void saludar(){
    System.out.println("Hola, mi usuario es: " + this.username);
}

// Getters y Setters

// Getter - Obtener el valor del atributo
public String getPassword(){
    return this.password;
}

// Setter - Modificar el valor del atributo
public void setPassword(String pass){
    password = pass;
}



}
