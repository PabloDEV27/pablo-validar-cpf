import static java.lang.IO.*; // Permite usar readln() e println() direto

void main() {

    println("Digite o CPF (somente números): "); // Mostra mensagem
    String cpf = readln(); // Lê o CPF digitado

    // Verifica se tem 11 caracteres
    if (cpf.length() != 11) {
        println("CPF inválido!");
        return; // Encerra o programa
    }

    int i = 0;

    // Verifica se todos os caracteres são números
    while (i < 11) {
        char digito = cpf.charAt(i); // Pega o caractere na posição i

        // Se não estiver entre '0' e '9', não é número
        if (digito < '0' || digito > '9') {
            println("Digite apenas números!");
            return;
        }
        i++;
    }

    // Verifica se todos os números são iguais (ex: 11111111111)
    if (cpf.charAt(0) == cpf.charAt(1) &&
            cpf.charAt(1) == cpf.charAt(2) &&
            cpf.charAt(2) == cpf.charAt(3) &&
            cpf.charAt(3) == cpf.charAt(4) &&
            cpf.charAt(4) == cpf.charAt(5) &&
            cpf.charAt(5) == cpf.charAt(6) &&
            cpf.charAt(6) == cpf.charAt(7) &&
            cpf.charAt(7) == cpf.charAt(8) &&
            cpf.charAt(8) == cpf.charAt(9) &&
            cpf.charAt(9) == cpf.charAt(10)) {

        println("CPF inválido!");
        return;
    }

    int soma = 0; // Variável para somar valores
    i = 0;

    // Calcula o 1º dígito verificador
    while (i < 9) {
        int digito = cpf.charAt(i) - '0'; // Converte de caractere para número
        soma = soma + digito * (10 - i); // Multiplica pelo peso e soma
        i++;
    }

    int d1 = (soma * 10) % 11; // Calcula o dígito
    if (d1 == 10) {
        d1 = 0; // Regra do CPF
    }

    soma = 0; // Zera a soma
    i = 0;

    // Calcula o 2º dígito verificador
    while (i < 10) {
        int digito = cpf.charAt(i) - '0';
        soma = soma + digito * (11 - i);
        i++;
    }

    int d2 = (soma * 10) % 11;
    if (d2 == 10) {
        d2 = 0;
    }

    // Pega os dígitos finais do CPF digitado
    int digito1 = cpf.charAt(9) - '0';
    int digito2 = cpf.charAt(10) - '0';

    // Compara os calculados com os digitados
    if (d1 == digito1 && d2 == digito2) {
        println("CPF válido!");
    } else {
        println("CPF inválido!");
    }
}