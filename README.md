# Controle-de-Locacao-de-imoveis-JAVA
Controle de locação
1 – Cadastrar dados dos imóveis (2.5 – inclusive com herança)
2 – Realizar locação do imóvel (2.0)
3 – Devolução imóvel (2.0)
4 – Gerar relatório dos imóveis disponíveis e alugados (2.0)
5 – Sair (inclusive classe com os métodos) (1.5)

Alguns dados dos imóveis estão listados abaixo (apenas um exemplo) e consistem no código do imóvel, tipo (residencial, comercial ou galpão), o valor base do aluguel, o bairro onde se localiza e a status (a- alugado ou d – disponível):

Código	Tipo		Aluguel_Base		Bairro		Status
110		residencial	400,00			Azul		 a
112		galpão		800,00			Verde		 a
130		residencial	600,00			Vermelho	 d
114		residencial	300,00			Azul		 a

Na opção 1, armazene os dados em um ArrayList e exiba em forma de tabela. Obs:  o código do imóvel não pode ser repetido.

Na opção 2, solicite que o usuário digite o código do imóvel desejado (se não existir o código mostrar uma msg “código inexistente”. Se o imóvel estiver ocupado (status “d”, exiba a mensagem “Imóvel indisponível”. Se o imóvel escolhido estiver livre, altere o seu status para 'a' (alugado) e calcule o valor final do aluguel. O aluguel final é o aluguel base mais um percentual que depende do tipo de imóvel, da seguinte forma:

•	para imóveis residenciais, o percentual de acréscimo é 5%;
•	para galpões é 10% e
•	para comerciais é 15%.

A seguir, escreva a mensagem “ Locação feita com sucesso” e escreva o código do imóvel e o valor final do aluguel. Se o usuário digitar um código inválido, solicite que ele digite outro código até que ele digite um válido.

Na opção 3, solicite que o usuário digite o código do imóvel desejado (se não existir o código mostrar uma msg “código inexistente”. Mude o status do imóvel para “disponível”.

Na opção 4, liste os imóveis disponíveis, mostrando o tipo do imóvel, o bairro e o valor do seu aluguel base. E também liste os imóveis ocupados, mostrando o tipo do imóvel, o bairro, o valor do seu aluguel base e o valor final do aluguel.

CRIAR UMA CLASSE MÃE(SUPER-CLASSE) – IMÓVEL (código do imóvel, tipo (residencial, comercial ou galpão), o valor base do aluguel)
CRIAR UMA CLASSE FILHA (SUB-CLASSE) – TIPO_IMÓVEL (o bairro onde se localiza e o status (situação do imóvel – ocupado ou disponível) )

OBS:  Criar uma classe com os métodos necessários para a execução dos dados (salvar, consultar, etc.)
