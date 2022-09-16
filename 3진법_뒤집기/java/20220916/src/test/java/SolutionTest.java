import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        assertEquals(7, solution.solution(45));
    }

    @Test
    void decimalToTernary() {
        Solution solution = new Solution();

        assertEquals("0021", solution.decimalToTernary(45));
    }

    @Test
    void ternaryToDecimal() {
        Solution solution = new Solution();

        assertEquals(7, solution.ternaryToDecimal("0021"));
    }
}
