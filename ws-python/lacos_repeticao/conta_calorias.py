quantidade_alimentos = int(input("Informe a quantidade de alimentos consumidos no dia: "))
calorias_total = int(0)

for alimento in range(1, quantidade_alimentos + 1, 1):
    calorias_alimento = int(input("Informe o numero de calorias do alimento {}: ".format(alimento)))
    calorias_total += calorias_alimento
print("A quantidade total de calorias consumidas foi de: {}".format(calorias_total))