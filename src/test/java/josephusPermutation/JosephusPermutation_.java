package josephusPermutation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JosephusPermutation_ {
    @Test
    public void given_array_with_1_lenght_every_3_returns_same_array() {
        assertThat(JosephusPermutation.josephus(new int[] {1}, 3)).isEqualTo(new int[] {1});
    }

    @Test
    public void given_array_with_0_lenght_every_3_returns_same_array() {
        assertThat(JosephusPermutation.josephus(new int[] {}, 3)).isEqualTo(new int[] {});
    }

    @Test
    public void given_array_with_2_lenght_every_3_returns_same_array() {
        assertThat(JosephusPermutation.josephus(new int[] {1,2}, 3)).isEqualTo(new int[] {1,2});
    }

    @Test
    public void given_array_with_3_lenght_every_3_returns_reordenated_array() {
        assertThat(JosephusPermutation.josephus(new int[] {1,2,3}, 3)).isEqualTo(new int[] {3,1,2});
    }

    @Test
    public void given_array_with_2_lenght_every_2_returns_reordenated_array() {
        assertThat(JosephusPermutation.josephus(new int[] {1,2}, 2)).isEqualTo(new int[] {2,1});
    }
}
