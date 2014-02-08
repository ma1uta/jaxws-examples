
package org.sav.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="row">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MDMID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Ruk_MDM" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Ruk" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CodeUpPodr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NameFull">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NameShort" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TypePodr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VidPodr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OrganizationUnitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TechnicalInfo_ModificationDateTime" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                         &lt;pattern value="[0-9]{2}/[0-9]{2}/[0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlRootElement(name = "OrgStructure_Request_MT")
public class OrgStructureRequestMT {

    @XmlElement(required = true)
    protected OrgStructureRequestMT.Row row;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link OrgStructureRequestMT.Row }
     *     
     */
    public OrgStructureRequestMT.Row getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgStructureRequestMT.Row }
     *     
     */
    public void setRow(OrgStructureRequestMT.Row value) {
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
     *         &lt;element name="MDMID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Ruk_MDM" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Ruk" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CodeUpPodr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NameFull">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NameShort" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TypePodr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VidPodr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OrganizationUnitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TechnicalInfo_ModificationDateTime" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *               &lt;pattern value="[0-9]{2}/[0-9]{2}/[0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "mdmid",
        "fkey",
        "rukMDM",
        "ruk",
        "codeUpPodr",
        "nameFull",
        "nameShort",
        "typePodr",
        "vidPodr",
        "status",
        "organizationUnitID",
        "technicalInfoModificationDateTime"
    })
    public static class Row {

        @XmlElement(name = "MDMID", required = true)
        protected String mdmid;
        @XmlElement(name = "FKEY")
        protected String fkey;
        @XmlElement(name = "Ruk_MDM")
        protected String rukMDM;
        @XmlElement(name = "Ruk")
        protected String ruk;
        @XmlElement(name = "CodeUpPodr", required = true)
        protected String codeUpPodr;
        @XmlElement(name = "NameFull", required = true)
        protected String nameFull;
        @XmlElement(name = "NameShort")
        protected String nameShort;
        @XmlElement(name = "TypePodr")
        protected String typePodr;
        @XmlElement(name = "VidPodr")
        protected String vidPodr;
        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "OrganizationUnitID")
        protected String organizationUnitID;
        @XmlElement(name = "TechnicalInfo_ModificationDateTime")
        protected XMLGregorianCalendar technicalInfoModificationDateTime;

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
         * Gets the value of the rukMDM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRukMDM() {
            return rukMDM;
        }

        /**
         * Sets the value of the rukMDM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRukMDM(String value) {
            this.rukMDM = value;
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
         * Gets the value of the codeUpPodr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeUpPodr() {
            return codeUpPodr;
        }

        /**
         * Sets the value of the codeUpPodr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeUpPodr(String value) {
            this.codeUpPodr = value;
        }

        /**
         * Gets the value of the nameFull property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameFull() {
            return nameFull;
        }

        /**
         * Sets the value of the nameFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameFull(String value) {
            this.nameFull = value;
        }

        /**
         * Gets the value of the nameShort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameShort() {
            return nameShort;
        }

        /**
         * Sets the value of the nameShort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameShort(String value) {
            this.nameShort = value;
        }

        /**
         * Gets the value of the typePodr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypePodr() {
            return typePodr;
        }

        /**
         * Sets the value of the typePodr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypePodr(String value) {
            this.typePodr = value;
        }

        /**
         * Gets the value of the vidPodr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVidPodr() {
            return vidPodr;
        }

        /**
         * Sets the value of the vidPodr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVidPodr(String value) {
            this.vidPodr = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the organizationUnitID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationUnitID() {
            return organizationUnitID;
        }

        /**
         * Sets the value of the organizationUnitID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationUnitID(String value) {
            this.organizationUnitID = value;
        }

        /**
         * Gets the value of the technicalInfoModificationDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTechnicalInfoModificationDateTime() {
            return technicalInfoModificationDateTime;
        }

        /**
         * Sets the value of the technicalInfoModificationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTechnicalInfoModificationDateTime(XMLGregorianCalendar value) {
            this.technicalInfoModificationDateTime = value;
        }

    }

}
