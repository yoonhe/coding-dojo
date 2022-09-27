import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        String[] seoul = new String[] { "Yoon", "Kim" };

        assertEquals("김서방은 1에 있다", solution.solution(seoul));
    }

    @Test
    void findKimIndex() {
        Solution solution = new Solution();

        String[] seoul = new String[] { "Yoon", "Kim" };

        assertEquals(1, solution.findKimIndex(seoul));
    }

    @Test
    void checkKim() {
        Solution solution = new Solution();

        assertTrue(solution.checkKim("Kim"));
        assertFalse(solution.checkKim("Yoon"));
    }
}
