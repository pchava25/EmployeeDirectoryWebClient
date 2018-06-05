/**
 * EmployeeListProxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EmployeeAssign.EJBs.Session;

public interface EmployeeListProxy extends java.rmi.Remote {
    public EmployeeAssign.EJBs.Session.EmployeeBean getEmployee(java.lang.String arg0) throws java.rmi.RemoteException;
    public EmployeeAssign.EJBs.Session.EmployeeBean getSupervisorDetails(java.lang.String arg0) throws java.rmi.RemoteException;
    public EmployeeAssign.EJBs.Session.LocationBean getOfficeLocation(java.lang.String arg0) throws java.rmi.RemoteException;
    public EmployeeAssign.EJBs.Session.LocationBean[] getLocationsList(java.lang.String arg0) throws java.rmi.RemoteException;
    public EmployeeAssign.EJBs.Session.PhonenumberBean getOfficePhonenumber(java.lang.String arg0) throws java.rmi.RemoteException;
    public EmployeeAssign.EJBs.Session.EmployeeBean[] search(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public EmployeeAssign.EJBs.Session.EmployeeBean[] getAllEmployees() throws java.rmi.RemoteException;
    public EmployeeAssign.EJBs.Session.PhonenumberBean[] getPhonenumbersList(java.lang.String arg0) throws java.rmi.RemoteException;
}
