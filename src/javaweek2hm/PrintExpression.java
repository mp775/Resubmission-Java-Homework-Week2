package javaweek2hm;
/*Write a Java program to compute the specified expressions and print the
        output.
        Test Data:
        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        Expected Output : 2.138888888888889
        */
public class PrintExpression {




        public static void main(String[] args) {
            PrintExpression t = new PrintExpression();
            t.printExp();
        }

        //Printing expression
        public void printExp() {
            double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
            System.out.println(a);
        }
    }


