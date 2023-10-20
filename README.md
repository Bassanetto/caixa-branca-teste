# Teste de Caixa Branca (ETAPA 3)

## Documentação
A documentação de código é essencial para garantir que outros desenvolvedores (ou até mesmo você mesmo no futuro) possam compreender, manter e estender o código de maneira eficaz. Documentar o código é um passo crucial para esclarecer seu funcionamento e melhorar sua qualidade. A seguir, podemos abordar cada ponto em mais detalhes ou fazer qualquer outra pergunta específica que você possa ter sobre o código.


### Objetivo
O código Java fornece uma classe chamada `User` que se conecta a um banco de dados MySQL e verifica se um usuário com um login e senha específicos existe no banco de dados.

### Estrutura da Classe `User`
- A classe `User` possui métodos e variáveis de instância para realizar a tarefa mencionada.

### Métodos

#### Método `conectarBD()`
- Propósito: Estabelecer uma conexão com o banco de dados MySQL.
- Parâmetros: Nenhum.
- Retorno: Um objeto `Connection` representando a conexão com o banco de dados ou `null` em caso de falha na conexão.

#### Método `verificarUsuario(String login, String senha)`
- Propósito: Verificar a existência de um usuário no banco de dados com um login e senha específicos.
- Parâmetros:
  - `login`: String contendo o login do usuário a ser verificado.
  - `senha`: String contendo a senha do usuário a ser verificada.
- Retorno: `true` se o usuário for encontrado, caso contrário, `false`.

### Variáveis de Instância
- `nome`: String para armazenar o nome do usuário encontrado no banco de dados.
- `result`: Booleano para indicar se o usuário foi encontrado (`true`) ou não (`false`).

### Notas Importantes
- O código não trata exceções de forma adequada.
- Armazenar senhas diretamente no código não é seguro; práticas de segurança devem ser implementadas.

### Última atualização - 19/10/2023