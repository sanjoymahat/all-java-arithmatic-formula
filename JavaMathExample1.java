

public class JavaMathExample1 {
    public static void main(String[]args)
    {
        double x=28;
        double y=8;
        double z=Math.toRadians(x);
        double a=70.72;
        double b=729;
        double c=-68;
        double d=(Math.PI)/2;
        //relation operators
        System.out.println("x==y=:"+(x==y));
         //javas arithmatic operators x+y=36
         System.out.println("x+y=:"+(x+y));
         //java arithmatic operators
         System.out.println("x-y=:"+(x-y));
         //java arithmatic operators
         System.out.println("x*y=:"+(x*y));
         //java arithmatic operators
         System.out.println("x/y=:"+(x/y));
        //return  measured in radians to an approximatly equivalent angle measured in degrees
        System.out.println(" d valu convert to degrees is"+Math.toDegrees(d));
         //x value cube root of a number 4*4*4*4
         System.out.println("x value cube root:"+Math.cbrt(b));
        //return the maximum of tow number
        System.out.println("maximum number of x and y is:"+Math.max(x,y));
        //return the minimum of two number
        System.out.println(" the minimum number of x and y is:"+Math.min(x,y));
        //return the squar root of y is
        System.out.println(" the square root of y is:"+Math.sqrt(y));
        // return 28 power of 4 i.e 28*28*28*28*28
        System.out.println("power of x and y is:"+Math.pow(x,y));
        //retun the logarithm of given value
        System.out.println("Logarithm of x is:"+Math.log(x));
        System.out.println("Logarithm of y is:"+Math.log(y));
        //return the logarithm of given value when base is 10
        System.out.println(" log10 of is:"+Math.log10(x));
        System.out.println("log10 of is:"+Math.log10(y));
        //return the log of x+1
        System.out.println("log1p of x is:"+Math.log1p(x));
        //return a power of 2
        System.out.println("exp of x is:"+Math.exp(x));
        //return ( a power of 2)-1
        System.out.println("expm1 of x is:"+Math.expm1(x));
        //return the trigonometric sine of x
        System.out.println("sine value of x is:"+Math.sin(x));
        //reture the trigonometric cosine value of x
        System.out.println(" cosine value of x is:"+Math.cos(x));
        //return tringonomatric tangent value of x
        System.out.println("tangent value of x is:"+Math.tan(x));
        //return hyperbolic sine of x
        System.out.println(" sine value of x:"+Math.sinh(x));
        //return hyperbolic cose of x
        System.out.println("cose value of x:"+Math.cosh(x));
        //return the hyperbolic tangent value of x
        System.out.println(" tangent value of x"+Math.tanh(x));
        //find the closest int for the double
        System.out.println(" a integer around value is:"+Math.round(a));
        // a value smallest integer value that mathematic integer
        System.out.println(" a ceil value is:"+Math.ceil(a));
        // a argument allows return scond c argument
        System.out.println(" a argument return c argument:"+Math.copySign(a,c));
       
       




    }
    
}
