class TotalSalarios{
    whichIsTheTotal(json){
        const funcionarios = JSON.parse(json);

        let somaSalarios = 0;

        for(let i = 0; i < funcionarios.length; i++){
            somaSalarios += funcionarios[i].salario;
        }


        return somaSalarios;
    }
}

const json =   `[
      {"nome": "Ana", "salario": 5000.0},
      {"nome": "Carlos", "salario": 8000.0},
      {"nome": "Beatriz", "salario": 6500.0}
  ]`

let ts = new TotalSalarios();
console.log(ts.whichIsTheTotal(json));