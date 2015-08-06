package spa.seccionuno.pasarobjetosentreactividades;

import java.io.Serializable;

/**
 * Created by USUARIO on 13/06/2015.
 */
public class Cliente implements Serializable{
    private static final long serialVersionUID=1L;
    String _nombre;
    String _email;

    public void setNombre(String nombre){
        _nombre=nombre;
    }

    public String Nombre(){
        return _nombre;
    }

    public void setEmail(String email){
        _email=email;
    }

    public String Email(){
        return _email;
    }

}
