package POO;


public class Tucano {

    public String nome;
    public String cor; 
    public float altura;


    public Tucano (String nome, String cor, float altura){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Tucano(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
    
    }

    public void voar (){
        System.out.println(nome + " sabe voar.");
    }

    public void som(){
        System.out.println(nome + " está cantando o hino do Vasco!");
    }

    public static void main(String[] args) {

        Tucano tucano1 = new Tucano ("Lionel Messi", "Bege", 234);
        Tucano tucano2 = new Tucano ("Ribamar", "Azul Castanho", 356);

        System.out.println("Nome dos Tucanos criados: ");
        System.out.println(tucano1.getNome());
        System.out.println(tucano2.getNome());
        
        System.out.println();
        System.out.println("Cor dos Tucanos: ");
        System.out.println(tucano1.getCor());
        System.out.println(tucano2.getCor());

        System.out.println();
        System.out.println("Altura dos Tucanos (Em centímetros): ");
        System.out.println(tucano1.getAltura() + " cm.");
        System.out.println(tucano2.getAltura() + " cm.");
        
    }

}