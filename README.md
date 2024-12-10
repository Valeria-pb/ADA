
# ADA
## Coding Tank / Desenvolva+
Repositório para o resumo de estudos do Programa Desenvolva + e Meli.

### Paradigmas de programação
Paradigmas de programação são estilos ou formas de estruturar a programação, que determinam como você resolve problemas usando uma linguagem de programação. Eles não são a mesma coisa que linguagens de programação, mas sim maneiras diferentes de programar.

Aqui estão alguns dos paradigmas de programação mais comuns:

1. **Paradigma Imperativo**: Também conhecido como procedural, neste paradigma o programador escreve uma lista de instruções, um passo-a-passo do que deve ser executado pela máquina.

2. **Paradigma Funcional**: Baseia-se na execução de uma série de funções, ou seja, blocos de código que realizam tarefas específicas.

3. **Paradigma Lógico**: Utiliza avaliações lógico-matemáticas como padrões de entrada e saída.

4. **Paradigma Orientado a Objetos**: Aproxima a programação do mundo real, trazendo objetos que podem representar algo do nosso mundo real e categorizados em tipos.

Compreender esses paradigmas ajuda a identificar qual deles se adapta melhor à solução que você deseja desenvolver.
### Introdução oa Java
Java é uma linguagem de programação orientada a objetos criada pela Sun Microsystems em 1995 e posteriormente adquirida pela Oracle. Mantida pela Java Community Process (JCP), a linguagem evolui através de Java Specification Requests (JSR).

O grande diferencial do Java é seu suporte multiplataforma, resumido no slogan "Write once, run everywhere". Isso significa que um código Java é compilado em bytecode, que pode ser executado em qualquer sistema operacional que tenha uma Java Virtual Machine (JVM).

Para desenvolver em Java, você precisa do Java Development Kit (JDK), que inclui ferramentas como bibliotecas, JVM e o compilador. Para executar programas Java, é necessário o Java Runtime Environment (JRE), que fornece as bibliotecas de classe e a JVM.

A configuração do ambiente Java envolve baixar a JDK, configurar a variável de ambiente $JAVA_HOME e adicionar a pasta $JAVA_HOME/bin ao $Path. Também é recomendável usar uma IDE como o IntelliJ Idea Community.

