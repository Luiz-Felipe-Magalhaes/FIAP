tipo_cliente = str(input("[V] VIP | [G] Gold | [P] Popular\nSelecione o tipo de cliente: "))
peso_bagagem = float(input("Informe o peso da bagagem em Kg: "))

if peso_bagagem <= 10:
    print("Peso dentro do permitido")
elif 10 < peso_bagagem <= 20:
    if tipo_cliente == "V" or tipo_cliente == "G":
        print("Peso dentro do permitido")
    else:
        print("Peso acima do permitido")
elif 20 < peso_bagagem <= 30:
    if tipo_cliente == "V":
        print("Peso dentro do permitido")
    else:
        print("Peso acima do permitido")
else:
    print("Peso acima do permitido")




