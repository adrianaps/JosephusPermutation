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
    public void given_array_with_2_length_and_even_killed_should_give_permutated_array() {
        assertThat(josephus(new int[] {1, 2}, 2)).isEqualTo(new int[]{2, 1});
        assertThat(josephus(new int[] {1, 2}, 4)).isEqualTo(new int[]{2, 1});
        assertThat(josephus(new int[] {1, 2}, 6)).isEqualTo(new int[]{2, 1});
        assertThat(josephus(new int[] {1, 2}, 12)).isEqualTo(new int[]{2, 1});
    }

    @Test
    public void given_array_with_2_length_and_odd_killed_should_give_same_array() {
        assertThat(josephus(new int[] {1, 2}, 3)).isEqualTo(new int[]{1, 2});
        assertThat(josephus(new int[] {1, 2}, 5)).isEqualTo(new int[]{1, 2});
        assertThat(josephus(new int[] {1, 2}, 7)).isEqualTo(new int[]{1, 2});
        assertThat(josephus(new int[] {1, 2}, 21)).isEqualTo(new int[]{1, 2});
    }

    @Test
    public void given_array_with_3_length_and_even_killed_should_give_same_array() {
        assertThat(josephus(new int[] {1, 2, 3}, 2)).isEqualTo(new int[]{2, 1, 3});
        assertThat(josephus(new int[] {1, 2, 3}, 4)).isEqualTo(new int[]{1, 3, 2});
        assertThat(josephus(new int[] {1, 2, 3}, 6)).isEqualTo(new int[]{3,2,1});
        assertThat(josephus(new int[] {1, 2, 3}, 8)).isEqualTo(new int[]{2, 1, 3});
        assertThat(josephus(new int[] {1, 2, 3}, 10)).isEqualTo(new int[]{1, 3, 2});
    }

    @Test
    public void given_array_with_3_length_and_odd_killed_should_give_same_array() {
        assertThat(josephus(new int[] {1, 2, 3}, 3)).isEqualTo(new int[]{3,1,2});
        assertThat(josephus(new int[] {1, 2, 3}, 5)).isEqualTo(new int[]{2, 3, 1});
        assertThat(josephus(new int[] {1, 2, 3}, 7)).isEqualTo(new int[]{1, 2, 3});
    }
}