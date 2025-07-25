# Primeiro-projeto-java

🎬 Screen Match - Primeiro Projeto em Java
Bem-vindo ao Screen Match, o seu primeiro projeto em Java! Este projeto é uma aplicação simples em linha de comando que simula a exibição de informações sobre um filme, incluindo título, ano de lançamento, sinopse, avaliação e classificação.

📌 Sobre o Projeto
Este é um projeto introdutório em Java, ideal para quem está começando na programação. Ele apresenta conceitos básicos como:

Declaração de variáveis

Tipos primitivos (int, double, boolean)

Operações matemáticas

Casting (conversão de tipos)

Impressão no terminal com System.out.println

O código simula o sistema de um aplicativo de streaming que exibe informações de um filme, calcula a média de avaliações e gera uma classificação baseada nessa média.

💻 Código Fonte
java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada por 3 avaliações
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
🛠️ Requisitos
Para rodar o projeto, você precisará ter instalado:

Java JDK 17+

Um editor de código como IntelliJ IDEA ou VS Code

Terminal ou prompt de comando

🚀 Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/screen-match-java.git
Navegue até o diretório do projeto:

bash
Copiar
Editar
cd screen-match-java
Compile o código:

bash
Copiar
Editar
javac Main.java
Execute o programa:

bash
Copiar
Editar
java Main
📚 Conceitos Envolvidos
Variáveis e Tipos de Dados: definição de int, double, boolean e String.

Operações Matemáticas: cálculo da média das notas.

Casting: conversão de double para int para gerar a classificação.

Saída de Dados: uso de System.out.println.

✨ Resultado Esperado
Ao rodar o código, o terminal exibirá:

yaml
Copiar
Editar
Esse é o Screen Match
Filme: Top Gun: Maverick
Ano de lançamento: 2022
8.033333333333333
Filme de aventura com galã dos anos 80
4

📦 Próximos Passos
Adicionar mais filmes com estrutura orientada a objetos

Criar classes como Filme, Serie e Catalogo

Implementar entrada de dados com Scanner

Persistir dados em arquivos ou banco de dados

🧑‍💻 Autor
Feito com 💻 por Arthur Carvalho — apaixonado por programação e filmes!

📄 Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
