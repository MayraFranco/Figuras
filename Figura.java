public class Figura
{
   protected float area;
    public Figura()
    {
        area = 0;
    }
    public void calcularArea()
    {
        System.out.println("No sé calcular el area...");
    }
    public void imprimirArea()
    {
        System.out.println("El valor del area es: " + area);
    }
}