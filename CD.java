package dome.catalogo.midia;

public class CD extends MidiaAbstrata{
    private int numeroFaixas;
    private String responsavel;
    
    public CD() {
        super();
    }
    
    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public void status(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Artista: " + this.responsavel);
        System.out.println("Número de faixas: " + this.numeroFaixas);
        System.out.println("Tempo de reprodução: " + this.tempoReproducao + " minutos");
        if(copiaReal){
            System.out.println("Cópia: É cópia real");
        } else {
            System.out.println("Cópia: Não é cópia real");
        }
        System.out.println("Comentário: " + this.comentario + "\n");
    }
    
}
