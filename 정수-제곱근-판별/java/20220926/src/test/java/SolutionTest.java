import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void checkSquareRoot() {
        Solution solution = new Solution();

        assertTrue(solution.checkSquareRoot(121));
        assertFalse(solution.checkSquareRoot(3));
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        assertEquals(144, solution.solution(121));
        assertEquals(-1, solution.solution(3));
    }
}
