# Sistema de Gerenciamento de Museu

Projeto da disciplina de Programação Orientada a Objetos (POO) da Universidade Federal de Goiás (UFG).

A versão atual roda no terminal e permite cadastrar artistas, obras, visitantes e exposições, além de consultar o acervo e o histórico de exposições. Os registros ficam em memória durante a execução. A interface gráfica está prevista para uma etapa futura.

## Estrutura

| Caminho | Conteúdo |
| --- | --- |
| `src/Main.java` | Ponto de entrada e menu do terminal |
| `src/Artista.java`, `src/Obra.java`, `src/Visitante.java`, `src/Exposição.java` | Classes do domínio do museu |
| `src/Acervo.java`, `src/Historico.java` | Coleções de obras e exposições |

## Como executar

Com um JDK instalado, rode estes comandos na raiz do repositório.

```sh
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

No IntelliJ IDEA, abra a pasta do repositório, selecione um JDK, marque `src` como **Sources Root** e execute `Main.java`.
