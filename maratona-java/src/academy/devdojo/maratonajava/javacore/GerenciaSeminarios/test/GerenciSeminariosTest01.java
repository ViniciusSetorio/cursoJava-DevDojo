package academy.devdojo.maratonajava.javacore.GerenciaSeminarios.test;

import academy.devdojo.maratonajava.javacore.GerenciaSeminarios.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.GerenciaSeminarios.dominio.Local;
import academy.devdojo.maratonajava.javacore.GerenciaSeminarios.dominio.Professor;
import academy.devdojo.maratonajava.javacore.GerenciaSeminarios.dominio.Seminario;

public class GerenciSeminariosTest01 {
    public static void main(String[] args) {
        Local local = new Local("Instituto Federal do Piauí - Picos");

        Aluno aluno = new Aluno("Vinícius Alves", 18);
        Aluno[] alunos = {aluno};

        Seminario seminario = new Seminario("Apresentando Projetos", alunos, local);
        Seminario[] seminarios = {seminario};

        Professor professor = new Professor("Rogério", "Programação Web", seminarios);
        professor.imprime();
    }
}