package org.sav.jaxws.test;

import junit.framework.Assert;
import org.junit.Test;
import org.sav.jaxws.*;

/**
 * @author tolya
 * @since 07.02.14.
 */

public class testMethodTest {

    @Test
    public void testOrgStructureRequestMT() throws Exception {
        OrgsynchPortType port = new OrgsynchService().getHTTPPort();
        TestMethodInMsg inMsg = new TestMethodInMsg();
        inMsg.setArgument("test");
        TestMethodOutMsg outMsg = port.testMethod(inMsg);
        Assert.assertEquals(outMsg.getArgument(), "test success");
    }
}
