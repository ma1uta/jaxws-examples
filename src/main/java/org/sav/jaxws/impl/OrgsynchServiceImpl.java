package org.sav.jaxws.impl;

import org.sav.jaxws.EmployeeDCTMRequestMT;
import org.sav.jaxws.ObjectFactory;
import org.sav.jaxws.OrgStructureRequestMT;
import org.sav.jaxws.OrgsynchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.HandlerChain;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "OrgsynchService", targetNamespace = "http://localhost:8080/jaxws/services/OrgsynchService")
@XmlSeeAlso({
                    ObjectFactory.class
            })
@HandlerChain(file = "handler-chain.xml")
public class OrgsynchServiceImpl implements OrgsynchService {

    public static final Logger LOGGER = LoggerFactory.getLogger(OrgsynchServiceImpl.class);

    @WebMethod(operationName = "UpdateEmployee", action = "urn:UpdateEmployee")
    @Oneway
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Override
    public void updateEmployee(EmployeeDCTMRequestMT parameters) {
        LOGGER.info("invoke updateEmployee");
    }

    @WebMethod(operationName = "UpdateDepartment", action = "urn:UpdateDepartment")
    @Oneway
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Override
    public void updateDepartment(OrgStructureRequestMT parameters) {
        LOGGER.info("invoke updateDepartment");
    }

    @WebMethod(action = "urn:testMethod")
    @RequestWrapper(localName = "testMethod", targetNamespace = "http://localhost:8080/jaxws/services/OrgsynchService",
                    className = "org.sav.jaxws.TestMethod")
    @ResponseWrapper(localName = "testMethodResponse",
                     targetNamespace = "http://localhost:8080/jaxws/services/OrgsynchService",
                     className = "org.sav.jaxws.TestMethodResponse")
    @Override
    public void testMethod(
            @WebParam(name = "argument", targetNamespace = "", mode = WebParam.Mode.INOUT) Holder<String> argument) {
        argument.value = argument.value + " success";
    }
}
