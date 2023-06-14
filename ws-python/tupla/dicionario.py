#criando um dicionário com dados
dicionario = {
    "Yoda":"Mestre Jedi",
    "Mace Windu":"Mestre Jedi",
    "Anakin Skywalker":"Cavaleiro Jedi",
    "R2-D2":"Dróide",
    "Dex":"Balconista"
}

#exibindo o valor associado a uma chave específica
print(dicionario["R2-D2"])

#exibindo todos os valores em um dicionário
for valor in dicionario.values():
    print(valor)

#exibindo todas as chaves em um dicionário
for chave in dicionario.keys():
    print(chave)

#exibindo o dicionário completo
for chave, valor in dicionario.items():
    print("O personagem {} é da categoria {}".format(chave, valor))

#criando um dicionário vazio
dicionario2 = {}
#incluindo dados no dicionário
dicionario2["André David"] = "Professor"
#Pedindo para o usuário incluir dados no dicionário
nova_chave = input("Informe o nome do colaborador da FIAP")
novo_valor = input("Informe a função do colaborador da FIAP")
dicionario2[nova_chave] = novo_valor
#exibindo o dicionário completo
for chave, valor in dicionario2.items():
    print("O colaborador {} desempenha a função de {}".format(chave, valor))

#alterando dados no dicionário
dicionario2["André David"] = "Coordenador"
#exibindo o dicionário completo
for chave, valor in dicionario2.items():
    print("O colaborador {} desempenha a função de {}".format(chave, valor))

#criando um dicionário com dados
dicionario3 = {"Yoda":"Mestre Jedi", "Mace Windu": "Mestre Jedi", "Anakin Skywalker":"Cavaleiro Jedi", "R2-D2":"Dróide", "Dex":"Balconista"}
#exibindo o dicionário completo
for chave, valor in dicionario3.items():
    print("O personagem {} é da categoria {}".format(chave, valor))
#removendo o item cuja chave é R2-D2
dicionario3.pop("R2-D2")
#exibindo o dicionário completo após a remoção
for chave, valor in dicionario3.items():
    print("O personagem {} é da categoria {}".format(chave, valor))

#removendo o último item
dicionario3.popitem()
#exibindo o dicionário completo após a remoção
for chave, valor in dicionario3.items():
    print("O personagem {} é da categoria {}".format(chave, valor))

#removendo todos os itens do dicionário
dicionario3.clear()
#exibindo o dicionário completo após a remoção
for chave, valor in dicionario3.items():
    print("O personagem {} é da categoria {}".format(chave, valor))