package org.sav.jaxws.impl;

import org.sav.jaxws.EmployeeDCTMRequestMT;
import org.sav.jaxws.ObjectFactory;
import org.sav.jaxws.OrgStructureRequestMT;
import org.sav.jaxws.OrgsynchPortType;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "OrgsynchPortType", targetNamespace = "http://service.orgsynch.documentum.croc.com/OrgsynchService/")
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
}
