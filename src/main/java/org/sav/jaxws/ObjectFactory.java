
package org.sav.jaxws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sav.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sav.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeDCTMRequestMT }
     * 
     */
    public EmployeeDCTMRequestMT createEmployeeDCTMRequestMT() {
        return new EmployeeDCTMRequestMT();
    }

    /**
     * Create an instance of {@link OrgStructureRequestMT }
     * 
     */
    public OrgStructureRequestMT createOrgStructureRequestMT() {
        return new OrgStructureRequestMT();
    }

    /**
     * Create an instance of {@link UpdateDepartment }
     * 
     */
    public UpdateDepartment createUpdateDepartment() {
        return new UpdateDepartment();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link EmployeeDCTMRequestMT.Row }
     * 
     */
    public EmployeeDCTMRequestMT.Row createEmployeeDCTMRequestMTRow() {
        return new EmployeeDCTMRequestMT.Row();
    }

    /**
     * Create an instance of {@link OrgStructureRequestMT.Row }
     * 
     */
    public OrgStructureRequestMT.Row createOrgStructureRequestMTRow() {
        return new OrgStructureRequestMT.Row();
    }

}
