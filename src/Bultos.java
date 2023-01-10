public class Bultos {

    private int id;
    private int volumen;
    private int peso;
    private boolean esFragil;


    public Bultos() {
        id = 0;
        volumen = 0;
        peso = 0;
        esFragil = false;
    }

    public void setId(int newId) {

        id = newId;
    }

    public void setVolumen(int newVolumen) {

        volumen = newVolumen;
    }

    public void setPeso(int newPeso) {

        peso = newPeso;
    }

    public void setEsFragil() {

        esFragil = true;
    }

}
