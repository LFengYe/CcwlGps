
package com.ccwl.webservice.control;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ccwl.webservice.control package. 
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

    private final static QName _Carno_QNAME = new QName("http://control.webservice.ccwl.com/", "carno");
    private final static QName _Direction_QNAME = new QName("http://control.webservice.ccwl.com/", "direction");
    private final static QName _Longitude_QNAME = new QName("http://control.webservice.ccwl.com/", "longitude");
    private final static QName _Pwd_QNAME = new QName("http://control.webservice.ccwl.com/", "pwd");
    private final static QName _Address_QNAME = new QName("http://control.webservice.ccwl.com/", "address");
    private final static QName _Latitude_QNAME = new QName("http://control.webservice.ccwl.com/", "latitude");
    private final static QName _Gpsno_QNAME = new QName("http://control.webservice.ccwl.com/", "gpsno");
    private final static QName _Stime_QNAME = new QName("http://control.webservice.ccwl.com/", "stime");
    private final static QName _Supplierno_QNAME = new QName("http://control.webservice.ccwl.com/", "supplierno");
    private final static QName _Gpslist_QNAME = new QName("http://control.webservice.ccwl.com/", "gpslist");
    private final static QName _Speed_QNAME = new QName("http://control.webservice.ccwl.com/", "speed");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ccwl.webservice.control
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "carno")
    public JAXBElement<String> createCarno(String value) {
        return new JAXBElement<String>(_Carno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "direction")
    public JAXBElement<String> createDirection(String value) {
        return new JAXBElement<String>(_Direction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "longitude")
    public JAXBElement<String> createLongitude(String value) {
        return new JAXBElement<String>(_Longitude_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "pwd")
    public JAXBElement<String> createPwd(String value) {
        return new JAXBElement<String>(_Pwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "address")
    public JAXBElement<String> createAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "latitude")
    public JAXBElement<String> createLatitude(String value) {
        return new JAXBElement<String>(_Latitude_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "gpsno")
    public JAXBElement<String> createGpsno(String value) {
        return new JAXBElement<String>(_Gpsno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "stime")
    public JAXBElement<String> createStime(String value) {
        return new JAXBElement<String>(_Stime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "supplierno")
    public JAXBElement<String> createSupplierno(String value) {
        return new JAXBElement<String>(_Supplierno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "gpslist")
    public JAXBElement<String> createGpslist(String value) {
        return new JAXBElement<String>(_Gpslist_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.webservice.ccwl.com/", name = "speed")
    public JAXBElement<String> createSpeed(String value) {
        return new JAXBElement<String>(_Speed_QNAME, String.class, null, value);
    }

}
