programa {
  funcao inicio() {

    inteiro vetor[10]
    inteiro i, soma = 0
    real media

    para (i = 0; i < 10; i++) {
      escreva("Digite um numero: ")
      leia(vetor[i])
    }

    escreva("\nElementos nos indices impares:\n")
    para (i = 0; i < 10; i++) {
      se (i % 2 != 0) {
        escreva(vetor[i], " ")
      }
    }

    escreva("\n\nElementos pares:\n")
    para (i = 0; i < 10; i++) {
      se (vetor[i] % 2 == 0) {
        escreva(vetor[i], " ")
      }
    }

    para (i = 0; i < 10; i++) {
      soma = soma + vetor[i]
    }

    escreva("\n\nSoma:\n", soma)

    media = soma / 10

    escreva("\n\nMedia:\n", media)

  }
}
