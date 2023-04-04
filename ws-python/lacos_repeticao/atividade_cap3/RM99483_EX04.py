#Software que recebe do usuario os minutos mostrados na maquina dele, e retorna o calculo fatorial daquele valor. O valor calculado sera utilizado para compor uma senha.

#Criação e entrada das variaveis
valor_fatorial = int(1)
minutos_maquina = int(input("Informe os minutos marcados no relógio da maquina nesse momento: "))

#Laço de repetição para validar se o valor de minutos inseridos pelo usuario é valido
while minutos_maquina < 0 or minutos_maquina > 59:
    minutos_maquina = int(input("\nValor invalido, informe um valor de 0 a 59.\nInforme os minutos marcados no relógio da maquina nesse momento: "))

#Laço de repetição que faz o calculo fatorial
for minutos in range (2, minutos_maquina + 1):
    valor_fatorial *= minutos

#Resposta final, mostrando para o usuario a senha, a partir da concatenação da palavra "LIBERDADE" e o valor calculado.
print("\nSenha para desbloqueio: LIBERDADE{}".format(valor_fatorial))

