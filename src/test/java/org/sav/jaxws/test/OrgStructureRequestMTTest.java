package org.sav.jaxws.test;

import org.junit.Test;
import org.sav.jaxws.OrgStructureRequestMT;
import org.sav.jaxws.OrgsynchPortType;
import org.sav.jaxws.OrgsynchService;

/**
 * @author tolya
 * @since 07.02.14.
 */

public class OrgStructureRequestMTTest {

    @Test
    public void testOrgStructureRequestMT() throws Exception {
        OrgsynchPortType port = new OrgsynchService().getHTTPPort();
        OrgStructureRequestMT requestMT = new OrgStructureRequestMT();
        OrgStructureRequestMT.Row row = new OrgStructureRequestMT.Row();
        row.setFKEY("1");
        requestMT.setRow(row);
        port.updateDepartment(requestMT);
    }
}
