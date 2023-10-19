package test;

import model.*;
import service.EntityManagerAdmin;
import service.IDAO;
import service.ImplIDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

   /* public static void main(String[] args)  {
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
    }*/

    /*public static void main(String[] args) {
        IDAO dao = new ImplIDAO();
        Estudiante estudiante = new Estudiante();
        estudiante.setId(1);
        estudiante.setNombre("Hoowerts");
        List<Curso> cursos = new ArrayList<>();
        Curso curso = new Curso();
        curso.setId(1);
        curso.setNombre("Español");
        curso.setEstudiante(estudiante);
        cursos.add(curso);
        Curso curso1= new Curso();
        curso1.setId(2);
        curso1.setNombre("Matematica");
        curso1.setEstudiante(estudiante);
        cursos.add(curso1);
        estudiante.setCurso(cursos);
        dao.insert(estudiante);
    }*/

    public static void main(String[] args) {
        IDAO dao = new ImplIDAO();
        List<Medicamento> listaMedicamento = new ArrayList<>();
        Medicamento medicamento = new Medicamento();
        medicamento.setId(1);
        medicamento.setNombre("Aspirina");
        dao.insert(medicamento);
        listaMedicamento.add(medicamento);
        Medicamento medicamento1 = new Medicamento();
        medicamento1.setId(2);
        medicamento1.setNombre("Acetaminofen");
        dao.insert(medicamento1);
        listaMedicamento.add(medicamento1);
        Receta receta = new Receta();
        receta.setId(1);
        receta.setFecha(new Date());
        receta.setNombre("Norman");
        receta.setListaMedicamento(listaMedicamento);
        dao.insert(receta);
    }
}
