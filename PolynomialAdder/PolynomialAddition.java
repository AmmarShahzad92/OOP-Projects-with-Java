public class PolynomialAddition
{

    private polynomial [] PA1;
    private polynomial [] PA2;
    private polynomial [] Result;
    private int p1terms;
    private int p2terms;
    private int p3terms;

    PolynomialAddition ()
    {
        PA1 = new polynomial[10];       // Initialization of array of polynomial data type
        PA2 = new polynomial[10];
        Result = new polynomial[10];
        p1terms = 0;
        p2terms = 0;
        p3terms = 0;
    }    // End PolynomialAddition Construct

    public void PolynomialAddition ( polynomial pa1, polynomial pa2 )
    {
        PA1[p1terms].coef = pa1.coef;
        PA1[p1terms++].expo = pa1.expo;
        PA1[p2terms].coef = pa2.coef;
        PA1[p2terms++].expo = pa2.expo;
    }    // End of the parameterized construct for array PA1 and PA2

    public polynomial[] getPA1()
    {
        return PA1;
    }   // End getPA1

    public polynomial[] getPA2()
    {
        return PA2;
    }   // End getPA2

    public polynomial[] getResult()
    {
        return Result;
    }   // End getResult

    public int getP1terms()
    {
        return p1terms;
    }   // End getP1terms

    public int getP2terms()
    {
        return p2terms;
    }   // End getP2terms

    public int getP3terms() {
        return p3terms;
    }   // End getP3terms

    public void AdditionOfPolynomial ()
    {
        int i = 0, j = 0;
        while ((i < p1terms) && (j < p2terms))
        {
            if (PA1[i].expo == PA2[j].expo)
            {
                Result[p3terms].coef = (PA1[i].coef + PA2[j].coef);
                Result[p3terms].expo = PA1[i].expo;
                i++; j++; p3terms++;
            }    // End if when expo is same

            if (PA1[i].expo > PA2[j].expo)
            {
                Result[p3terms].coef = PA1[i].coef;
                Result[p3terms].expo = PA1[i].expo;
                p3terms++; i++;
            }    // End if when expo of PA1 is larger

            if (PA1[i].expo < PA2[j].expo)
            {
                Result[p3terms].coef = PA2[j].coef;
                Result[p3terms].expo = PA2[j].expo;
                p3terms++; j++;
            }    // End if when expo of PA2 is larger

        }        // End While loop

        if (i < p1terms)
        {
            while (i < p1terms)
            {
                Result[p3terms].coef = PA1[i].coef;
                Result[p3terms].expo = PA1[i].expo;
                p3terms++; i++;
            }              // End for for remaining PA1 elements
        }     // End if for remaining PA1 elements

        if (j < p2terms)
        {
            while (j < p2terms)
            {
                Result[p3terms].coef = PA2[j].coef;
                Result[p3terms].expo = PA2[j].expo;
                p3terms++; j++;
            }               // End for loop for remaining PA2 elements
        }     // End if for remaining PA2 elements

    }      // End Class AdditionOfPolynomial

}         // End PolynomialAddition Class
