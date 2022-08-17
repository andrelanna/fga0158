UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Aula 16 - Exercícios de revisão de Exceções e Threads


**Exercícios de fixação**

1. Seja um programa que simula um conta bancária. A conta bancária tem uma
   agencia definida no formato dddd-d , um número de conta no formato dddddd-d e
um saldo em R\$. Nos números de agência e conta, _d_ é um dígito de 0-9). Sobre
essa conta você poderá realizar transações de depósito e saque, em R\$. Toda
transação deverá ser vinculada à conta. A transação é definida pelo tipo (saque
ou depósito), uma data e um valor. 

   Toda operação (depósito ou saque) deverá ter um valor válido (transação >
R$0.00). Caso a transação viole essa regra, um objeto de exceção do tipo
`ValorTransacaoInvalidoException` deverá ser capturada e tratada. No caso de uma
tentativa de saque cujo valor é maior do que o saldo atual da conta, um objeto
de exceção do tipo `SaldoInsuficienteException` deverá ser lançado e tratado. 

   O programa deverá ainda permitir consultar o saldo e o extrato. Nesse último
caso, todas as transações realizadas na conta deverão ser listadas na tela. 

   A tela do programa deverá ter as seguintes opções: 

   ```
   1 - Depositar
   2 - Sacar
   3 - Consultar saldo
   4 - Consultar extrato
   5 - Sair
   ```
