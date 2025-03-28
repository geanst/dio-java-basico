
UML do exercício sobre iPhone:

```mermaid
classDiagram
    class iPhone {
        +ligar()
        +desligar()
    }

    class reprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class aparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class navegadorNaInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone ..|> reprodutorMusical
    iPhone ..|> aparelhoTelefonico
    iPhone ..|> navegadorNaInternet
    
