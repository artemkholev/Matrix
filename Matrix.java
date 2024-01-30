public class Matrix<T extends Number> {
    T[][] elemsMatrix;

    public Matrix(int x, int y) {
        elemsMatrix = (T[][])(new Object[x][y]);
    }

    public void fillMatrix(T[][] data) {
        if (data.length != this.lenCols() || data[0].length != this.lenRows()) {
            System.out.println("Problem with fill matrix");
            System.exit(0);
        }
        for (int i = 1; i <= this.lenRows(); i++) {
            for (int j = 1; j <= this.lenCols(); j++) {
                this.set(i, j, data[i - 1][j - 1]);
            }
        }
    }
    public int lenRows() {
        return elemsMatrix.length;
    }

    public int lenCols() {
        return elemsMatrix[0].length;
    }

    public void set(int x, int y, T elem) {
        if((x < 1) || (x > lenRows()) || (y < 1) || (y > lenCols())) {
            System.out.println("problem with set elem");
            return;
        }
        elemsMatrix[x-1][y-1] = elem;
    }

    public T get(int x, int y) {
        if((x < 1) || (x > lenRows()) || (y < 1) || (y > lenCols())) {
            System.out.println("problem with get elem");
            System.exit(0);
        }
        return elemsMatrix[x-1][y-1];
    }

    public Matrix<T> transpose() {
        Matrix<T> newMatrix = new Matrix<T>(lenCols(), lenRows());
        for(int i = 1; i <= lenCols(); i++) {
            for(int j = 1; j <= lenRows(); j++) {
                newMatrix.set(i, j, get(j, i));
            }
        }
        return newMatrix;
    }

    public Matrix<T> minorMatrix(int row, int col) {
        Matrix<T> t_matrix = new Matrix<T>(this.lenRows() - 1, this.lenCols() - 1);
        for (int i = 1, t_i = 1; i <= this.lenRows(); i++) {
            if (i != row) {
                for (int j = 1, t_j = 1; j <= this.lenCols(); j++) {
                    if (j != col)
                        t_matrix.set(t_i, t_j++, this.get(i, j));
                }
                ++t_i;
            }
        }
        return t_matrix;
    }

//    public T determinant() {
//        if (this.lenRows() != this.lenCols()) {
//            System.out.println("Problem with determinant matrix");
//            System.exit(0);
//        }
//        T result;
//
//        if (this.lenRows() == 1) {
//            result = this.get(1, 1);
//        } else if (this.lenRows() == 2) {
//            result = (this.get(1, 1) * this.get(2, 2)) - (this.get(1, 2) * this.get(2, 1));
//        } else {
//            for (int i = 1; i <= this.lenRows(); i++) {
//                Matrix minor = minorMatrix(i, 1);
//                T det = minor.determinant();
//                result += this.get(i, 1) * Math.pow(-1.0, i) * det;
//            }
//        }
//        return result;
//    }
//
//    //multiply
//    public Matrix mulNum(double elem) {
//        Matrix newMatrix = new Matrix(lenRows(), lenCols());
//        for(int i = 1; i <= lenRows(); i++) {
//            for(int j = 1; j <= lenCols(); j++) {
//                newMatrix.set(i, j, elem * get(i, j));
//            }
//        }
//        return newMatrix;
//    }
//
//    public Matrix divNum(double elem) {
//        Matrix newMatrix = new Matrix(lenRows(), lenCols());
//        for(int i = 1; i <= lenRows(); i++) {
//            for(int j = 1; j <= lenCols(); j++) {
//                newMatrix.set(i, j, get(i, j) / elem);
//            }
//        }
//        return newMatrix;
//    }
//
//    public Matrix mulMatrix(Matrix secondMatrix) {
//        Matrix newMatrix = new Matrix(lenRows(), secondMatrix.lenCols());
//        double firstElemM, secondElemM;
//
//        if(lenCols()!= secondMatrix.lenRows()) {
//            System.out.println("Problem with multiply matrix");
//            System.exit(0);
//        }
//
//        for(int i = 1; i <= lenRows(); i++) {
//            for(int j = 1; j <= secondMatrix.lenCols(); j++) {
//                double sum = 0;
//                for(int k = 1; k <= lenCols(); k++) {
//                    firstElemM = get(i, k);
//                    secondElemM = secondMatrix.get(k, j);
//                    sum += firstElemM * secondElemM;
//                }
//                newMatrix.set(i, j, sum);
//            }
//        }
//        return newMatrix;
//    }
//
//    //sum
//    public Matrix sumMatrix(Matrix secondMatrix) {
//        if((lenRows()!= secondMatrix.lenRows()) || (lenCols()!= secondMatrix.lenCols())) {
//            System.out.println("problem with sum matrix");
//            System.exit(0);
//        }
//
//        Matrix newMatrix = new Matrix(lenRows(), lenCols());
//        double elem;
//        for(int i = 1; i <= lenRows(); i++) {
//            for(int j = 1; j <= lenCols(); j++) {
//                elem = get(i, j);
//                newMatrix.set(i, j, elem + secondMatrix.get(i, j));
//            }
//        }
//        return newMatrix;
//    }

//    public Matrix<T> sumNum(T elem) {
//        Matrix<T> newMatrix= new Matrix<T>(lenRows(), lenCols());
//
//        for(int i = 1; i <= lenRows(); i++) {
//            for(int j = 1; j <= lenCols(); j++) {
//                newMatrix.set(i, j, Double.sum((Double) elem, get(i, j)));
//            }
//        }
//        return newMatrix;
//    }

//    //subtraction
//    public Matrix subMatrix(Matrix secondMatrix) {
//        if(lenCols()!= secondMatrix.lenCols() || lenRows() != secondMatrix.lenRows()) {
//            System.out.println("Problem with subtraction matrix");
//            System.exit(0);
//        }
//
//        Matrix newMatrix = new Matrix(lenRows(), secondMatrix.lenCols());
//        for(int i = 1; i <= lenRows(); i++) {
//            for(int j = 1; j <= secondMatrix.lenCols(); j++) {
//                newMatrix.set(i, j, this.get(i, j) - secondMatrix.get(i, j));
//            }
//        }
//        return newMatrix;
//    }

//    public Matrix<T> subNum(T elem) {
//        Matrix<T>  newMatrix= new Matrix<T>(lenRows(), lenCols());
//
//        for(int i = 1; i <= lenRows(); i++) {
//            for(int j = 1; j <= lenCols(); j++) {
//                T subElem;
//                subElem = get(i, j) - elem;
//                newMatrix.set(i, j, subElem);
//            }
//        }
//        return newMatrix;
//    }
    public void printMatrix() {
        T elem;
        for(int i = 1; i <= lenRows(); i++) {
            System.out.format("[");
            for(int j = 1; j <= lenCols(); j++) {
                if(j > 1)
                    System.out.format(" ");
                elem = get(i, j);
                System.out.print(elem);
            }
            System.out.print("]\n");
        }
    }
}