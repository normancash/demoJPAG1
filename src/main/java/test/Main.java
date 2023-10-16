package test;

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
            u.setFirstName("Kenneth");
            u.setLastName("Lopez");
            u.setId(2);
            dao.insert(u);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        List<Usuario> lista = dao.getAll("Usuario.all",Usuario.class);
        System.out.println(lista);
    }
}
