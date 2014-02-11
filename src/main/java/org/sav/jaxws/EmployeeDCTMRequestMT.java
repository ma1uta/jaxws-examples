
package org.sav.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Справочник персонала
 *                 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="row">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Login">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Domain">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MDMID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ISDELETED" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="KontL_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KontL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Ruk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TabelNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AdditionalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FirstName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MiddleName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DateBorn" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]"/>
 *                         &lt;pattern value="[0-9][0-9]:[0-9][0-9]:[0-9][0-9]"/>
 *                         &lt;pattern value="GMT"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgId_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OrgNameFull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgIdFunk_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgIdFunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Dolg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ModificatorDolg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DolgFunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModificatorDolgFunc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Address1_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Office1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Address2_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Office2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Address3_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Office3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneOrg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneOrg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneOrg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneHome1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneHome2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneHome3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneMobile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneMobile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneMobile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Fax1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Fax2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Fax3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneInt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneInt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneInt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JobFunkPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JobPrioirity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "Employee_DCTM_Request_MT")
public class EmployeeDCTMRequestMT {

    @XmlElement(required = true)
    protected EmployeeDCTMRequestMT.Row row;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDCTMRequestMT.Row }
     *     
     */
    public EmployeeDCTMRequestMT.Row getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDCTMRequestMT.Row }
     *     
     */
    public void setRow(EmployeeDCTMRequestMT.Row value) {
        this.row = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Login">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="80"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Domain">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MDMID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ISDELETED" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="KontL_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KontL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Ruk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TabelNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AdditionalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LastName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FirstName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MiddleName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DateBorn" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]"/>
     *               &lt;pattern value="[0-9][0-9]:[0-9][0-9]:[0-9][0-9]"/>
     *               &lt;pattern value="GMT"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgId_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OrgNameFull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgIdFunk_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgIdFunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Dolg" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ModificatorDolg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DolgFunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModificatorDolgFunc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Address1_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Office1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Address2_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Office2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Address3_MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Office3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneOrg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneOrg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneOrg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneHome1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneHome2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneHome3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneMobile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneMobile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneMobile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Fax1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Fax2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Fax3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneInt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneInt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhoneInt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JobFunkPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JobPrioirity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "login",
        "domain",
        "mdmid",
        "fkey",
        "isdeleted",
        "kontLMDM",
        "kontL",
        "ruk",
        "tabelNumber",
        "additionalNumber",
        "lastName",
        "firstName",
        "middleName",
        "dateBorn",
        "address",
        "orgIdMDM",
        "orgId",
        "orgNameFull",
        "orgIdFunkMDM",
        "orgIdFunk",
        "dolg",
        "modificatorDolg",
        "dolgFunk",
        "modificatorDolgFunc",
        "address1MDM",
        "address1",
        "office1",
        "address2MDM",
        "address2",
        "office2",
        "address3MDM",
        "address3",
        "office3",
        "phoneOrg1",
        "phoneOrg2",
        "phoneOrg3",
        "phoneHome1",
        "phoneHome2",
        "phoneHome3",
        "phoneMobile1",
        "phoneMobile2",
        "phoneMobile3",
        "fax1",
        "fax2",
        "fax3",
        "phoneInt1",
        "phoneInt2",
        "phoneInt3",
        "eMail",
        "activity",
        "jobFunkPriority",
        "jobPrioirity"
    })
    public static class Row {

        @XmlElement(name = "Login", required = true)
        protected String login;
        @XmlElement(name = "Domain", required = true)
        protected String domain;
        @XmlElement(name = "MDMID", required = true)
        protected String mdmid;
        @XmlElement(name = "FKEY")
        protected String fkey;
        @XmlElement(name = "ISDELETED")
        protected boolean isdeleted;
        @XmlElement(name = "KontL_MDM")
        protected String kontLMDM;
        @XmlElement(name = "KontL")
        protected String kontL;
        @XmlElement(name = "Ruk")
        protected String ruk;
        @XmlElement(name = "TabelNumber")
        protected String tabelNumber;
        @XmlElement(name = "AdditionalNumber")
        protected String additionalNumber;
        @XmlElement(name = "LastName", required = true)
        protected String lastName;
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        @XmlElement(name = "MiddleName", required = true)
        protected String middleName;
        @XmlElement(name = "DateBorn")
        protected String dateBorn;
        @XmlElement(name = "Address")
        protected String address;
        @XmlElement(name = "OrgId_MDM")
        protected String orgIdMDM;
        @XmlElement(name = "OrgId", required = true)
        protected String orgId;
        @XmlElement(name = "OrgNameFull")
        protected String orgNameFull;
        @XmlElement(name = "OrgIdFunk_MDM")
        protected String orgIdFunkMDM;
        @XmlElement(name = "OrgIdFunk")
        protected String orgIdFunk;
        @XmlElement(name = "Dolg", required = true)
        protected String dolg;
        @XmlElement(name = "ModificatorDolg")
        protected String modificatorDolg;
        @XmlElement(name = "DolgFunk")
        protected String dolgFunk;
        @XmlElement(name = "ModificatorDolgFunc")
        protected String modificatorDolgFunc;
        @XmlElement(name = "Address1_MDM")
        protected String address1MDM;
        @XmlElement(name = "Address1")
        protected String address1;
        @XmlElement(name = "Office1")
        protected String office1;
        @XmlElement(name = "Address2_MDM")
        protected String address2MDM;
        @XmlElement(name = "Address2")
        protected String address2;
        @XmlElement(name = "Office2")
        protected String office2;
        @XmlElement(name = "Address3_MDM")
        protected String address3MDM;
        @XmlElement(name = "Address3")
        protected String address3;
        @XmlElement(name = "Office3")
        protected String office3;
        @XmlElement(name = "PhoneOrg1")
        protected String phoneOrg1;
        @XmlElement(name = "PhoneOrg2")
        protected String phoneOrg2;
        @XmlElement(name = "PhoneOrg3")
        protected String phoneOrg3;
        @XmlElement(name = "PhoneHome1")
        protected String phoneHome1;
        @XmlElement(name = "PhoneHome2")
        protected String phoneHome2;
        @XmlElement(name = "PhoneHome3")
        protected String phoneHome3;
        @XmlElement(name = "PhoneMobile1")
        protected String phoneMobile1;
        @XmlElement(name = "PhoneMobile2")
        protected String phoneMobile2;
        @XmlElement(name = "PhoneMobile3")
        protected String phoneMobile3;
        @XmlElement(name = "Fax1")
        protected String fax1;
        @XmlElement(name = "Fax2")
        protected String fax2;
        @XmlElement(name = "Fax3")
        protected String fax3;
        @XmlElement(name = "PhoneInt1")
        protected String phoneInt1;
        @XmlElement(name = "PhoneInt2")
        protected String phoneInt2;
        @XmlElement(name = "PhoneInt3")
        protected String phoneInt3;
        @XmlElement(name = "EMail", required = true)
        protected String eMail;
        @XmlElement(name = "Activity")
        protected String activity;
        @XmlElement(name = "JobFunkPriority")
        protected String jobFunkPriority;
        @XmlElement(name = "JobPrioirity")
        protected String jobPrioirity;

        /**
         * Gets the value of the login property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogin() {
            return login;
        }

        /**
         * Sets the value of the login property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogin(String value) {
            this.login = value;
        }

        /**
         * Gets the value of the domain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return domain;
        }

        /**
         * Sets the value of the domain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.domain = value;
        }

        /**
         * Gets the value of the mdmid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDMID() {
            return mdmid;
        }

        /**
         * Sets the value of the mdmid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDMID(String value) {
            this.mdmid = value;
        }

        /**
         * Gets the value of the fkey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFKEY() {
            return fkey;
        }

        /**
         * Sets the value of the fkey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFKEY(String value) {
            this.fkey = value;
        }

        /**
         * Gets the value of the isdeleted property.
         * 
         */
        public boolean isISDELETED() {
            return isdeleted;
        }

        /**
         * Sets the value of the isdeleted property.
         * 
         */
        public void setISDELETED(boolean value) {
            this.isdeleted = value;
        }

        /**
         * Gets the value of the kontLMDM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKontLMDM() {
            return kontLMDM;
        }

        /**
         * Sets the value of the kontLMDM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKontLMDM(String value) {
            this.kontLMDM = value;
        }

        /**
         * Gets the value of the kontL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKontL() {
            return kontL;
        }

        /**
         * Sets the value of the kontL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKontL(String value) {
            this.kontL = value;
        }

        /**
         * Gets the value of the ruk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuk() {
            return ruk;
        }

        /**
         * Sets the value of the ruk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuk(String value) {
            this.ruk = value;
        }

        /**
         * Gets the value of the tabelNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTabelNumber() {
            return tabelNumber;
        }

        /**
         * Sets the value of the tabelNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTabelNumber(String value) {
            this.tabelNumber = value;
        }

        /**
         * Gets the value of the additionalNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalNumber() {
            return additionalNumber;
        }

        /**
         * Sets the value of the additionalNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalNumber(String value) {
            this.additionalNumber = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Gets the value of the dateBorn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateBorn() {
            return dateBorn;
        }

        /**
         * Sets the value of the dateBorn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateBorn(String value) {
            this.dateBorn = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the orgIdMDM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgIdMDM() {
            return orgIdMDM;
        }

        /**
         * Sets the value of the orgIdMDM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgIdMDM(String value) {
            this.orgIdMDM = value;
        }

        /**
         * Gets the value of the orgId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgId() {
            return orgId;
        }

        /**
         * Sets the value of the orgId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgId(String value) {
            this.orgId = value;
        }

        /**
         * Gets the value of the orgNameFull property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgNameFull() {
            return orgNameFull;
        }

        /**
         * Sets the value of the orgNameFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgNameFull(String value) {
            this.orgNameFull = value;
        }

        /**
         * Gets the value of the orgIdFunkMDM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgIdFunkMDM() {
            return orgIdFunkMDM;
        }

        /**
         * Sets the value of the orgIdFunkMDM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgIdFunkMDM(String value) {
            this.orgIdFunkMDM = value;
        }

        /**
         * Gets the value of the orgIdFunk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgIdFunk() {
            return orgIdFunk;
        }

        /**
         * Sets the value of the orgIdFunk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgIdFunk(String value) {
            this.orgIdFunk = value;
        }

        /**
         * Gets the value of the dolg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDolg() {
            return dolg;
        }

        /**
         * Sets the value of the dolg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDolg(String value) {
            this.dolg = value;
        }

        /**
         * Gets the value of the modificatorDolg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModificatorDolg() {
            return modificatorDolg;
        }

        /**
         * Sets the value of the modificatorDolg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModificatorDolg(String value) {
            this.modificatorDolg = value;
        }

        /**
         * Gets the value of the dolgFunk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDolgFunk() {
            return dolgFunk;
        }

        /**
         * Sets the value of the dolgFunk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDolgFunk(String value) {
            this.dolgFunk = value;
        }

        /**
         * Gets the value of the modificatorDolgFunc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModificatorDolgFunc() {
            return modificatorDolgFunc;
        }

        /**
         * Sets the value of the modificatorDolgFunc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModificatorDolgFunc(String value) {
            this.modificatorDolgFunc = value;
        }

        /**
         * Gets the value of the address1MDM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress1MDM() {
            return address1MDM;
        }

        /**
         * Sets the value of the address1MDM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress1MDM(String value) {
            this.address1MDM = value;
        }

        /**
         * Gets the value of the address1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress1() {
            return address1;
        }

        /**
         * Sets the value of the address1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress1(String value) {
            this.address1 = value;
        }

        /**
         * Gets the value of the office1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffice1() {
            return office1;
        }

        /**
         * Sets the value of the office1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffice1(String value) {
            this.office1 = value;
        }

        /**
         * Gets the value of the address2MDM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress2MDM() {
            return address2MDM;
        }

        /**
         * Sets the value of the address2MDM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress2MDM(String value) {
            this.address2MDM = value;
        }

        /**
         * Gets the value of the address2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress2() {
            return address2;
        }

        /**
         * Sets the value of the address2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress2(String value) {
            this.address2 = value;
        }

        /**
         * Gets the value of the office2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffice2() {
            return office2;
        }

        /**
         * Sets the value of the office2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffice2(String value) {
            this.office2 = value;
        }

        /**
         * Gets the value of the address3MDM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress3MDM() {
            return address3MDM;
        }

        /**
         * Sets the value of the address3MDM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress3MDM(String value) {
            this.address3MDM = value;
        }

        /**
         * Gets the value of the address3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress3() {
            return address3;
        }

        /**
         * Sets the value of the address3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress3(String value) {
            this.address3 = value;
        }

        /**
         * Gets the value of the office3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffice3() {
            return office3;
        }

        /**
         * Sets the value of the office3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffice3(String value) {
            this.office3 = value;
        }

        /**
         * Gets the value of the phoneOrg1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneOrg1() {
            return phoneOrg1;
        }

        /**
         * Sets the value of the phoneOrg1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneOrg1(String value) {
            this.phoneOrg1 = value;
        }

        /**
         * Gets the value of the phoneOrg2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneOrg2() {
            return phoneOrg2;
        }

        /**
         * Sets the value of the phoneOrg2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneOrg2(String value) {
            this.phoneOrg2 = value;
        }

        /**
         * Gets the value of the phoneOrg3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneOrg3() {
            return phoneOrg3;
        }

        /**
         * Sets the value of the phoneOrg3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneOrg3(String value) {
            this.phoneOrg3 = value;
        }

        /**
         * Gets the value of the phoneHome1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneHome1() {
            return phoneHome1;
        }

        /**
         * Sets the value of the phoneHome1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneHome1(String value) {
            this.phoneHome1 = value;
        }

        /**
         * Gets the value of the phoneHome2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneHome2() {
            return phoneHome2;
        }

        /**
         * Sets the value of the phoneHome2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneHome2(String value) {
            this.phoneHome2 = value;
        }

        /**
         * Gets the value of the phoneHome3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneHome3() {
            return phoneHome3;
        }

        /**
         * Sets the value of the phoneHome3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneHome3(String value) {
            this.phoneHome3 = value;
        }

        /**
         * Gets the value of the phoneMobile1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneMobile1() {
            return phoneMobile1;
        }

        /**
         * Sets the value of the phoneMobile1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneMobile1(String value) {
            this.phoneMobile1 = value;
        }

        /**
         * Gets the value of the phoneMobile2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneMobile2() {
            return phoneMobile2;
        }

        /**
         * Sets the value of the phoneMobile2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneMobile2(String value) {
            this.phoneMobile2 = value;
        }

        /**
         * Gets the value of the phoneMobile3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneMobile3() {
            return phoneMobile3;
        }

        /**
         * Sets the value of the phoneMobile3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneMobile3(String value) {
            this.phoneMobile3 = value;
        }

        /**
         * Gets the value of the fax1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax1() {
            return fax1;
        }

        /**
         * Sets the value of the fax1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax1(String value) {
            this.fax1 = value;
        }

        /**
         * Gets the value of the fax2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax2() {
            return fax2;
        }

        /**
         * Sets the value of the fax2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax2(String value) {
            this.fax2 = value;
        }

        /**
         * Gets the value of the fax3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax3() {
            return fax3;
        }

        /**
         * Sets the value of the fax3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax3(String value) {
            this.fax3 = value;
        }

        /**
         * Gets the value of the phoneInt1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneInt1() {
            return phoneInt1;
        }

        /**
         * Sets the value of the phoneInt1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneInt1(String value) {
            this.phoneInt1 = value;
        }

        /**
         * Gets the value of the phoneInt2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneInt2() {
            return phoneInt2;
        }

        /**
         * Sets the value of the phoneInt2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneInt2(String value) {
            this.phoneInt2 = value;
        }

        /**
         * Gets the value of the phoneInt3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneInt3() {
            return phoneInt3;
        }

        /**
         * Sets the value of the phoneInt3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneInt3(String value) {
            this.phoneInt3 = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the activity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivity() {
            return activity;
        }

        /**
         * Sets the value of the activity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivity(String value) {
            this.activity = value;
        }

        /**
         * Gets the value of the jobFunkPriority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobFunkPriority() {
            return jobFunkPriority;
        }

        /**
         * Sets the value of the jobFunkPriority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobFunkPriority(String value) {
            this.jobFunkPriority = value;
        }

        /**
         * Gets the value of the jobPrioirity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobPrioirity() {
            return jobPrioirity;
        }

        /**
         * Sets the value of the jobPrioirity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobPrioirity(String value) {
            this.jobPrioirity = value;
        }

    }

}
