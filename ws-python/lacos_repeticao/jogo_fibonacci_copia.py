numero = int(input("Digite um número inteiro: "))

penultimo_valor = 1
ultimo_valor = 1

while ultimo_valor < numero:
    proximo_valor = ultimo_valor + penultimo_valor
    penultimo_valor = ultimo_valor
    ultimo_valor = proximo_valor
if ultimo_valor == numero:
    print("Ação bem-sucedida!")
else:
    print("A ação falhou.")









