peso_total = float(0.0)

for x in range(0,10,1):
    peso_caixa = float(input("Informe o peso da caixa em Kg: "))
    peso_total += peso_caixa

media_peso = peso_total/(x+1)
print("Peso medio = {}Kg".format(media_peso))
print("Peso total = {}Kg".format(peso_total))
