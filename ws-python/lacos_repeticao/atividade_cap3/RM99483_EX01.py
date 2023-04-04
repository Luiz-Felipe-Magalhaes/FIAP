#Software que faz o calculo de um bonus a ser pago para uma empresa. O calculo é feito baseado no faturamento e no plano de assinatura dos clientes dessa empresa,
#onde para cada plano assinado, o cliente deve pagar uma porcentagem diferente do seu faturamento é pago como bonus a empresa.

#Criação da variavel tipo_assinatura
tipo_assinatura = str("")

#Laço de repetição para o usuario selecionar o tipo de assinatura
while tipo_assinatura.upper() != "B" and tipo_assinatura.upper() != "S" and tipo_assinatura.upper() != "G" and tipo_assinatura.upper() != "P":
    tipo_assinatura = input("Selecione o time de assinatura:\n[B] - Basic | [S] - Silver | [G] - Gold | [P] - Platinum\n")

    #Condição que verifica se o usuario escolheu uma assinatura valida
    if tipo_assinatura.upper() != "B" and tipo_assinatura.upper() != "S" and tipo_assinatura.upper() != "G" and tipo_assinatura.upper() != "P":
        print("Tipo de assinatura invalida!")

#Criação e entrada de dados na variavel faturamento_anual
faturamento_anual = float(input("Informe o faturamento anual: R$"))

#Desvio condicional para calcular o valor do bonus de acordo com o plano selecionado pelo usuario
if tipo_assinatura.upper() == "B":
    valor_bonus = faturamento_anual * 0.3

elif tipo_assinatura.upper() == "S":
    valor_bonus = faturamento_anual * 0.2

elif tipo_assinatura.upper() == "G":
    valor_bonus = faturamento_anual * 0.1

else:
    valor_bonus = faturamento_anual * 0.05

#Resposta final, em tela, com o valor a ser pago de acordo com os dados de faturamento e plano fornecidos pelo usuario
print("Valor do bonus a ser pago: R${}".format(valor_bonus))



