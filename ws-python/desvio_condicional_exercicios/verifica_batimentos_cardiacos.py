batimentos_por_minuto = int(input("Informe o numero de batimentos por minuto: "))
idade = int(input("Informe a idade: "))

if idade <= 2:
    if 120 <= batimentos_por_minuto <= 140:
        print("Batimentos por minuto DENTRO da faixa adequada para a idade")
    elif batimentos_por_minuto < 120:
        print("Batimentos por minuto ABAIXO da faixa adequada para a idade")
    elif batimentos_por_minuto > 140:
        print("Batimentos por minuto ACIMA da faixa adequada para a idade")
elif 8 <= idade <= 17:
    if 80 <= batimentos_por_minuto <= 100:
        print("Batimentos por minuto DENTRO da faixa adequada para a idade")
    elif batimentos_por_minuto < 80:
        print("Batimentos por minuto ABAIXO da faixa adequada para a idade")
    elif batimentos_por_minuto > 100:
        print("Batimentos por minuto ACIMA da faixa adequada para a idade")
elif 18 <= idade < 60:
    if 70 <= batimentos_por_minuto <= 80:
        print("Batimentos por minuto DENTRO da faixa adequada para a idade")
    elif batimentos_por_minuto < 70:
        print("Batimentos por minuto ABAIXO da faixa adequada para a idade")
    elif batimentos_por_minuto > 80:
        print("Batimentos por minuto ACIMA da faixa adequada para a idade")
elif idade >= 60:
    if 50 <= batimentos_por_minuto <= 60:
        print("Batimentos por minuto DENTRO da faixa adequada para a idade")
    elif batimentos_por_minuto < 50:
        print("Batimentos por minuto ABAIXO da faixa adequada para a idade")
    elif batimentos_por_minuto > 60:
        print("Batimentos por minuto ACIMA da faixa adequada para a idade")
