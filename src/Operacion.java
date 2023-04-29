public class Operacion {
    Mostrar mostrar=new Mostrar();
    int x1,x2;
    public void operacion(int a,int b,int c){
        x1= (int) (-b-Math.sqrt(b*b-4*a*c))/2*a;
        x2=(int) (-b+Math.sqrt(b*b-4*a*c))/2*a;
        mostrar.mostrar(x1,x2);
    }
}
