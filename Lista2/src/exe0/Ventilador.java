package exe0;
public class Ventilador {
    private int velocidade; //variavel privada tem set e get
    private boolean ligado;

    //construtor vazio
    public Ventilador(){
        //valores padrao
        this.velocidade = 0;
        this.ligado = false;
    }

    //construtor com os parametros
    public Ventilador(int velocidade, boolean ligado){
        this.setVelocidade(velocidade);
        this.setLigado(ligado);
    }

    public void setVelocidade(int velocidade){
        if(velocidade >= 0 && velocidade <= 3){
            this.velocidade = velocidade;
            if(this.velocidade == 0){
                this.ligado = false;
            }
        }
        else{
            System.out.println("Velocidade Inválida");
        }
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    //acelerar
    public void acelerar(){
        this.setVelocidade(this.velocidade + 1);
    }

    public void frear(){
        this.setVelocidade(this.velocidade - 1);
        ePar();
    }

    private void ePar(){
        if(this.velocidade % 2 == 0){
            System.out.println("É par");
        }
        else{
            System.out.println("É impar");
        }
    }
}
