
class Persona
{
    private int edad;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void cumplirAnios()
    {
        edad++;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }
}
public class Main {
    public static void main(String[] args){
        Persona Sam = new Persona();
        Persona Adair = new Persona();
        int i;
        Sam.setName("Sam");
        Adair.setName("Adair");

        for(i=0;i<2;i++)
            Adair.cumplirAnios();

        for(i=0;i<4;i++)
            Sam.cumplirAnios();

        System.out.println(Sam.getName() + " tiene " + Sam.getEdad() + " años");
        System.out.println(Adair.getName() + " tiene " + Adair.getEdad() + " años");
    }
}
