package lab;

import lab.demand.Order;
import lab.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class TaxTest {

    public void test_AllTaxFromPeru() {
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.calculateTotal(ordersFromPeru);
        Assert.assertEquals(Math.round(result), 7.0);
    }
}
