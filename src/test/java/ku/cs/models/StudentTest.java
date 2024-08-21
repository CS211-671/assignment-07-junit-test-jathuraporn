package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;
    @BeforeEach
    void init() {
        s1 = new Student("61xxxxx" , "PING");
    }

    @Test
    void testChangeNameAndGetNameAndGetId() {
        assertEquals("PING" , s1.getName());
        s1.changeName("PUNG");
        assertEquals("PUNG" , s1.getName());
        s1.changeName("PANG");
        assertEquals("PANG" , s1.getName());

        assertEquals("61xxxxx" , s1.getId());
    }

    @Test
    void testAddScoreAndGetScore() {
        assertEquals(0 , s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5 , s1.getScore());
        s1.addScore(10);
        assertEquals(50.5 , s1.getScore());
    }

    @Test
    void testCalculateGrade() {
        s1.addScore(60.8);
        assertEquals("C" , s1.grade());
    }

    @Test
    void testId() {
        assertEquals(false , s1.isId("61yyyyy"));
        assertEquals(true , s1.isId("61xxxxx"));
    }

    @Test
    void testToString() {
        assertEquals("{id: '61xxxxx', name: 'PING', score: 0.0}" , s1.toString());

        Student s2 = new Student("61yyyyy" , "PENG" , 81.6);
        assertEquals("{id: '61yyyyy', name: 'PENG', score: 81.6}" , s2.toString());
    }

}