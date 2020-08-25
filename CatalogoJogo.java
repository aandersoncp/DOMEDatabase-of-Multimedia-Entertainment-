package dome.catalogo;

import dome.catalogo.midia.Jogo;
import dome.catalogo.midia.MidiaAbstrata;
import java.util.Scanner;

public class CatalogoJogo extends CatalogoAbstrato {

    public CatalogoJogo() {
        super();
    }

    public void inserirInformacao() {
        Jogo jogo = new Jogo();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do JOGO:");
        jogo.setCodigo(scanner.nextLine());
        
        System.out.println("Digite o título do JOGO:");
        jogo.setTitulo(scanner.nextLine());
        
        System.out.println("Digite a plataforma do JOGO: ");
        jogo.setComentario(scanner.nextLine());
        
        System.out.println("Digite o tempo de reprodução do JOGO em minutos:");
        jogo.setTempoReproducao(scanner.nextFloat());
        
        System.out.println("Digite o número de jogadores suportados:");
        jogo.setNumeroJogadores(scanner.nextInt());
        
        System.out.println("A cópia que você possi é uma cópia física? (Digite true ou false): ");
        jogo.setCopiaReal(scanner.nextBoolean());
        
        lista.add(jogo); 
    }

    /*@Override
    public void manter(MidiaAbstrata midia) {
        lista.add(midia);
    }*/

    public void remover(String codigo) {
        lista.remove((Jogo) selecionar(codigo));
    }
    
    
}
