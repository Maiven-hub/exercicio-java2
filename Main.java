
class Main {
  public static void main(String[] args) {
    
    
    curso curso = new curso();
    curso.nomec = "liderança";
    curso.cargah = 70;
    
    curso curso2 = new curso();
    curso2.nomec = "comunicação";
    curso2.cargah = 100;

  
    aluno aluno = new aluno("geraldo",45);
    
    aluno aluno2 = new aluno("adamastor",107);


    

    

      //matricula
  aluno.curso=curso2;
  aluno2.curso=curso;
    
  
    //curso  

    //registro
  System.out.println(aluno.nome + " " + aluno.idade + " "+       
  aluno.curso.nomec + " "+aluno.curso.cargah + " " + aluno.registro);
    
  System.out.println("fim!");
  
    
  }
}