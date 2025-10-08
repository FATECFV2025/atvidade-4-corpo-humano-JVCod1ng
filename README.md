CONCLUSÕES E RESPOSTAS DAS QUESTÕES
=================================================================

    Questão 1: 
     Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1.
    - Ocorrência: Erro de compilação. O compilador informa que o campo (field) "massa" não é visível ("The field CorpoHumano.massa is not visible").
    - Conclusão: O modificador de acesso `private` no atributo `massa` impede que ele seja acessado ou modificado diretamente por qualquer outra classe (neste caso, a classe `Main`). Isso protege o dado e força o uso dos métodos públicos (getters/setters), garantindo o princípio do encapsulamento.

    Questão 2:
     Na classe Corpo_Humano altere a linha private float Massa para public float Massa;
    - Ocorrência: O código compila e executa sem erros. A atribuição direta (ex: `c1.Massa = 80;`) passa a funcionar.
    - Conclusão: Ao mudar para `public`, o atributo `Massa` se torna acessível de qualquer parte do código. Isso quebra o encapsulamento, pois permite que o estado interno do objeto seja modificado sem qualquer controle ou validação que poderia existir dentro de um método setter. Sendo assim, como o Chico ama dizer: "É uma má prática de programação orientada a objetos."

    Questão 3:
     Na classe Corpo_Humano altere a linha public setVolume(float volume) para private setVolume(float volume)
    - Ocorrência: Erro de compilação na classe `Main`, na linha onde o método é chamado (ex: `c1.setVolume(0.08)`). O compilador informa que o método não é visível ("The method setVolume(float) from the type CorpoHumano is not visible").
    - Conclusão: Assim como os atributos, os métodos também podem ser privados. Ao tornar o `setVolume` privado, ele só pode ser chamado de dentro da própria classe `CorpoHumano`. Isso o torna inútil para o seu propósito, que é permitir que um código externo (como o da classe `Main`) modifique o valor do volume de forma controlada.

