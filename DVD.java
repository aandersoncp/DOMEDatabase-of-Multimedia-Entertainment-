package dome.catalogo.midia;

public class DVD extends MidiaAbstrata{
    private String responsavel;
    
    public DVD() {
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
        System.out.println("Diretor: " + this.responsavel);
        System.out.println("Tempo de reprodução: " + this.tempoReproducao + " minutos");
        if(copiaReal){
            System.out.println("Cópia: É cópia real");
        } else {
            System.out.println("Cópia: Não é cópia real");
        }
        System.out.println("Comentário: " + this.comentario + "\n");
    }    
}
