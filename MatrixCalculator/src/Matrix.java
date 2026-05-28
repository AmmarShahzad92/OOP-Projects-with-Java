public class Matrix 
{   // start of class Matrix

    // instance variables
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;
    private int row;
    private int column;

    public Matrix()
    {   // start of constructor Matrix
        matrix1 = new int[3][3];
        matrix2 = new int[3][3];
        result = new int[3][3];
        row = 3;
        column = 3;
    }   // end of constructor

    public void setMatrix1(int[][] matrix1)
    {   // start of setMatrix1
        this.matrix1 = matrix1;
    }   // end of setMatrix1

    public void setMatrix2(int[][] matrix2)
    {   // start of setMatrix2
        this.matrix2 = matrix2;
    }   // end of setMatrix2

    public int[][] addMatrices()
    {   // start of addMatrices
        for (int i = 0; i < row; i++)
        {   // start of outer for loop
            for (int j = 0; j < column; j++)
            {   // start of inner for loop
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }   // end of inner for loop
        }   // end of outer for loop
        return result;
    }   // end of addMatrices

    public int[][] multiplyMatrices()
    {   // start of multiplyMatrices
        // if check to see if the matrices can be multiplied
        if (matrix1[0].length != matrix2.length)
        {   // start of if
            boolean canMultiply = false;
            return null;
        }   // end of if
        else
        {   // start of else
            for (int i = 0; i < matrix1.length; i++)
            {   // start of outer for loop
                for (int j = 0; j < matrix2[0].length; j++)
                {   // start of inner for loop
                    for (int k = 0; k < matrix1[0].length; k++)
                    {   // start of inner inner for loop
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }   // end of inner inner for loop
                }   // end of inner for loop
            }   // end of outer for loop
            return result;
        }   // end of if
    }   // end of multiplyMatrices

    public boolean isSymmetricMatrix(int[][] matrix1)
    {   // start of isSymmetricMatrix
        for (int i = 0; i < matrix1.length; i++) 
        {   // start of outer for loop
            for (int j = 0; j < matrix1[0].length; j++) 
            {   // start of inner for loop
                if (matrix1[i][j] != matrix1[j][i]) 
                {   // start of if
                    return false;
                }   // end of if
            }   // end of inner for loop
        }   // end of outer for loop
        return true;
    }   // end of isSymmetricMatrix

    public boolean isIdentityMatrix(int[][] matrix1)
    {   // start of isIdentityMatrix
        for (int i = 0; i < matrix1.length; i++) 
        {   // start of outer for loop
            for (int j = 0; j < matrix1[0].length; j++) 
            {   // start of inner for loop
                if (i == j && matrix1[i][j] != 1) 
                {   // start of if
                    return false;
                }   // end of if
                if (i != j && matrix1[i][j] != 0) 
                {   // start of if
                    return false;
                }   // end of if
            }   // end of inner for loop
        }   // end of outer for loop
        return true;
    }   // end of isIdentityMatrix
}   // end of Matrix class
