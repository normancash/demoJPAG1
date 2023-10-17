package test;

import model.Carrera;
import model.Usuario;
import service.EntityManagerAdmin;
import service.IDAO;
import service.ImplIDAO;

import java.util.List;

public class Main {

    public static void main(String[] args)  {
        IDAO dao = new ImplIDAO();
        try {
            Usuario u = new Usuario();
            u.setFirstName("Shemely");
            u.setLastName("Uriarte");
            u.setId(3);
            dao.insert(u);
            Carrera carrera = new Carrera(1,"Ing.Sistema",u);
            dao.insert(carrera);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        List<Usuario> lista = dao.getAll("Usuario.all",Usuario.class);
        System.out.println(lista);
    }
}
