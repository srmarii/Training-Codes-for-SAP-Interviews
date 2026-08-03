//PRA RODAR
// node <nomeDoArquivo> 
// é preciso ja estar nele, se não precisa fornecer a path

class MaiorSalario {

    //JS é dinamicamente tipado, então o interpretador 
    //descobre o tipo do retorno em tempo de execução. 
    // O return { nomeMaior, maiorSalario } já é suficiente.
    maiorSalario(json) {

        // Sem o parse, json é só texto — você não 
        //consegue acessar funcionarios[i].salario 
        // porque JS não sabe que aquele texto representa 
        //uma estrutura de dados.
        const funcionarios = JSON.parse(json);

        let nomeMaior = "";
        let maiorSalario = 0;

        for (let i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].salario > maiorSalario) {
                maiorSalario = funcionarios[i].salario;
                nomeMaior = funcionarios[i].nome;
            }
        }

        return { nomeMaior, maiorSalario };
    }
}

//const — valor não será reatribuído
//let — valor pode mudar (como nomeMaior e maiorSalario dentro do loop)

// com crase — múltiplas linhas, limpo e legível
// com aspas simples — teria que concatenar tudo numa linha só
// const json = '[{"nome": "Ana", "salario": 5000.0},{"nome": "Carlos", "salario": 8000.0}]';
const json = `[
    {"nome": "Ana", "salario": 5000.0},
    {"nome": "Carlos", "salario": 8000.0},
    {"nome": "Beatriz", "salario": 6500.0}
]`;

// Em js nao tem tipo, por isso é assim e não MaiorSalario ms = new MaiorSalario();
const ms = new MaiorSalario();

const resultado = ms.maiorSalario(json);
console.log("Funcionário: " + resultado.nomeMaior);
console.log("Salário: " + resultado.maiorSalario);
