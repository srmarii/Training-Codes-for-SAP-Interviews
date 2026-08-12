class QuantosFuncionarios{
    quantosFuncHa(json){
        let funcionarios = JSON.parse(json);
        let ocorrencia = {};

        for(let i = 0; i<funcionarios.length; i++){
            if(ocorrencia[funcionarios[i].departamento] == undefined){
                ocorrencia[funcionarios[i].departamento] = 0;
            }
            ocorrencia[funcionarios[i].departamento] += 1; // ou ++
        }


        return ocorrencia;
    }



}

const json = `
[
    {"nome": "Ana", "departamento": "TI"},
    {"nome": "Carlos", "departamento": "RH"},
    {"nome": "Beatriz", "departamento": "TI"},
    {"nome": "Diego", "departamento": "Financeiro"},
    {"nome": "Elena", "departamento": "RH"}
]
`

let qf = new QuantosFuncionarios();
console.log(qf.quantosFuncHa(json));