Com essas ferramentas e configurações, você está pronto para começar a desenvolver aplicações em Java.
- [Documentação do JAVA SE](https://www.oracle.com/java/technologies/javase-documentation.html)
- [Download JDK](https://www.oracle.com/java/technologies/downloads/)
- [Configuração da variável de ambiente](https://www.java.com/pt-BR/download/help/path_pt-br.html)
- [Download IntelliJ](https://www.jetbrains.com/pt-br/idea/download/)
- [Java - história e conceitos](https://www.devmedia.com.br/java-historia-e-principais-conceitos/25178)
- [Java SE - documentação](https://www.oracle.com/java/technologies/javase-documentation.html)

## Variáveis e Tipos
Java é uma linguagem fortemente tipada, o que significa que cada variável deve ter um tipo associado, definindo os valores que podem ser armazenados. Existem oito tipos primitivos: quatro para números inteiros, dois para números de ponto flutuante, um para caracteres (Unicode) e um para valores lógicos (verdadeiro ou falso).

### Tipos Primitivos
- **Inteiros**: `byte`, `short`, `int`, `long`
- **Ponto Flutuante**: `float`, `double`
- **Caractere**: `char`
- **Lógico**: `boolean`

### Variáveis
Variáveis armazenam valores e são declaradas com um tipo seguido pelo nome. Exemplo:

int age = 22;

Se não inicializadas, recebem valores padrão.

### Strings
Strings são sequências de caracteres imutáveis, declaradas entre aspas duplas:

String s = "this is a string";


### Constantes
Constantes são valores fixos e imutáveis, declaradas com o modificador `final`:

final int QUANTIDADE_TENTATIVAS = 3;


### Enums
Enums representam valores finitos, como dias da semana:

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


## Operadores e Precedência em Java

Assim como temos os operadores matemáticos da aritmética, álgebra, trigonometria, cálculo etc., o Java define símbolos especiais para realizar operações com nossas variáveis. Esses operadores podem tomar um, dois ou três termos e agir sobre eles.

## Tipos de Operadores

### Aritméticos
- Soma (`+`)
- Subtração (`-`)
- Multiplicação (`*`)
- Divisão (`/`)

### Lógicos
- Negação (`!`)
- E (`&&`)
- OU (`||`)

### Relacionais
- Maior que (`>`)
- Menor que (`<`)
- Igual (`==`)
- Diferente (`!=`)

### Ternário
- Condicional (`? :`)

## Operadores Unários
Existem variações desses operadores que encurtam as expressões. Por exemplo:

int contador = 0;
contador = contador + 1; // outras formas : contador++ ou ++contador
## Operador Mod
Um operador aritmético especial é o mod (%), que informa o "resto da divisão".
int resultado = 3 % 2; // resultado = 1

# Precedência de Operadores em Java

Assim como na Matemática, usamos vários operadores em uma mesma expressão. Para que o resultado não nos surpreenda, precisamos conhecer a precedência dos operadores.

| Operadores     | Precedência          |
|----------------|----------------------|
| postfix        | `exp++` `exp--`      |
| unary          | `++exp` `--exp` `+exp` `-exp` `~` `!` |
| multiplicative | `*` `/` `%`          |
| additive       | `+` `-`              |
| relational     | `<` `>` `<=` `>=`    |
| equality       | `==` `!=`            |
| logical AND    | `&&`                 |
| logical OR     | ||                 |
| ternary        | `? :`                |
| assignment     | `=` `+=` `-=` `*=` `/=` `%=` |

# Definindo o tamanho dos métodos
### Pequenas
"A primeira regra para funções é que elas devem ser pequenas. A segunda é que devem ser ainda menores." (Robert C. Martin)

Não existe um estudo que comprove a eficiência de métodos pequenos, que eles sejam mais rápidos ou melhores, ou que gerem menos erros. O fato é que ao restringir ao máximo sua responsabilidade, o código fica mais coeso e, por consequência, mais legível.

# Estruturas de Controle de Fluxo em Java

Em Java, temos blocos especiais que controlam o fluxo de execução do nosso programa. Esses blocos podem ser executados de acordo com uma condição definida (if-then, if-then-else, switch) ou repetidamente (for, while, do-while).

## Estruturas Condicionais

### if-then
A estrutura mais simples é o bloco `if-then`. O conteúdo deste bloco será executado apenas quando a condição definida for `true`.

```java
void applyBrakes() {
    if (isMoving) { 
        currentSpeed--;
    }
}
### if-then-else
Para tratar o caso contrário, usamos a palavra-chave ```else.
void applyBrakes() {
    if (isMoving) {
        currentSpeed--;
    } else {
        System.err.println("The bicycle has already stopped!");
    }
}
### if-then-else encadeado
Estruturas if-then-else podem ser encadeadas usando else if.
class IfElseDemo {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}

### switch
A estrutura switch é usada quando desejamos realizar determinado comportamento de acordo com o valor contido em uma variável.
public class SwitchDemo {
    public static void main(String[] args) {
        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January"; break;
            case 2:  monthString = "February"; break;
            case 3:  monthString = "March"; break;
            case 4:  monthString = "April"; break;
            case 5:  monthString = "May"; break;
            case 6:  monthString = "June"; break;
            case 7:  monthString = "July"; break;
            case 8:  monthString = "August"; break;
            case 9:  monthString = "September"; break;
            case 10: monthString = "October"; break;
            case 11: monthString = "November"; break;
            case 12: monthString = "December"; break;
            default: monthString = "Invalid month"; break;
        }
        System.out.println(monthString);
    }
}

A estrutura switch permite variáveis dos tipos primitivos byte, short, char e int, além de Enum e String.

### switch com múltiplos casos
Para cenários onde temos a mesma resposta para mais de uma entrada, usamos múltiplos casos.
class SwitchDemo2 {
    public static void main(String[] args) {
        int month = 2;
        int year = 2000;
        int numDays = 0;
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0)) // checking for leap year
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numDays);
    }
}





