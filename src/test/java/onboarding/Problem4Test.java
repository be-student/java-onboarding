package onboarding;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem4Test {
    @Test
    void case1() {
        String word = "Hello  Everyone!";
        String result = "Svool  Veviblmv!";
        assertThat(Problem4.solution(word)).isEqualTo(result);
    }

    @Test
    void case2() {
        String word = "abcdefghijklmnopqrstuvwxyz";
        String result = "zyxwvutsrqponmlkjihgfedcba";
        assertThat(Problem4.solution(word)).isEqualTo(result);
    }

    @Test
    void case3() {
        String word = "abcdefghijklmnopqrstuvwxyz";
        String result = "zyxwvutsrqponmlkjihgfedcba";
        assertThat(Problem4.solution(word)).isEqualTo(result);
    }

    @Test
    void case4() {
        String word = "abcdefghijklmnopqrstuvwxyz !@#!#  ";
        String result = "zyxwvutsrqponmlkjihgfedcba !@#!#  ";
        assertThat(Problem4.solution(word)).isEqualTo(result);
    }

    @Test
    void case5() {
        String word = "Svool, Dliow! 123";
        String result = "Hello, World! 123";
        assertThat(Problem4.solution(word)).isEqualTo(result);
    }
}
