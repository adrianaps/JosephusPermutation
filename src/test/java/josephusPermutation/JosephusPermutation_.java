package josephusPermutation;

import org.junit.Test;

import static josephusPermutation.JosephusPermutation.josephus;
import static org.assertj.core.api.Assertions.assertThat;

public class JosephusPermutation_ {
    @Test
    public void given_empty_array_with_0_killed_should_give_empty_array() {
        assertThat(josephus(new int[] {}, 0)).isEqualTo(new int[]{});
    }

    @Test
    public void given_array_with_0_killed_should_give_same_array() {
        assertThat(josephus(new int[] {1}, 0)).isEqualTo(new int[]{1});
    }
}
