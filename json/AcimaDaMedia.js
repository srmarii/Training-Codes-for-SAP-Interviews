class AcimaDaMedia {
    quemEstaAcimaDaMedia(json){
        const funcionarios = JSON.parse(json);
        let somaSalarios = 0, mediaSalarial, qtdFuncionarios = funcionarios.length, lista = [];

        for(let i = 0; i<qtdFuncionarios; i++){
            somaSalarios += funcionarios[i].salario;
        }

        mediaSalarial = somaSalarios / qtdFuncionarios;

        for(let i = 0; i<qtdFuncionarios; i++){
            if(funcionarios[i].salario >= mediaSalarial){
                lista.push(funcionarios[i].nome)
            }
        }

        return lista;
    }
}

const json =   `[
      {"nome": "Ana", "salario": 5000.0},
      {"nome": "Carlos", "salario": 8000.0},
      {"nome": "Beatriz", "salario": 6500.0}
  ]`

let am = new AcimaDaMedia();
console.log(am.quemEstaAcimaDaMedia(json));