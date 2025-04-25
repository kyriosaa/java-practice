> **APCSA**
> 
> **SECTION 1**
> 
> **Time - 1 hour and 30 minutes**
> 
> **Percent of total exam grade - 50%**

## Directions:

Determine the answer to each of the following questions or incomplete statements, using the available space for any necessary scratchwork. Then decide which is the best of the choices given and fill in the corresponding oval on the answer sheet. No credit will be given for anything written in the examination booklet. Do not spend too much time on any one problem.


## Notes:

- Assume that the classes listed in the Quick Reference have been imported where appropriate.
- Assume that declarations of variables and methods appear within the context of an enclosing class.
- Assume that method calls that are not prefixed with an object or class name and are not shown within a complete class definition appear ]within the context of an enclosing class.
- Unless otherwise noted in the question, assume that parameters in the method calls are not *null* and that methods are called only when their preconditions are satisfied.


## MULTIPLE CHOICE QUESTIONS

1. **Consider the following methods:**

        public void trial() {
            int a = 10;
            int b = 5;
            doublevalues(a, b);
            System.out.print(a);
        }

        public void doublevalues(int c, int d) {
            c = c * 2;
            d = d * 2;
            System.out.print(c);
            System.out.print(d);
        }

    What is printed as the result of the call *trial()*?
    - (A) 2010
    - (B) 2010105
    - (C) 2010510
    - (D) 20102010
    - (E) 20101020
##
2. **Consider the following method:**

        /* Precondition: a > b > 0 */
        public static int mystery(int a, int b) {
            int d = 0;
            for(int c = a; c > b; c--) {
                d = d + c;
            }
            return d;
        }
    
    What is returned by the call *mystery(x, y)*?
    - (A) The sum of all the integers greater than *y* but less than or equal to *x*
    - (B) The sum of all the integers greater than or equal to *y* but less than or equal to *x*
    - (C) The sum of all the integers greater than *y* but less than *x*
    - (D) The sum of all the integers greater than *y* but lessthan or equal to *x*
    - (E) The sum of all the integers less than *y* but greater than or equal to *x*
##
3. **Consider the following method:**

        public void mystery(int n) {
            int k;
            for(k = 0; k < n; k++) {
                mystery(k);
                System.out.print(n);
            }
        }

    What value is returned by the call *mystery(3)*?
    - (A) 0123
    - (B) 00123
    - (C) 0010012
    - (D) 00100123
    - (E) 001001200100123
##
4. **Consider an array of integers:**

        {4, 10, 1, 2, 6, 7, 3, 5}

    If selection sort is used to order the array from smallest to largest values, which of the following represents a possible state of the array at some point during the selection sort process?
    - (A) {1, 4, 10, 2, 3, 6, 7, 5}
    - (B) {1, 2, 4, 6, 10, 7, 3, 5}
    - (C) {1, 2, 3, 10, 6, 7, 4, 5}
    - (D) {4, 3, 1, 2, 6, 7, 10, 5}
    - (E) {5, 3, 7, 6, 2, 1, 10, 4}
##
5. **Consider the following code segment:**

        int k;
        int A[];
        A = new int[7];
        for(k = 0; k < A.length; k++) {
            A[k] = A.length - k;
        }
        for(k = 0; k < A.length - 1; k++) {
            A[k+1] = A[k];
        }

    What values will A contain after the code segment is executed?
    - (A) {1, 1, 2, 3, 4, 5, 6}
    - (B) {1, 2, 3, 4, 5, 6, 7}
    - (C) {6, 6, 5, 4, 3, 2, 1}
    - (D) {7, 7, 6, 5, 4, 3, 2}
    - (E) {7, 7, 7, 7, 7, 7, 7}
##
**Questions 6-7 refer to the following two classes:**

        public class PostOffice {
            // constructor initializes boxes to length 100
            public PostOffice() {
                /* implementation not shown */
            }

            // returns the given p.o. box
            // 0 <= theBox < getNumBoxes()
            public Box getBox(int theBox) {
                /* implementation not shown */
            }

            // returns the number of p.o. boxes
            public int getNumBoxes() {
                /* implementation not shown */
            }

            // private data members and other methods not shown
        }

        public class Box {
            // constructor
            public Box() {
                /* implementation not shown */
            }

            // returns the number of this box
            public int getBoxNumber() {
                /* implementation not shown */
            }

            // returns the number of pieces of mail in this box
            publicint getMailCount() {
                /* implementation not shown */
            }

            // returns the given piece of mail
            // 0 <= thePiece < getMailCount()
            public Mail getMail(int thePiece) {
                /* implementation not shown */
            }

            // true if the box has been assigned to a customer
            public boolean isAssigned() {
                /* implementation not shown */
            }

            // true if the box contains mail
            public boolean hasMail() {
                /* implementation not shown */
            }

            // private data members and other methods not shown
        }

        public class Mail {
            // private members, constructors, and other methods not shown
        }

6. **Consider the following code segment:**

        PostOffice p[];
        p = new PostOffice[10];

    Assuming that the box has been assigned and that it has at least four pieces of mail waiting in it, what is the correct way of getting the fourth piece of mail from the 57th box of the tenth post office of *p*?
    - (A) Mail m = p[10].getBox(57).getmail(4);
    - (B) Mail m = p[9].getBox(56).getMail(3);
    - (C) Mail m = p.getMail(57).getMail(4) [10];
    - (D) Mail m = getMail(getBox(p[9], 560, 3);
    - (E) Mail m = new Mail(10, 57, 4);

7. **Consider the incomplete function *printEmptyBoxes* given below. *printEmptyBoxes* should print the box numbers of all of the boxes that do not contain mail:**

        public void printEmptyBoxes(PostOffice p[]) {
            for(int k = 0; k < p.length - 1; k++) {
                for(int x = 0; x < p[k].getNumBoxes() - 1; x++) {
                    // missing expression
                }
            }
        }

    Which of the following could be used to replace the missing expression?
    - (A)
    > if(p[k].getBox(x).isAssigned() && !p[k].getBox(x).hasMail()) {
    >> System.out.println(p[x].getBox(k).getBoxNumber());
    > }
    - (B)
    > if(p[x].getBox(k).isAssigned() && !p[x].getBox(k).hasMail()) {
    >> System.out.println(p[x].getBox(k).getBoxNumber());
    > }