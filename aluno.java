class aluno {
  registro REGISTRO = new registro();
  public String nome;
  public int idade;
  public int registro;
  public curso curso;

  aluno(String n,int i){
    this.nome=n;
    this.idade=i;
    this.registro=REGISTRO.novo();
    
  };


  
}