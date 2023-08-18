public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary){
        //adding parameters to its fields
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add (ComplexNumber c){
        //adding complex number parameter to its corresponding fields
        this.real += c.real;
        this.imaginary += c.imaginary;

    }




    public void subtract (double real, double imaginary){
        //subtracting parameters from its fields
        this.real-= real;
        this.imaginary-= imaginary;
    }


    public void subtract (ComplexNumber c){
        //subtracting complex number parameter from its corresponding fields
        this.real -= c.real;
        this.imaginary -= c.imaginary;
    }


}
