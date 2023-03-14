package OOP.seminar_2;

public class Rectangle implements Interface{

    protected Double a;
    protected Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    

    
    @Override
    public Double Perimetr_Calculating() {

        Double P = 2 * (a + b);
        return P;

    }

    @Override
    public Double Area_Calculating() {
        Double S = a * b;
        return S;

    }
    
    public class SquareF extends Rectangle{
        public SquareF(Double a){
            super(a, a);
        }
        public SquareF(){
            this(2.0);
        }
    }

    @Override
    public String toString() {
        return "Прямоугольник";
    }
}
