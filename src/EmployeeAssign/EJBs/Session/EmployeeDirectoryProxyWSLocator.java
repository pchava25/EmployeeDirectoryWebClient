/**
 * EmployeeDirectoryProxyWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EmployeeAssign.EJBs.Session;

public class EmployeeDirectoryProxyWSLocator extends org.apache.axis.client.Service implements EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWS {

    public EmployeeDirectoryProxyWSLocator() {
    }


    public EmployeeDirectoryProxyWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeDirectoryProxyWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeListProxyImpPort
    private java.lang.String EmployeeListProxyImpPort_address = "http://localhost:8080/EmployeeDirectoryEJB/EmployeeDirectoryProxyWS/EmployeeListProxyImp";

    public java.lang.String getEmployeeListProxyImpPortAddress() {
        return EmployeeListProxyImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeListProxyImpPortWSDDServiceName = "EmployeeListProxyImpPort";

    public java.lang.String getEmployeeListProxyImpPortWSDDServiceName() {
        return EmployeeListProxyImpPortWSDDServiceName;
    }

    public void setEmployeeListProxyImpPortWSDDServiceName(java.lang.String name) {
        EmployeeListProxyImpPortWSDDServiceName = name;
    }

    public EmployeeAssign.EJBs.Session.EmployeeListProxy getEmployeeListProxyImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeListProxyImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeListProxyImpPort(endpoint);
    }

    public EmployeeAssign.EJBs.Session.EmployeeListProxy getEmployeeListProxyImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWSSoapBindingStub _stub = new EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeListProxyImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeListProxyImpPortEndpointAddress(java.lang.String address) {
        EmployeeListProxyImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (EmployeeAssign.EJBs.Session.EmployeeListProxy.class.isAssignableFrom(serviceEndpointInterface)) {
                EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWSSoapBindingStub _stub = new EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWSSoapBindingStub(new java.net.URL(EmployeeListProxyImpPort_address), this);
                _stub.setPortName(getEmployeeListProxyImpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmployeeListProxyImpPort".equals(inputPortName)) {
            return getEmployeeListProxyImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Session.EJBs.EmployeeAssign/", "EmployeeDirectoryProxyWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Session.EJBs.EmployeeAssign/", "EmployeeListProxyImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeListProxyImpPort".equals(portName)) {
            setEmployeeListProxyImpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
