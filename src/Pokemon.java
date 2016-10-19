public class Pokemon implements Capturable {
    private String nombre;
    private int ataque;
    private int defensa;
    private int ps;

    public Pokemon(String nombre, int ataque, int defensa, int ps) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ps = ps;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getAtaque() {return ataque;}

    public void setAtaque(int ataque) {this.ataque = ataque;}

    public int getDefensa() {return defensa;}

    public void setDefensa(int defensa) {this.defensa = defensa;}

    public int getPs() {return ps;}

    public void setPs(int ps) {this.ps = ps;}

    @Override
    public String toString() {
        return "Pokemon{" +
                "Nombre='" + nombre + '\'' +
                ", Ataque=" + ataque +
                ", Defensa=" + defensa +
                ", PS=" + ps +
                '}';
    }

    @Override
    public boolean capturar() {
        return false;
    }
}
