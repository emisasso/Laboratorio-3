package Punto2;

public class Staff extends Persona{
    private Integer remuneration;
    private String turno;//(mañana o noche)

    public Staff() {
    }

    public Staff(String dni, String name, String surname, String email, String adress) {
        super(dni, name, surname, email, adress);
    }

    public Staff(String dni, String name, String surname, String email, String adress, Integer remuneration, String turno) {
        super(dni, name, surname, email, adress);
        this.remuneration = remuneration;
        this.turno = turno;
    }

    public Integer getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(Integer remuneration) {
        this.remuneration = remuneration;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double salarioAnual(){
        return (this.remuneration*12);
    }


}
