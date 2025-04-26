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

    In this problem, the school is modeled by the class *School*. Students and electives are modeled by the class *Student* and *Elective* respectively.

    The <code>School</code> class includes the following methods and private data:
    - <code>studentList</code> - This