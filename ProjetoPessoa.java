package projetopessoa;
 public class ProjetoPessoa extends Pessoa{
   public static void main(String[] args) {
     
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno ();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Luiz");
       p2.setNome("Marileia");
       p3.setNome("Claudio");
       p4.setNome("Farilia");
       
       p1.setSexo("M");
       p2.setSexo("F");
       p2.setIdade(18);
       
       p2.setCurso("Informática");
       p3.setSalario(2.75f);
       
  
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
    }
    
}
