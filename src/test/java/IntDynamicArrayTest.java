import br.com.gabreuw.IntDynamicArray;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class IntDynamicArrayTest {

    @Test
    void shouldCreateAIntDynamicArrayAndAdd3Values() {
        IntDynamicArray array = new IntDynamicArray();

        array.add(5);
        array.add(10);
        array.add(15);

        assertThat(array.getArray()).hasSize(3);
        assertThat(array.getArray()).containsSequence(5, 10, 15);
    }

    @Test
    void shouldRemoveElementWithValueEqualsTo10() {
        IntDynamicArray array = new IntDynamicArray();
        array.add(5);
        array.add(10);
        array.add(15);

        array.remove(10);

        assertThat(array.getArray()).hasSize(2);
        assertThat(array.getArray()).containsSequence(5, 15);
    }

    @Test
    void shouldThrowNegativeArraySizeExceptionWhenTryToRemoveBeforeAddValue() {
        IntDynamicArray array = new IntDynamicArray();

        assertThatThrownBy(() -> array.remove(10))
                .isInstanceOf(NegativeArraySizeException.class);
    }
}