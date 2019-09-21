package josephusPermutation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JosephusPermutation_ {
    @Test
    public void given_array_with_1_lenght_returns_same_array() {
        assertThat(JosephusPermutation.josephus(new int[] {1}, 3)).isEqualTo(new int[] {1});
    }

    @Test
    public void given_array_with_0_lenght_returns_same_array() {
        assertThat(JosephusPermutation.josephus(new int[] {}, 3)).isEqualTo(new int[] {});
    }

}
