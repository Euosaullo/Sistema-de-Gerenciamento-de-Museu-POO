import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        
        // Inicialização dos armazenamentos
        List<Artista> listaArtistas = new ArrayList<>();
        List<Visitante> listaVisitantes = new ArrayList<>();
        
        Acervo acervo = new Acervo();
        acervo.obras = new ArrayList<>(); // Inicializando a lista de obras do acervo
        
        Historico historico = new Historico();
        historico.exposicoes = new ArrayList<>(); // Inicializando a lista de exposições
        
        while(true){
            System.out.println("1 - Cadastrar Artista");
            System.out.println("2 - Cadastrar Obra");
            System.out.println("3 - Cadastrar Visitante");
            System.out.println("4 - Cadastrar Exposição");
            System.out.println("");
            System.out.println("5 - Consultar Acervo");
            System.out.println("6 - Consultar Histórico de Exposições");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            x = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número
            
            if (x == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            if (x == 1){
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                
                System.out.print("O autor está vivo? (1 - vivo, 0 - morto): ");
                int statusVivo = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
                
                boolean vivo = (statusVivo == 1);
                
                System.out.print("Data de nascimento: ");
                String nascimento = scanner.nextLine();
                
                String falecimento;
                if (!vivo){
                    System.out.print("Data de falecimento: ");
                    falecimento = scanner.nextLine();
                } else {
                    falecimento = "N/A";
                }
                
                System.out.print("Nacionalidade: ");
                String nacionalidade = scanner.nextLine();
                
                System.out.print("Especialidade: ");
                String especialidade = scanner.nextLine();
                
                // Instancia o Artista e salva na lista
                Artista artista = new Artista(nome, vivo, nascimento, falecimento, nacionalidade, especialidade, 0);
                listaArtistas.add(artista);
                System.out.println("Artista cadastrado com sucesso!\n");
            }
            
            else if (x == 2){
                
                System.out.print("Categoria da obra: ");
                String categoria = scanner.nextLine();
                
                System.out.print("Data da obra: ");
                String data = scanner.nextLine();
                
                System.out.println("Escolha o Autor (Artista) pelo número:");
                for (int i = 0; i < listaArtistas.size(); i++) {
                    System.out.println(i + " - " + listaArtistas.get(i).getNome());
                }
                
                System.out.print("Opção: ");
                int indexAutor = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
                
                if (indexAutor >= 0 && indexAutor < listaArtistas.size()) {
                    Artista autor = listaArtistas.get(indexAutor);
                    Obra obra = new Obra(categoria, data, autor);
                    acervo.obras.add(obra);
                    System.out.println("Obra cadastrada no acervo com sucesso!\n");
                } else {
                    System.out.println("Artista inválido!\n");
                }
            }
            
            else if (x == 3){
                System.out.print("Nome do visitante: ");
                String nome = scanner.nextLine();
                
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                
                Visitante visitante = new Visitante(nome, cpf, idade);
                listaVisitantes.add(visitante);
                System.out.println("Visitante cadastrado com sucesso!\n");
            }
            
            else if (x == 4){
                System.out.print("Título da Exposição: ");
                String titulo = scanner.nextLine();
                
                System.out.print("Data de início: ");
                String data_inicio = scanner.nextLine();
                
                System.out.print("Data de fim: ");
                String data_fim = scanner.nextLine();
                
                System.out.print("Preço do ingresso: ");
                Double preco = scanner.nextDouble();
                scanner.nextLine();
                
                
                Exposição exposicao = new Exposição(titulo, data_inicio, data_fim, preco);
                historico.exposicoes.add(exposicao);
                System.out.println("Exposição cadastrada com sucesso!\n");
            }
            
            else if (x == 5){
                System.out.println("\n--- OBRAS NO ACERVO ---");
                if (acervo.getObras().isEmpty()) {
                    System.out.println("Nenhuma obra cadastrada.");
                } else {
                    for (Obra o : acervo.getObras()) {
                        System.out.println("ID: " + o.getId_obra() + " | Categoria: " + o.getCategoria() + 
                                           " | Data: " + o.getData() + " | Autor: " + o.autor.getNome());
                    }
                }
                System.out.println("-----------------------\n");
            }
            
            else if (x == 6){
                System.out.println("\n--- HISTÓRICO DE EXPOSIÇÕES ---");
                if (historico.getExposicoes().isEmpty()) {
                    System.out.println("Nenhuma exposição cadastrada.");
                } else {
                    for (Exposição e : historico.getExposicoes()) {
                        System.out.println("Título: " + e.getTitulo() + " | Início: " + e.getData_inicio() + 
                                           " | Fim: " + e.getData_fim());
                    }
                }
                System.out.println("-------------------------------\n");
            } 
            else {
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        
        scanner.close();
    }
}