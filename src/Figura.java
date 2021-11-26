public class Figura {
    protected float base, altura, x1, x2, y1, y2;

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    public abstract float CalcArea();
    public abstract  float CalcPerimetro();

}
    public class Retangulo extends Figura{

        public Retangulo() {
            this.base=0;
            this.altura=0;
        }

        public Retangulo(float x1, float x2, float y1, float y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.base = x2 - x1;
            this.altura = y2 - y1;
        }

        public float CalcArea(){
            float area=getBase()*getAltura();
            return area;
        }

        public float CalcPerimetro() {
            float per=(2*getBase())+(2*getAltura());
            return per;
        }
    }
    public class Quadrado extends Retangulo{

        public Quadrado() {
            this.base=0;
            this.altura=0;
        }

        public Quadrado(float x1, float x2 , float y1, float y2) {
            super(x1, x2, y1, y2);
        }



    }





