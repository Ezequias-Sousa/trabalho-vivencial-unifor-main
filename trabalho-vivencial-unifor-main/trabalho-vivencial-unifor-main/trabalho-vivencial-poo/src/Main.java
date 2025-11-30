//Crie a main com:
//● 3 objetos de disciplina;
//● 3 objetos aluno (2 regulares e 1 bolsista);
//● 1 objeto professor;
//● 2 objetos visitante;
//● 3 objetos turma, contendo todos os alunos, o professor e 1 disciplina em cada
//turma criada;
//● Imprima na tela a informação de cada turma, seu código, o professor, a
//disciplina e a lista de alunos matriculados na turma.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Instanciar 3 objetos de disciplina
        Disciplina d1 = new Disciplina("MED101", "Infectologia e Doenças Infecciosas", 1);
        Disciplina d2 = new Disciplina("MED102", "Medicina Tropical", 1);
        Disciplina d3 = new Disciplina("MED201", "Imunologia", 2);

        // 2. Instanciar 3 objetos aluno (2 regulares e 1 bolsista)
        Aluno a1 = new Regular("123.456.789-00", "Ana Saraiva Albuquerque", 20, "2023001");
        Aluno a2 = new Regular("987.654.321-00", "Bruno Costa Sobreira", 22, "2023002");
        Aluno a3 = new Bolsista("555.666.777-88", "Carla Dias dos Santos", 19, "2023003");


        // Lista de alunos
        List<Aluno> todosAlunos = new ArrayList<>();
        todosAlunos.add(a1);
        todosAlunos.add(a2);
        todosAlunos.add(a3);

        // 3. Instanciar 1 objeto professor
        Professor p1 = new Professor(
                "123.456.789-10",
                "Me. Ricardo Calil Kores",
                45,
                "Centro de Medicina"
        );

        Visitante v1 = new Visitante(
                "Marcos Andrade da Silva Junior",
                "111.222.333-44",
                30
        );

        Visitante v2 = new Visitante(
                "Lucia Ferreira de Setubal",
                "555.666.777-88",
                28
        );



        // 5. Instanciar 3 objetos turma
        Turma t1 = new Turma("T-01", d1, p1);
        Turma t2 = new Turma("T-02", d2, p1);
        Turma t3 = new Turma("T-03", d3, p1);

        // Adicionar todos os alunos em todas as turmas
        for (Aluno aluno : todosAlunos) {
            t1.adicionarAluno(aluno);
            t2.adicionarAluno(aluno);
            t3.adicionarAluno(aluno);
        }

        // 6. Imprimir informações das turmas
        System.out.println(t1);
        t1.listarAlunos();
        System.out.println(t2);
        t2.listarAlunos();
        System.out.println(t3);
        t3.listarAlunos();
    }
}
