package questao06;

public class Turma {
    String codigo;
    Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    
    void setProfessor(Professor p) {
        this.professor = p;
    }

    void resumo() {
        System.out.println("Código da turma: " + codigo);
        if (professor != null) {
            System.out.println("Professor: " + professor.nome);
        } else {
            System.out.println("Sem professor atribuído.");
        }
    }
}
