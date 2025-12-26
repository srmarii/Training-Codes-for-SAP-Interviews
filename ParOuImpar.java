class ParOuImpar{
    public String isImparOrPar(int x){

        if(x % 2 == 0){
            return "Par";
        } else{
            return "Impar";
        }
    }

    public static void main(String[] args) {
        ParOuImpar m = new ParOuImpar();
        System.out.println(m.isImparOrPar(10));
     }
}