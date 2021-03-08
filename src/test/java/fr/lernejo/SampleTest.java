package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private Sample sample = new Sample();

    @Test
    void addition_test(){
        assertEquals(sample.op(Sample.Operation.ADD, 3,5),8);
    }

    @Test
    void multiplication_test(){
        assertEquals(sample.op(Sample.Operation.MULT, 3, 5), 15);
    }

    @Test
    void operation_null(){
        Assertions.assertThatExceptionOfType(NullPointerException.class)
            .isThrownBy(() -> sample.op(null,3,5));
    }
}



