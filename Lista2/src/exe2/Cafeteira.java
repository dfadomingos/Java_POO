package exe2;

public class Cafeteira {
    private int agua;
    private int poCafe;
    private boolean ligada;

    //construtor vazio
    public Cafeteira(){
        this.agua = 0;
        this.poCafe = 0;
        this.ligada = false;
    }

    //construtor com parametros
    public Cafeteira(int agua, int poCafe, boolean ligada){
        this.setAgua(agua);
        this.setPoCafe(poCafe);
        this.ligada = ligada;
    }

    //set para agua
    public void setAgua(int agua){
        if (agua >= 0 && agua <= 2000){
            this.agua = agua;
        } else{
            System.out.println("Quantidade de água inválida!");
        }
    }

    //set para poCafe
    public void setPoCafe(int poCafe){
        if (poCafe >= 0 && poCafe <= 100){
            this.poCafe = poCafe;
        } else{
            System.out.println("Quantidade de pó de café inválida!");
        }
    }

    //ligar
    public void ligar(){
        if (!this.ligada){
            this.ligada = true;
        }
    }
    //desligar
    public void desligar(){
        if (this.ligada){
            this.ligada = false;
        }
    }

    //gets
    public int getAgua(){
        return this.agua;
    }
    public int getPoCafe(){
        return this.poCafe;
    }

    public void adicionarAgua(int ml){
        this.setAgua(this.agua + ml);
    }

    public void adicionarCafe(int gramas){
        this.setPoCafe(this.poCafe + gramas);
    }

    public void prepararCafe(){
        if (this.ligada && this.agua >= 100 && this.poCafe >= 10){
            this.setAgua(this.agua - 100);
            this.setPoCafe(this.poCafe - 10);
            System.out.println("Café preparado!");
        } else if (!this.ligada){
            System.out.println("Erro no preparo! Cafeteira está desligada!\n");
        } else{
            System.out.println("Erro no preparo! Recursos insuficientes!\n");
        }
    }

    public void exibe(){
        System.out.println("Quantida de água: " + this.getAgua() + "\nQuantidade de pó de café: "
                + this.getPoCafe() + (this.ligada ? "\nCafeteira ligada\n": "\nCafeteira desligada\n"));
    }

    //desafio extra
    public void cafesPossiveis() {
        int possiveisPorAgua = this.agua / 100;
        int possiveisPorCafe = this.poCafe / 10;
        int possiveisTotal = Math.min(possiveisPorAgua, possiveisPorCafe);
        System.out.println("Quantidade de cafés possíveis: " + possiveisTotal);
    }

}
