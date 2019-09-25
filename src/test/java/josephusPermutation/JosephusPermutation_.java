package josephusPermutation;

import org.junit.Test;

import static josephusPermutation.JosephusPermutation.josephus;
import static org.assertj.core.api.Assertions.assertThat;

public class JosephusPermutation_ {
    @Test
    public void given_array_with_1_or_less_killed_should_give_same_array() {
        assertThat(josephus(new int[] {}, 0)).isEqualTo(new int[]{});
        assertThat(josephus(new int[] {1}, 0)).isEqualTo(new int[]{1});
        assertThat(josephus(new int[] {1}, -1)).isEqualTo(new int[]{1});
        assertThat(josephus(new int[] {1}, 1)).isEqualTo(new int[]{1});
        assertThat(josephus(new int[] {1, 2}, 1)).isEqualTo(new int[]{1, 2});
    }

    @Test
    public void given_array_with_1_length_and_2_or_less_killed_should_give_same_array() {
        assertThat(josephus(new int[] {1}, 2)).isEqualTo(new int[]{1});
        assertThat(josephus(new int[] {1}, 5)).isEqualTo(new int[]{1});
    }

    @Test
    public void given_array_with_2_length_and_2_killed_should_give_permutated_array() {
        assertThat(josephus(new int[] {1, 2}, 2)).isEqualTo(new int[]{2, 1});
    }

    @Test
    public void given_array_with_2_length_and_3_killed_should_give_same_array() {
        assertThat(josephus(new int[] {1, 2}, 3)).isEqualTo(new int[]{1, 2});
    }
}