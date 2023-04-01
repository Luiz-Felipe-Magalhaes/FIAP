quantidade_transacoes = int(input("Informe a quantidade de transações realizadas: "))
valor_total = float(0.0)

for transacoes in range(1, quantidade_transacoes + 1, 1):
    valor_transacao = float(input("Informe o valor da transação {}: ".format(transacoes)))
    valor_total += valor_transacao

print("O valor medio das transações foi de: R${}".format(valor_total/quantidade_transacoes))
print("O valor total das transações foi de: R${}".format(valor_total))
