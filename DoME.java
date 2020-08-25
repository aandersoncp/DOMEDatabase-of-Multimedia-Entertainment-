package dome;

import dome.catalogo.CatalogoCD;
import dome.catalogo.CatalogoDVD;
import dome.catalogo.CatalogoJogo;
import java.util.Scanner;

public class DoME {
    public static void main(String[] args) {
        System.out.println("BEM VINDO AO DoME");
        String opcao;
        String comando = "";
        Scanner scanner = new Scanner(System.in);
        CatalogoCD cd = new CatalogoCD();
        CatalogoDVD dvd = new CatalogoDVD();
        CatalogoJogo jogo = new CatalogoJogo();
        while(!(comando.equals("5"))){
            System.out.println("No DoME você pode: \n(1) Inserir um novo título \n(2) Listar todos os itens do catálogo \n(3) Consultar com o nome a existência do item \n(4) Remover um título \n(5) Para sair." );
            System.out.println("Digite uma das opções:");
            comando = scanner.nextLine();
            
            switch(comando){
                case "1":
                    System.out.println("Você deseja inserir um CD, um DVD ou um JOGO? Digite CD, DVD ou JOGO");
                    opcao = scanner.nextLine();
                    boolean opcao_valida = false;
                    while(opcao_valida == false){
                        if(opcao.equals("CD") || opcao.equals("cd")){
                            cd.inserirInformacao();
                            opcao_valida = true;
                        } else if(opcao.equals("DVD") || opcao.equals("dvd")){
                            dvd.inserirInformacao();
                            opcao_valida = true;
                        } else if(opcao.equals("JOGO") || opcao.equals("jogo")){
                            jogo.inserirInformacao();
                            opcao_valida = true;
                        } 
                    }
                    break;
                    
                case "2":
                    System.out.println("TODOS OS CDs:\n");
                    cd.listar();
                    System.out.println("TODOS OS DVDs:\n");
                    dvd.listar();
                    System.out.println("TODOS OS JOGOS:\n");
                    jogo.listar();
                    break;
                    
                case "3":
                    System.out.println("Digite o nome do título que deseja consultar:");
                    opcao = scanner.nextLine();
                    if(cd.consultar(opcao) != null){
                        cd.consultar(opcao).status();
                    } else if(dvd.consultar(opcao) != null){
                        dvd.consultar(opcao).status();
                    } else if(jogo.consultar(opcao) != null){
                        jogo.consultar(opcao).status();
                    } else{
                        System.out.println("\nO título não existe!\n");
                    }
                    break;
                    
                case "4":
                    System.out.println("Digite o código do item que deseja remover:");
                    opcao = scanner.nextLine();
                    if(cd.selecionar(opcao) != null){
                        cd.remover(opcao);
                    } else if(dvd.selecionar(opcao) != null){
                        dvd.remover(opcao);
                    } else if(jogo.selecionar(opcao) != null){
                        jogo.remover(opcao);
                    } else {
                        System.out.println("\nO título não existe!\n");
                    }
                    break;
                    
                default: 
                    System.out.println("Digite um dos comandos válidos.");
                    break;
            }
        }
    }     
}
