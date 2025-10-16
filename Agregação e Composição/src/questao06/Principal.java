package questao06;

public class Principal {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Lucas Silva");

        Turma turma = new Turma("BT01");
        turma.setProfessor(prof1);
        turma.resumo();

        System.out.println("\nTrocando de professor...\n");

        Professor prof2 = new Professor("Larissa Lima");
        turma.setProfessor(prof2);
        turma.resumo();
    }
}
