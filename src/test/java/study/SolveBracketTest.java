package study;

import com.likelion.week5.day221021.SolveBracket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// String 어떤 연산 boolean(true, false)을 리턴
class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        SolveBracket sb = new SolveBracket();
//        assertTrue(sb.solution("()()"));
//        assertTrue(sb.solution("(())()"));
        assertFalse(sb.solution(")()("));
//        assertFalse(sb.solution("(()("));
//        assertFalse(sb.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }

}