> **APCSA - PRACTICE TEST 1**
> 
> **SECTION 2**
> 
> **Time - 1 hour and 30 minutes**
>
> **Number of Questions - 4**
> 
> **Percent of Total Grade - 50%**


## Directions:

SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA.


## Notes:

- Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
- Unless otherwise noted in the equation, assume that the parameters in method calls are not null and that methods are ccalled only when their preconditions are satisfied.
- In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.


## FREE RESPONSE QUESTIONS

1.  In a certain school, students are permitted to enroll in one elective class from a list of electives offered. Because there are a limited number of spaces in each class for students, and because some electives are more popular than others, a lottery system was devised by the school to assign students to electives.

    Each student lists three choices for electives. The school orders the students randomly and assigns each student to the first available elective in the student's list of three choices. If none of the three choices is available (because those electives are fully enrolled), the school does not assign the student to an elective.

    After the school attempts to assign all of the students to electives, it produces a list of students it was unable to assign.

    For example, suppose there are six electives available to students: Astronomy, Ballroom Dance, Basketweaving, Constitutional Law, Marine Biology, and Programming.

    The following table shows the name, maximum enrollment, and current enrollment for six electives after 64 students have been successfully assigned to electives:

            Elective Name               Max Enrollment          Current Enrollment

            Astronomy                   12                      12
            Ballroom Dance              20                      3
            Basketweaving               15                      14
            Constitutional Law          10                      7
            Marine Biology              10                      10
            Programming                 30                      30

    Note that three electives, Astronomy, Programming, and Marine Biology, are full enrolled and are no longer options for students.

    Now suppose that the following students need to be assigned to electives:

            Student                 First Choice                Second Choice               Third Choice

            Andrew                  Programming                 Marine Biology              Ballroom Dance
            David                   Constitutional Law          Basketweaving               Programming
            Elizabeth               Marine Biology              Programming                 Astronomy
            Ethan                   Basketweaving               Marine Biology              Astronomy
            Katharine               Programming                 Basketweaving               Marine Biology

    > Andrew's first and second choices are fully enrolled, but his third choice has openings, Andrew will be enrolled in Ballroom Dance.
    > 
    > David's first choice has openings. David will be enrolled in Constitutional Law.
    >
    > All three of Elizabeth's choices are fully enrolled. Elizabeth will remain unassigned to an elective.
    >
    > Ethan's first choice has one opening left. Ethan will be enrolled in Basketweaving. Note that Basketweaving is now fully enrolled.
    >
    > All three of Katharine's choices are now fully enrolled. Katharine will remain unassigned to an elective.

    In this problem, the school is modeled by the class <code>School</code>. Students and electives are modeled by the class <code>Student</code> and <code>Elective</code> respectively.

    The <code>School</code> class includes the following methods and private data:
    - <code>studentList</code> - This <code>ArrayList</code> holds the list of students in the order in which the students should be scheduled.
    - <code>electiveList</code> - This <code>ArrayList</code> holds the electives that students may choose.
    - <code>getElectiveByName</code> - This method returns the <code>Elective</code> in <code>electiveList</code> with the given name.
    - <code>assignElectivesToStudents</code> - This method encapsulates the functionality of assigning students (if possible) their first, second, or third elective choice.
    - <code>studentsWithoutElectives</code> - This method returns an <code>ArrayList</code> containing students that have not been assigned an elective.

            public class School {
                private ArrayList<Student> studentList;
                // each entry is an instance of a Student representing one student at the school
                // students are in the order they should be scheduled

                private ArrayList<Elective> electiveList;
                // each entry is an instance of an Elective representing one elective offered at the school

                // precondition: name is the name of an Elective in electiveList
                // postcondition: returns the Elective in electiveList with the given name
                private Elective getElectiveByName(String name) {
                    /* to be implemented in part(a) */
                }

                // postcondition: returns the size of electiveList
                private int getElectiveListSize() {
                    returns electiveList.size();
                }

                private int getStudentListSize() {
                    returns studentList.size();
                }

                // postcondition: All Students in studentList have been either assigned their first available elective choice or not assigned
                //                All Electives in electiveList have been updated appropriately as Students are assigned to them
                public void assignElectivesToStudents() {
                    /* to be implemented in part(b) */
                }

                // postcondition: returns a list of those Students who have not been assigned an Elective
                public ArrayList<Student> studentsWithoutElectives() {
                    /* to be implemented in part(c) */
                }

                // ... constructors, other methods, and other private data not shown
            }
        
    The Student class includes the following methods and private data:
    - <code>getChoice</code> - This method returns the name of the given elective choice of the student. The first elective choice has index 0, the second has index 1, and the third has index 2.
    - <code>hasElective</code> - This method returns true if the student has been assigned an elective; it returns false otherwise.
    - <code>assignElective</code> - This method assigns the given elective to this student.

            public class Student {
                // precondition: 0 <= index < 3
                // postcondition: returns the name of the given elective choice
                public String getChoice(int index) {
                    /* code not shown */
                }

                // postcondition: returns true if an Elective has been assigned to this Student
                public boolean hasElective() {
                    /* code not shown */
                }

                // precondition: e is not null
                // postcondition: e has been assigned to this Student; e has not been modified
                public void assignElective(Elective e) {
                    /* code not shown */
                }

                // ... constructors, other methods, and other private data not shown
            }

    The Elective class includes the following methods:
    - <code>getName</code> - This method returns the name of this elective.
    - <code>getMaxClassSize</code> - This method returns the maximum number of students that can be assigned to this elective.
    - <code>getClassSize</code> - This method returns the number of students that have been assigned to this elective.
    - <code>addStudent</code> - This method assigns the given student to this elective.

            public class Elective {
                // postcondition: returns the name of this Elective
                public String getName() {
                    /* code not shown */
                }

                // postcondition: returns the maximum number of Students that can be added to this Elective
                public int getMaxClassSize() {
                    /* code not shown */
                }

                // postcondition: returns the number of Students that have been added to this Elective
                //                0 <= getClassSize() <= getMaxClassSize()
                public int getClassSize() {
                    /* code not shown */
                }

                // precondition:  getClassSize() < getMaxClassSize() 
                //                s is not null
                // postcondition: s has been added to this Elective
                //                getClassSize() has been increased by 1
                public void addStudent(Student s) {
                    /* code not shown */
                }

                // ... constructors, other methods, and other private data not shown
            }

    >
    > Questions below
    >

    (a) **Write the <code>School</code> method <code>getElectiveByName</code>. Method <code>getElectiveByName</code> should return the <code>Elective</code> in <code>electiveList</code> that has the given name.**

        Complete method <code>getElectiveByName</code> below

                // precondition:  name is the name of an Elective in electiveList
                // postcondition: returns the Elective in electiveList with the given name
                private Elective getElectiveByName(String name)

    (b) **Write the <code>School</code> method <code>assignElectivesToStudents</code>. Method <code>assignElectivesToStudents</code> should assign electives to students as described at the beginning of this question.**

    **In writing method <code>assignElectivesToStudents</code> you may use the <code>private</code> helper method <code>getElectiveByName</code> specified in part (a). Assume that <code>getElectiveByName</code> works as specified, regardless of what you wrote in part (a). Solutions that reimplement functionality provided by this method, rather than invoking it, will not receive full credit.**

        Complete method <code>assignElectivesToStudents</code> below

                // postcondition: All Students in studentList have been either assigned their first available elective choice or not assigned
                //                All electives in electiveList have been updated appropriately as Students are assigned to them
                public void assignElectivesToStudents()

    (c) **Write the <code>School</code> method <code>studentsWithoutElectives</code>. Method <code>studentsWithoutElectives</code> should return <code>ArrayList</code> of all Students in <code>studentList</code> who do not have an <code>Elective</code> assigned to them.**

        Complete method <code>studentsWithoutElectives</code> below

                // postcondition: returns a list of those Students who have not been assigned an Elective
                public ArrayList studentsWithoutElectives()

##

2.  Consider a deck of *n* cards where *n* is even and each card is uniquely labeled from 1 to *n*.

    A *shuffle* is performed when the deck is divided into two stacks and the stacks are interlaced so that a new stack is formed by alternately taking cards from each stack.

    For instance, a deck of ten cards is in order when the card labeled 0 is on the top of the deck and the card labeled 9 is on the bottom of the deck.

    Dividing the deck in half produces two stacks of cards - one stack with cards 0 through 4, the other with cards 5 through 9. Interlacing the stacks produces a deck in the following order:

    ![alt text](https://github.com/kyriosaa/java-practice/blob/main/APCSA/exam/test-1/images/frq-q2-order.png "FRQ Q2")