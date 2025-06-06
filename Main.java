import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> biblioteca = new ArrayList<Livro>();
        ArrayList<LivroFisico> bibliotecaFisica = new ArrayList<LivroFisico>();
        ArrayList<LivroDigital> bibliotecaDigital = new ArrayList<LivroDigital>();
        ArrayList<Autor> atores = new ArrayList<Autor>();

        Scanner scan = new Scanner(System.in);
        Integer option = -1;

        while(option != 0){

            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Adicionar Autor");
            System.out.println("3 - Exibir Livros");
            System.out.println("4 - Exibir Autores");
            System.out.println("0 - Sair");
            option = scan.nextInt();

            if(option == 1){    
                
                String titulo;
                Integer anoPublicacao;
                Autor autor = new Autor(null , null);

                System.out.println("Qual o titulo do livro ? ");
                scan.nextLine();
                titulo = scan.nextLine();

                System.out.println("Qual o Ano que foi publicado ?");
                anoPublicacao = scan.nextInt();

                System.out.println("1) Autor Novo\n2) Selecionar Autor já existente");
                scan.nextLine();
                option = scan.nextInt();

                if(option == 1){
                    String nome;
                    String nacionalidade;

                    System.out.println("Digite o nome do Autor : ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    autor.setNome(nome);

                    System.out.println("Digite a nacionalidade do Autor : ");
                    nacionalidade = scan.nextLine();
                    autor.setNacionalidade(nacionalidade);

                    atores.add(autor);
                }
                if(option == 2){

                    for(int i = 0; i < atores.size(); i++ ){
                        System.out.println("[" + i + "]" + atores.get(i).toString());
                    }
                    System.out.println("Selecione um dos atores acima");
                    scan.nextLine();
                    option = scan.nextInt();

                    autor.setNome(atores.get(option).getNome());
                    autor.setNacionalidade(atores.get(option).getNacionalidade());

                }

                System.out.println("O livro é\n1) Digital\n2) Físico");
                option = scan.nextInt();

                if(option == 1){
                    double tamanhoDoArquivoMB;
                    System.out.println("Digite o tamanho do arquivo em MB");
                    scan.nextLine();
                    tamanhoDoArquivoMB = scan.nextDouble();
                    bibliotecaDigital.add(new LivroDigital(titulo, anoPublicacao, autor, tamanhoDoArquivoMB));
                }

                if(option == 2){
                    Integer numeroDePaginas;
                    System.out.println("Digite a quantidade de paginas : ");
                    scan.nextLine();
                    numeroDePaginas = scan.nextInt();
                    bibliotecaFisica.add(new LivroFisico(titulo, anoPublicacao, autor, numeroDePaginas));
                }

                biblioteca.add(new Livro(titulo, anoPublicacao, autor));

            }
            else if(option == 2){
                Autor autor = new Autor(null, null);
                String nome;
                String nacionalidade;

                System.out.println("Digite o nome do Autor : ");
                scan.nextLine();
                nome = scan.nextLine();
                autor.setNome(nome);

                System.out.println("Digite a nacionalidade do Autor : ");
                nacionalidade = scan.nextLine();
                autor.setNacionalidade(nacionalidade);

                atores.add(autor);                
            }

            else if(option == 3){
                System.out.println("1)Ver Todos os Livros\n2)Ver Todos os Livros Fisicos\n3)Ver Todos os Livros Digitais");
                scan.nextLine();
                option = scan.nextInt();

                if(option == 1){
                    System.out.println("Livros Físicos : ");

                    for(int i = 0; i < bibliotecaFisica.size(); i++ ){
                        System.out.println("[" + i + "]" + bibliotecaFisica.get(i).exibirDetalhes());
                    }
                    System.out.println("Livros Digitais : ");
                     for(int i = 0; i < bibliotecaDigital.size(); i++ ){
                        System.out.println("[" + i + "]" + bibliotecaDigital.get(i).exibirDetalhes());
                    }
                    
                }
                else if(option == 2){
                    for(int i = 0; i < bibliotecaFisica.size(); i++ ){
                        System.out.println("[" + i + "]" + bibliotecaFisica.get(i).exibirDetalhes());
                    }
                }
                else if(option == 3){
                    for(int i = 0; i < bibliotecaDigital.size(); i++ ){
                        System.out.println("[" + i + "]" + bibliotecaDigital.get(i).exibirDetalhes());
                    }
                }
            }

            else if(option == 4){
                    for(int i = 0; i < atores.size(); i++ ){
                        System.out.println("[" + i + "]" + atores.get(i).toString());
                    }
            }


            
        }

        scan.close();
        
    }
    

}