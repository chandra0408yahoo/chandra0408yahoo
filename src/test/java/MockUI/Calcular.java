package MockUI;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

public class Calcular {

    CalculatorService cs= null;

    @Mock
    Icalculator ser;

    @Rule
    public MockitoRule rule= MockitoJUnit.rule();

    @Before
    public void start(){
        cs=new CalculatorService( ser);
    }


    @Test
    public void testthefunc(){

        when(ser.add(2,3)).thenReturn(5);
        Assert.assertEquals(10, cs.perform(2,3));

    }

}
