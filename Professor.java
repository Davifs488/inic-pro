package projetopessoa;
  public class Professor extends Pessoa {
    private String espec;
    private float salario;
    
    public void receberAum(float aum){
       this.salario += aum; 
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setNome(String claudio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
