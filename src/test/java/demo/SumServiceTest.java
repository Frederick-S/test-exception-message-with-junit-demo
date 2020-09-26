package demo;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SumServiceTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldAssertExceptionMessageByExpectedException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("a must be positive");

        SumService.sum(0, 1);
    }

    @Test
    public void shouldAssertExceptionMessageByTryCatch() {
        try {
            SumService.sum(0, 1);
        } catch (Exception e) {
            Assert.assertEquals("a must be positive", e.getMessage());
        }
    }

    @Test
    public void shouldAssertExceptionMessageByAssertThrows() {
        IllegalArgumentException illegalArgumentException =
                Assert.assertThrows(IllegalArgumentException.class, () -> SumService.sum(0, 1));

        Assert.assertEquals("a must be positive", illegalArgumentException.getMessage());
    }
}
