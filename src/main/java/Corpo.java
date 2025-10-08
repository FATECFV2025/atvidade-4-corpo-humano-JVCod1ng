public class Corpo {

    private float massa;    
    private float volume;   
    private float densidade;
    private float altura;   

    public Corpo(float massa, float volume, float densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public float getMassa() {
        return this.massa;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getDensidade() {
        return this.densidade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setMassa(float massa) {
        this.massa = massa;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }
    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularIMC() {
        if (this.altura <= 0) {
            return 0;
        }
        return this.massa / (this.altura * this.altura);
    }
}
