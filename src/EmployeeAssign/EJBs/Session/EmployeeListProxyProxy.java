package EmployeeAssign.EJBs.Session;

public class EmployeeListProxyProxy implements EmployeeAssign.EJBs.Session.EmployeeListProxy {
  private String _endpoint = null;
  private EmployeeAssign.EJBs.Session.EmployeeListProxy employeeListProxy = null;
  
  public EmployeeListProxyProxy() {
    _initEmployeeListProxyProxy();
  }
  
  public EmployeeListProxyProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeListProxyProxy();
  }
  
  private void _initEmployeeListProxyProxy() {
    try {
      employeeListProxy = (new EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWSLocator()).getEmployeeListProxyImpPort();
      if (employeeListProxy != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeListProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeListProxy)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeListProxy != null)
      ((javax.xml.rpc.Stub)employeeListProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public EmployeeAssign.EJBs.Session.EmployeeListProxy getEmployeeListProxy() {
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy;
  }
  
  public EmployeeAssign.EJBs.Session.EmployeeBean getEmployee(java.lang.String arg0) throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.getEmployee(arg0);
  }
  
  public EmployeeAssign.EJBs.Session.EmployeeBean getSupervisorDetails(java.lang.String arg0) throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.getSupervisorDetails(arg0);
  }
  
  public EmployeeAssign.EJBs.Session.LocationBean getOfficeLocation(java.lang.String arg0) throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.getOfficeLocation(arg0);
  }
  
  public EmployeeAssign.EJBs.Session.LocationBean[] getLocationsList(java.lang.String arg0) throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.getLocationsList(arg0);
  }
  
  public EmployeeAssign.EJBs.Session.PhonenumberBean getOfficePhonenumber(java.lang.String arg0) throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.getOfficePhonenumber(arg0);
  }
  
  public EmployeeAssign.EJBs.Session.EmployeeBean[] search(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.search(arg0, arg1);
  }
  
  public EmployeeAssign.EJBs.Session.EmployeeBean[] getAllEmployees() throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.getAllEmployees();
  }
  
  public EmployeeAssign.EJBs.Session.PhonenumberBean[] getPhonenumbersList(java.lang.String arg0) throws java.rmi.RemoteException{
    if (employeeListProxy == null)
      _initEmployeeListProxyProxy();
    return employeeListProxy.getPhonenumbersList(arg0);
  }
  
  
}