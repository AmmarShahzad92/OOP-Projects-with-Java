public class polynomial
{

    public int expo;
    public int coef;

    polynomial ()
    {
        expo = 0;
        coef = 0;
    }     // End polynomial Construct

    public polynomial(int Expo, int Coef)
    {
        expo = Expo;
        coef = Coef;
    }     // End polynomial Parameterized Construct

    public int getExpo()
    {
        return expo;
    }     // End getExpo

    public int getCoef()
    {
        return coef;
    }     // End getCoef

}    // End polynomial Class
