public class Geometrica implements ICalcMedia {
    
    @Override
    public double CalculaMedia(double a, double b){
        return Math.sqrt(a*b);
    }

    @Override
    public String Resultado(double a){
        if(a>=7){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }

    }
}
