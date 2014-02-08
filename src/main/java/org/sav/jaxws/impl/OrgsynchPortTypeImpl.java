package org.sav.jaxws.impl;

import org.sav.jaxws.*;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "OrgsynchPortType", targetNamespace = "http://localhost:8080/jaxws/services/OrgsynchPortType")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
                    ObjectFactory.class
            })
public class OrgsynchPortTypeImpl implements OrgsynchPortType {
    @WebMethod(operationName = "UpdateEmployee", action = "urn:UpdateEmployee")
    @Oneway
    @Override
    public void updateEmployee(EmployeeDCTMRequestMT parameters) {
        System.out.println(parameters.getRow().getActivity());
    }

    @WebMethod(operationName = "UpdateDepartment", action = "urn:UpdateDepartment")
    @Oneway
    @Override
    public void updateDepartment(OrgStructureRequestMT parameters) {
        System.out.println(parameters.getRow().getFKEY());
        throw new RuntimeException();
    }

    @WebMethod(operationName = "testMethod", action = "urn:testMethod")
    @WebResult(name = "testMethodOutMsg", targetNamespace = "http://localhost:8080/jaxws/services/OrgsynchPortType", partName = "parameters")
    @Override
    public TestMethodOutMsg testMethod(TestMethodInMsg parameters) {
        TestMethodOutMsg outMsg = new TestMethodOutMsg();
        outMsg.setArgument(parameters.getArgument() + " success");
        return outMsg;
    }
}
