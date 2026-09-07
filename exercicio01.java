import java.util.Scanner;

public class exercicio01 {

    //Atividade aula 06 - exercício 01
    // Turma: ADS1AN-ESA1-90834648
    // Curso: Análise e desenvolvimento de sistemas
    // Professor: Alexandre de Oliveira 
    // Aluno: Guilherme Michelsen Silva de Oliveira 
    // Data: 07/09/2026

    public static void main(String[] args) throws Exception {
      Scanner leitor = new Scanner(System.in);
      
      //entrada
      System.out.print("Digite seu nome:");
      String nome = leitor.nextLine();
      System.out.print("Digite sua idade:");
      int idade = leitor.nextInt();

      leitor.nextLine(); // limpeza

      System.out.print("Digite sua cidade:");
      String cidade = leitor.nextLine();

      //Saída
      System.out.println("Nome:" + nome);
      System.out.println("Idade:" + idade);
      System.out.println("Cidade:" + cidade);

      leitor.close();

    
    }
}
 