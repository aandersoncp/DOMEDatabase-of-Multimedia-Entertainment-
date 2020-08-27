package dome;

import dome.catalogo.CatalogoMidia;
import dome.catalogo.midia.CD;
import dome.catalogo.midia.DVD;
import dome.catalogo.midia.Jogo;
import java.util.Scanner;

public class DoME {
    public static void main(String[] args) {
        System.out.println("BEM VINDO AO DoME");
        String opcao;
        String comando = "";
        Scanner scanner = new Scanner(System.in);
        CatalogoMidia catalogo = new CatalogoMidia();
        while(!(comando.equals("SAIR"))){
            System.out.println("\nNo DoME você pode: \n(1) Inserir um novo título \n(2) Listar todos os itens do catálogo \n(3) Consultar com o título a existência do item \n(4) Listar somente os CDs\n(5) Listar somente os DVDs\n(6) Listar somente os JOGOS\n(7) Remover um título \n(SAIR) Para sair." );
            System.out.println("Digite uma das opções:");
            comando = scanner.nextLine();
            
            switch(comando){
                case "1":
                    System.out.println("Você deseja inserir um CD, um DVD ou um JOGO? Digite CD, DVD ou JOGO");
                    opcao = scanner.nextLine();
                    boolean opcao_valida = false;
                    while(opcao_valida == false){
                        if(opcao.equals("CD") || opcao.equals("cd")){
                            catalogo.inserirInformacao(new CD());
                            opcao_valida = true;
                        } else if(opcao.equals("DVD") || opcao.equals("dvd")){
                            catalogo.inserirInformacao(new DVD());
                            opcao_valida = true;
                        } else if(opcao.equals("JOGO") || opcao.equals("jogo")){
                            catalogo.inserirInformacao(new Jogo());
                            opcao_valida = true;
                        } else{
                            System.out.println("Você deseja inserir um CD, um DVD ou um JOGO? Digite CD, DVD ou JOGO.");
                            opcao = scanner.nextLine();
                        }
                    }
                    break;
                    
                case "2":
                    catalogo.listar();
                    break;
                    
                case "3":
                    System.out.println("Digite o título do item que deseja consultar:");
                    opcao = scanner.nextLine();
                     if(catalogo.consultar(opcao) != null){
                         System.out.println("\nItem encontrado!");
                        catalogo.consultar(opcao).status();
                    } else {
                        System.out.println("\nO título não existe!");
                    }
                    break;
                
                case "4":
                    catalogo.listarEspecifica("CD");
                    break;
                
                case "5":
                    catalogo.listarEspecifica("DVD");
                    break; 
                
                case "6":
                    catalogo.listarEspecifica("JOGOS");
                    break;
                    
                case "7":
                    System.out.println("Digite o título do item que deseja remover:");
                    opcao = scanner.nextLine();
                    if(catalogo.consultar(opcao) != null){
                        catalogo.remover(opcao);
                        System.out.println("\nItem removido!");
                    } else {
                        System.out.println("\nO título não existe!");
                    }
                    break;
              
                default: 
                    if(!comando.equals("SAIR")){
                         System.out.println("\nDigite um dos comandos válidos!");
                    }
                    break;
            }
        }
    }     
}

