package uk.gov.metoffice.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ForecastAnalyzerTest {

    @Test
    public void firstFailingTest() {
        assertThat(true, equalTo(false));
    }
}