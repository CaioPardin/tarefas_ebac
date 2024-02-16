public class carro {

    private String nome;

    private String marca;

    private int valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getValor(int valor) {
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void imprimirMarca() {
        System.out.println("Volkswagem");
    }
}
