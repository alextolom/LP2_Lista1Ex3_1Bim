

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class CalculaPode {
    int AnoNasc;
    int Idade;
    String Pode;

    public int getAnoNasc() {
        return AnoNasc;
    }

    public void setAnoNasc(int AnoNasc) {
        this.AnoNasc = AnoNasc;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getPode() {
        int AnoAtual = 2018;
        Idade = AnoAtual - AnoNasc;
        if (Idade<16) {
            Pode = "Não pode nada";
        }else if(Idade<18){
            Pode = "Pode votar";
        }else if(Idade>=18){
            Pode = "Pode votar e dirigir";
        }   
        return Pode;


}
}
