/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.client;

import com.ccwl.webservice.control.CcwlGpsImplService;
import javax.jws.WebService;

/**
 *
 * @author LFeng
 */
@WebService(serviceName = "CcwlGpsImplService", portName = "CcwlGpsImplPort", endpointInterface = "com.ccwl.webservice.control.CcwlGps", targetNamespace = "http://control.webservice.ccwl.com/", wsdlLocation = "WEB-INF/wsdl/CcwlGpsController/10.2.9.17/ccwl/webservices/gpsservice.wsdl")
public class CcwlGpsController {

    public java.lang.String addGpsImpl(java.lang.String supplierno, java.lang.String pwd, java.lang.String carno, java.lang.String gpsno, java.lang.String longitude, java.lang.String latitude, java.lang.String stime, java.lang.String address, java.lang.String speed, java.lang.String direction) {
        return new CcwlGpsImplService().getCcwlGpsImplPort().addGpsImpl(supplierno, pwd, carno, gpsno, longitude, latitude, stime, address, speed, direction);
    }

    public java.lang.String addGpssImpl(java.lang.String gpslist) {
        return new CcwlGpsImplService().getCcwlGpsImplPort().addGpssImpl(gpslist);
    }
    
}
