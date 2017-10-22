
package com.ccwl.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ccwl.webservice package. 
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

    private final static QName _AddGpsImpl_QNAME = new QName("http://webservice.ccwl.com/", "addGpsImpl");
    private final static QName _AddGpsImplResponse_QNAME = new QName("http://webservice.ccwl.com/", "addGpsImplResponse");
    private final static QName _AddGpssImpl_QNAME = new QName("http://webservice.ccwl.com/", "addGpssImpl");
    private final static QName _AddGpssImplResponse_QNAME = new QName("http://webservice.ccwl.com/", "addGpssImplResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ccwl.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddGpssImplResponse }
     * 
     */
    public AddGpssImplResponse createAddGpssImplResponse() {
        return new AddGpssImplResponse();
    }

    /**
     * Create an instance of {@link AddGpsImpl }
     * 
     */
    public AddGpsImpl createAddGpsImpl() {
        return new AddGpsImpl();
    }

    /**
     * Create an instance of {@link AddGpsImplResponse }
     * 
     */
    public AddGpsImplResponse createAddGpsImplResponse() {
        return new AddGpsImplResponse();
    }

    /**
     * Create an instance of {@link AddGpssImpl }
     * 
     */
    public AddGpssImpl createAddGpssImpl() {
        return new AddGpssImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGpsImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ccwl.com/", name = "addGpsImpl")
    public JAXBElement<AddGpsImpl> createAddGpsImpl(AddGpsImpl value) {
        return new JAXBElement<AddGpsImpl>(_AddGpsImpl_QNAME, AddGpsImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGpsImplResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ccwl.com/", name = "addGpsImplResponse")
    public JAXBElement<AddGpsImplResponse> createAddGpsImplResponse(AddGpsImplResponse value) {
        return new JAXBElement<AddGpsImplResponse>(_AddGpsImplResponse_QNAME, AddGpsImplResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGpssImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ccwl.com/", name = "addGpssImpl")
    public JAXBElement<AddGpssImpl> createAddGpssImpl(AddGpssImpl value) {
        return new JAXBElement<AddGpssImpl>(_AddGpssImpl_QNAME, AddGpssImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGpssImplResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ccwl.com/", name = "addGpssImplResponse")
    public JAXBElement<AddGpssImplResponse> createAddGpssImplResponse(AddGpssImplResponse value) {
        return new JAXBElement<AddGpssImplResponse>(_AddGpssImplResponse_QNAME, AddGpssImplResponse.class, null, value);
    }

}
