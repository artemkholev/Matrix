public class Main {
    public static void main(String[] args) {
        System.out.println("Create matrix:");
        Matrix<Double> myMatrix = new Matrix<Double>(2, 2);
        myMatrix.fillMatrix(new Double[][] {{1.0, 2.0}, {3.0, 4.0}});
        myMatrix.printMatrix();

        System.out.println("\nOperations with the first matrix");
        System.out.println("+ number");
//        myMatrix = myMatrix.sumNum(5.0);
//        myMatrix.printMatrix();
//        System.out.println("\n- number");
//        myMatrix = myMatrix.subNum(5);
//        myMatrix.printMatrix();
//        System.out.println("\n* number");
//        myMatrix = myMatrix.mulNum(5);
//        myMatrix.printMatrix();
//        System.out.println("\n/ number");
//        myMatrix = myMatrix.divNum(5);
//        myMatrix.printMatrix();
//
//        System.out.println("\nOperations with two matrices");
//        Matrix myMatrixSecond = new Matrix(2, 2);
//        myMatrixSecond.fillMatrix(new double[][] {{4, 3}, {2, 1}});
//        myMatrixSecond.printMatrix();
//
//        System.out.println("\n+ matrix");
//        myMatrix = myMatrix.sumMatrix(myMatrixSecond);
//        myMatrix.printMatrix();
//        System.out.println("\n- matrix");
//        myMatrix = myMatrix.subMatrix(myMatrixSecond);
//        myMatrix.printMatrix();
//        System.out.println("\n* matrix");
//        myMatrix = myMatrix.mulMatrix(myMatrixSecond);
//        myMatrix.printMatrix();
//
//        System.out.println("\ntranspose matrix");
//        myMatrix = myMatrix.transpose();
//        myMatrix.printMatrix();
//
//        System.out.println("\ndeterminant matrix");
//        System.out.println(myMatrix.determinant());
//
//        Matrix myMatrixThird = new Matrix(4, 4);
//        myMatrixThird.fillMatrix(new double[][] {{4, 3, 1, 2}, {2, 1, 6, 7}, {1, 2, 3, 4}, {7, 7, 7, 8}});
//        System.out.println("\ndeterminant matrix");
//        myMatrixThird.printMatrix();
//        System.out.println(myMatrixThird.determinant());
//
        System.out.println("operations with complex numbers");
        System.out.println("Create matrix:");
        Matrix<ComplexNum> myMatrixComplex = new Matrix<ComplexNum>(2, 2);
//        myMatrix.fillMatrix(new Double[][] {{1.0, 2.0}, {3.0, 4.0}});
//        myMatrix.printMatrix();
    }
}
