**APCSA**

**SECTION 1**

**Time - 1 hour and 30 minutes**

**Percent of total exam grade - 50%**
##

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

3. **Consider the following method:**

        public void mystery(int n)