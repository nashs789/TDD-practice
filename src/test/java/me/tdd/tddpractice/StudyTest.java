package me.tdd.tddpractice;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    @DisplayName("ヽ(^。^)丿 스터디 만들기")
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);
    }

    @Test
    @Disabled
    void create_new_study_again() {
        Study study = new Study();
        assertNotNull(study);
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}