minutos_maquina = int(input("Informe os minutos marcados no relógio da maquina nesse momento: "))
valor_fatorial = int(1)

for minutos in range (2, minutos_maquina + 1):
    valor_fatorial *= minutos

print("Senha para desbloqueio: LIBERDADE{}".format(valor_fatorial))

