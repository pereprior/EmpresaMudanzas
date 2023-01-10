public class Camiones {

    private int matricula;
    private double volumen; //metros cubicos
    private double peso; //toneladas


    public Camiones() {
        //matricula = Math.random();
        volumen = 20;
        peso = 18;
    }

    public void setId(int newId) {

        matricula = newId;
    }

    public void setVolumen(int newVolumen) {

        volumen = newVolumen;
    }

    public void setPeso(int newPeso) {

        peso = newPeso;
    }

}
