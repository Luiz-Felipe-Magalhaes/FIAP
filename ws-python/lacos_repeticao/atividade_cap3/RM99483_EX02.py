#Software para identificar e responder a uma turma escolar, o dia em que a maioria dos alunos prefere ter lives.
#A escolha dos alunos é feita por meio de votação, sendo escolhido o dia mais votado.

#Criação das variaveis de votação
votos_dia = int(0)
votos_maior = int(0)
dia_escolhido = ""

print("Informe o quantidade de votos para cada dia da semana: ")

#Laço de repetição e desvio condicional para que o usuario informe a quantidade de votos para cada dia da semana
for dia in range (1, 6, 1):
    if dia == 1:
        votos_dia = int(input("Votos para a segunda-feira: "))
        dia_da_semana = "segunda-feira"
    elif dia == 2:
        votos_dia = int(input("Votos para a terca-feira: "))
        dia_da_semana = "terca-feira"
    elif dia == 3:
        votos_dia = int(input("Votos para a quarta-feira: "))
        dia_da_semana = "quarta-feira"
    elif dia == 4:
        votos_dia = int(input("Votos para a quinta-feira: "))
        dia_da_semana = "quinta-feira"
    elif dia == 5:
        votos_dia = int(input("Votos para a sexta-feira: "))
        dia_da_semana = "sexta-feira"

    if votos_dia > votos_maior:
        votos_maior = votos_dia
        dia_escolhido = dia_da_semana

#Resposta final, mostrando o dia mais votado na tela
print("O dia mais votado foi: {}".format(dia_escolhido.upper()))