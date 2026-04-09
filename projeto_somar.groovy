programa {

  funcao inicio() {

    inteiro cat[10] = {2,5,1,3,4,9,7,8,10,6}
    inteiro i, j, aux

    para (i = 0; i < 10; i++) {
      para (j = 0; j < 10; j++) {

        se (cat[i] > cat[j]) {
          aux = cat[i]
          cat[i] = cat[j]
          cat[j] = aux
        }

      }
    }

    para (i = 0; i < 10; i++) {
      escreva(cat[i], "\n")
    }

  }
}

// Código em Portugol responsável por calcular a soma de 10 números inteiros (pares e ímpares)