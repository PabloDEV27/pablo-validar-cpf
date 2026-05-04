Validador de CPF usando Java

Objetivo: Praticar lógica de programação usando linguagem Java em um projeto como teste.

Etapas que o programa segue:
Entrada de dados
- O usuário digita um CPF com 11 números (sem pontos ou traços)

Validações iniciais
- Verifica se o CPF tem exatamente 11 dígitos

Verifica se todos os caracteres são numéricos
- Rejeita CPFs com todos os números iguais (ex: 11111111111)

Cálculo dos dígitos verificadores
- Calcula o primeiro dígito verificador usando pesos decrescentes de 10 a 2

Calcula o segundo dígito verificador usando pesos de 11 a 2
- Utiliza o operador % (módulo) para obter o resto da divisão

Validação final
- Compara os dígitos calculados com os dois últimos dígitos do CPF informado
