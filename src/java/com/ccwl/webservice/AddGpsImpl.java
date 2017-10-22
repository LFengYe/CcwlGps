
package com.ccwl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addGpsImpl complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addGpsImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}supplierno" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}pwd" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}carno" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}gpsno" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}longitude" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}latitude" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}stime" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}address" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}speed" minOccurs="0"/>
 *         &lt;element ref="{http://control.webservice.ccwl.com/}direction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGpsImpl", propOrder = {
    "supplierno",
    "pwd",
    "carno",
    "gpsno",
    "longitude",
    "latitude",
    "stime",
    "address",
    "speed",
    "direction"
})
public class AddGpsImpl {

    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String supplierno;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String pwd;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String carno;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String gpsno;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String longitude;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String latitude;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String stime;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String address;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String speed;
    @XmlElement(namespace = "http://control.webservice.ccwl.com/")
    protected String direction;

    /**
     * 获取supplierno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierno() {
        return supplierno;
    }

    /**
     * 设置supplierno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierno(String value) {
        this.supplierno = value;
    }

    /**
     * 获取pwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置pwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * 获取carno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarno() {
        return carno;
    }

    /**
     * 设置carno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarno(String value) {
        this.carno = value;
    }

    /**
     * 获取gpsno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsno() {
        return gpsno;
    }

    /**
     * 设置gpsno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsno(String value) {
        this.gpsno = value;
    }

    /**
     * 获取longitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置longitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * 获取latitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置latitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * 获取stime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStime() {
        return stime;
    }

    /**
     * 设置stime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStime(String value) {
        this.stime = value;
    }

    /**
     * 获取address属性的值。
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
     * 设置address属性的值。
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
     * 获取speed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * 设置speed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed(String value) {
        this.speed = value;
    }

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
