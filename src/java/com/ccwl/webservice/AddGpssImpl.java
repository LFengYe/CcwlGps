
package com.ccwl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addGpssImpl complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addGpssImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}gpslist" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGpssImpl", propOrder = {
    "gpslist"
})
public class AddGpssImpl {

    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String gpslist;

    /**
     * 获取gpslist属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpslist() {
        return gpslist;
    }

    /**
     * 设置gpslist属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpslist(String value) {
        this.gpslist = value;
    }

}
