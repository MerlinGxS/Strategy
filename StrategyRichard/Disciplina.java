public class Disciplina {
    private double P1, P2;
    private String Nome;
    String Situacao;
    private ICalcMedia CalcMedia;
    double Media;

    public Disciplina(ICalcMedia CalcMedia){
        this.CalcMedia = CalcMedia;
    }

    public void CalcularMedia() {
        double Media = CalcMedia.CalculaMedia(P1,P2);
        setMedia(Media);
        setSituacao(CalcMedia.Resultado(Media));
    }

    public double getMedia() {
        return this.Media;
    }

    public void setMedia(double Media) {
        this.Media = Media;
    }

    public double getP1() {
        return this.P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getP2() {
        return this.P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSituacao() {
        return this.Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    
}
