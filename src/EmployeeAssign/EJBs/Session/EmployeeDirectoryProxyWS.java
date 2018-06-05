/**
 * EmployeeDirectoryProxyWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EmployeeAssign.EJBs.Session;

public interface EmployeeDirectoryProxyWS extends javax.xml.rpc.Service {
    public java.lang.String getEmployeeListProxyImpPortAddress();

    public EmployeeAssign.EJBs.Session.EmployeeListProxy getEmployeeListProxyImpPort() throws javax.xml.rpc.ServiceException;

    public EmployeeAssign.EJBs.Session.EmployeeListProxy getEmployeeListProxyImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
