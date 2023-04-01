tipo_assinatura = str("")

while tipo_assinatura.upper() != "B" and tipo_assinatura.upper() != "S" and tipo_assinatura.upper() != "G" and tipo_assinatura.upper() != "P":
    tipo_assinatura = input("Selecione o time de assinatura:\n[B] - Basic | [S] - Silver | [G] - Gold | [P] - Platinum\n")

    if tipo_assinatura.upper() != "B" and tipo_assinatura.upper() != "S" and tipo_assinatura.upper() != "G" and tipo_assinatura.upper() != "P":
        print("Tipo de assinatura invalida!")

faturamento_anual = float(input("Informe o faturamento anual: R$"))

if tipo_assinatura.upper() == "B":
    valor_bonus = faturamento_anual * 0.3

elif tipo_assinatura.upper() == "S":
    valor_bonus = faturamento_anual * 0.2

elif tipo_assinatura.upper() == "G":
    valor_bonus = faturamento_anual * 0.1

else:
    valor_bonus = faturamento_anual * 0.05

print("Valor do bonus a ser pago: R${}".format(valor_bonus))



