package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList s1;

    @BeforeEach
    void init() {
        s1 = new StudentList();
        s1.addNewStudent("62yyyyy1" , "TOM");
        s1.addNewStudent("62yyyyy2" , "TAM");
        s1.addNewStudent("62yyyyy3" , "TIM");
    }

    @Test
    void testAddNewStudentAndGetStudents(){
        s1.addNewStudent("61xxxx1" , "NUT");
        assertEquals(4 , s1.getStudents().size());

        s1.addNewStudent("61xxxx2" , "NAT" , 63.2);
        assertEquals(5 , s1.getStudents().size());

        s1.addNewStudent("61xxxx3" , "NIT" , 1.3);
        assertEquals(6 , s1.getStudents().size());
    }

    @Test
    void testGiveScoreAndFindStudentAndViewGrade() {
        s1.giveScoreToId("62yyyyy1" , 5);
        assertEquals(5 , s1.findStudentById("62yyyyy1").getScore());
        s1.giveScoreToId("62yyyyy3" , 50);
        assertEquals(50 , s1.findStudentById("62yyyyy3").getScore());
        s1.giveScoreToId("62yyyyy2" , 75);
        assertEquals(75 , s1.findStudentById("62yyyyy2").getScore());

        assertEquals("F" , s1.viewGradeOfId("62yyyyy1"));
        assertEquals("D" , s1.viewGradeOfId("62yyyyy3"));
        assertEquals("B" , s1.viewGradeOfId("62yyyyy2"));
    }

}