package dome.catalogo;

import dome.catalogo.midia.CD;
import dome.catalogo.midia.MidiaAbstrata;
import java.util.Scanner;
import java.util.Vector;

public class CatalogoCD extends CatalogoAbstrato {

    public CatalogoCD() {
        super();
    }

    public void inserirInformacao() {
        CD cd = new CD();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do CD:");
        cd.setCodigo(scanner.nextLine());
        
        System.out.println("Digite o título do CD:");
        cd.setTitulo(scanner.nextLine());
        
        System.out.println("Digite o artista do CD:");
        cd.setResponsavel(scanner.nextLine());
        
        System.out.println("Digite um comentário para o CD: ");
        cd.setComentario(scanner.nextLine());
        
        System.out.println("Digite o tempo de reprodução do CD em minutos:");
        cd.setTempoReproducao(scanner.nextFloat());
        
        System.out.println("Digite o número de faixas do CD:");
        cd.setNumeroFaixas(scanner.nextInt());

        System.out.println("A cópia que você possi é uma cópia física? (Digite true ou false): ");
        cd.setCopiaReal(scanner.nextBoolean());

        lista.add(cd); 
    }
    
    public void remover(String codigo) {
        lista.remove((CD) selecionar(codigo));
    }
    
}
