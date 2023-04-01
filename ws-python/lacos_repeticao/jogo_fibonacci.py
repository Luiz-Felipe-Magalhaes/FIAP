numero = int(input("Informe um numero: "))
ultimo_valor = int(1)
penultimo_valor = int(0)
soma_fibonacci = int(1)

for x in range(0,numero):
    soma_fibonacci = ultimo_valor + penultimo_valor
    penultimo_valor = ultimo_valor
    ultimo_valor = soma_fibonacci

    if numero == soma_fibonacci:
        print("Ação bem-sucedida!")
        break
else:
    print("A ação falhou!")










