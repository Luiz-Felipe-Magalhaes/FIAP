valor_compra = float(input("Digite o valor da compra: "))
cupom_desconto = input("Digite o cupom de desconto: ")

if cupom_desconto.upper() == "NIVER10":
    valor_compra = valor_compra * 0.9
else:
    print("Cupom invalido")

print("Valor da compra R${}".format(valor_compra))
