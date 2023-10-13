package test;

import model.Usuario;
import service.EntityManagerAdmin;
import service.IDAO;
import service.ImplIDAO;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDAO dao = new ImplIDAO();
        List<Usuario> lista = dao.getAll("Usuario.all",Usuario.class);
        System.out.println(lista);

    }
}
