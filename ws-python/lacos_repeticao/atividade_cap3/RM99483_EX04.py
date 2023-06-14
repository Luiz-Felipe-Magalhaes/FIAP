minutos_maquina = int(60)
valor_fatorial = int(1)

while minutos_maquina < 0 or minutos_maquina > 59:
    minutos_maquina = int(input("Informe os minutos marcados no relógio da maquina nesse momento: "))
    if minutos_maquina < 0 or minutos_maquina > 59:
        print("Valor invalido, digite um valor de 0 a 59")

for minutos in range (2, minutos_maquina + 1):
        valor_fatorial *= minutos

print("Senha para desbloqueio: LIBERDADE{}".format(valor_fatorial))

