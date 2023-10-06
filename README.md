# Teste de Caixa Branca (ETAPA 2)

> #### Descrição da Atividade
>
> - Nesta atividade, foi realizado um estudo da técnica de teste de caixa-branca, também conhecida como teste estrutural ou teste de caixa de vidro. Durante a análise do código, identificaram-se diversos potenciais pontos de falha e incoerências, que podem ser categorizados como possíveis erros.

> #### A documentação foi descrita no código?
> 
> - Não, o código não possui documentação explícita.


> #### As variáveis e constantes possuem uma boa nomenclatura?
> 
> - A nomenclatura de variáveis e constantes no código não segue as melhores práticas de nomenclatura Java. Aqui estão alguns problemas identificados na nomenclatura:
> 
  > 1. **Má utilização de nomes de classe:** A classe é chamada de **User**, o que parece sugerir que representa um usuário, mas a funcionalidade real está relacionada a operações de banco de dados. Um nome mais apropriado para a classe poderia ser algo como **UserDatabaseManager** para refletir melhor seu propósito.
  > 
> 
  > 2. **Variáveis e constantes com nomes pouco descritivos:** As variáveis **conn**, **sql**, **st**, **rs**, **nome** e **result** têm nomes muito curtos e pouco descritivos, o que torna difícil entender o que elas representam e qual é o seu propósito. Nomes mais descritivos ajudariam a tornar o código mais legível.
  
> #### Existem Legibilidade e Organização no código?
> 
> - O código, em geral, não é muito legível devido a problemas como nomes de variáveis pouco descritivos e falta de comentários.
> 1. Para que o código se torne legível e organizado é importante se atentar as seguintes melhoras:
>    1. **Legibilidade:** As variáveis como conn, sql, st, rs, nome, e result não fornecem informações claras sobre seu propósito.
>    2. **Organização:** O código está organizado em uma classe única, mas a lógica poderia ser mais bem organizada com métodos separados para tarefas distintas, como a conexão com o banco de dados e a autenticação do usuário.
>    3. **Comentários:** O código não contém comentários explicativos, o que torna difícil entender o que cada parte do código está fazendo. A falta de comentários prejudica a manutenção e a compreensão do código.

> #### Todos os NullPointers foram tratados?
> 
> - No código fornecido, não há tratamento explícito para exceções do tipo **NullPointerException**. No entanto, existem potenciais pontos de falha onde essas exceções podem ocorrer, como na inicialização da conexão com o **banco de dados (Connection conn)** e na criação de objetos **Statement** e **ResultSet**. Além disso, a variável **nome** pode não ser inicializada adequadamente se ocorrerem problemas com a consulta SQL. 

> #### A arquitetura utilizada foi devidamente respeitada?
> 
> - No código em questão, não há uma arquitetura claramente definida sendo seguida. Uma arquitetura de software define a estrutura e organização dos componentes do sistema, mas no código em questão, não há uma separação clara entre esses componentes. A lógica para lidar com o banco de dados e a autenticação do usuário está misturada em um único método, o que dificulta a compreensão e manutenção do código.

> #### As coneções utilizadas foram fechadas?
>
> - Não, o código fornecido não fecha explicitamente as conexões com o banco de dados após o uso.
> - Para fechar conexões com o banco de dados, normalmente é utilizado o método `close()` em um bloco `finally`

> #### Notação de Grafo de Fluxo
> 
> - Na segunda fase desta atividade, foi conduzido um estudo sobre a notação de grafo, uma ferramenta empregada para a representação do fluxo de controle lógico. Por meio dessa abordagem, torna-se viável a criação de um grafo de fluxo que corresponda ao fluxograma de controle do programa em análise.

### Indentificação dos pontos de extração

![Pontos de Extração](img/codigo.png)

### Criação do Grafo

![Notação de Grafo](img/grafo.png)
```
E = Número de Arestas
N = Número de Nós do Grafo

E = 15
N = 13
V(G) = (E - N) + 2
V(G) = (15 - 13) + 2
V(G) = 2 + 2
V(G) = 4
COMPLEXIDADE CICLOMÁTICA = 4
```

Com o calculo da Complexidade ciclomática e a Criação do Grafo, é possível identificar os seguintes caminhos independentes:

1. `1-2-3-4-5-6-8-9-10-11-13`
2. `1-2-3-4-5-7-8-9-10-11-13`
3. `1-2-3-4-5-6-8-9-12-13`
4. `1-2-3-4-5-7-8-9-12-13`

### Última atualização - 06/10/2023
    