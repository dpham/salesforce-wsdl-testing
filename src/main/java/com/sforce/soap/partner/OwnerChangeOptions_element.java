package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class OwnerChangeOptions_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public OwnerChangeOptions_element() {
  }
    
  
  /**
   * element  : transferAttachments of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo transferAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","transferAttachments","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean transferAttachments__is_set = false;

  private boolean transferAttachments;

  public boolean getTransferAttachments() {
    return transferAttachments;
  }

  

  public boolean isTransferAttachments() {
    return transferAttachments;
  }

  

  public void setTransferAttachments(boolean transferAttachments) {
    this.transferAttachments = transferAttachments;
    transferAttachments__is_set = true;
  }
  
  /**
   * element  : transferOpenActivities of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo transferOpenActivities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","transferOpenActivities","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean transferOpenActivities__is_set = false;

  private boolean transferOpenActivities;

  public boolean getTransferOpenActivities() {
    return transferOpenActivities;
  }

  

  public boolean isTransferOpenActivities() {
    return transferOpenActivities;
  }

  

  public void setTransferOpenActivities(boolean transferOpenActivities) {
    this.transferOpenActivities = transferOpenActivities;
    transferOpenActivities__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeBoolean(__out, transferAttachments__typeInfo, transferAttachments, transferAttachments__is_set);
    __typeMapper.writeBoolean(__out, transferOpenActivities__typeInfo, transferOpenActivities, transferOpenActivities__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, transferAttachments__typeInfo)) {
      setTransferAttachments((boolean)__typeMapper.readBoolean(__in, transferAttachments__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, transferOpenActivities__typeInfo)) {
      setTransferOpenActivities((boolean)__typeMapper.readBoolean(__in, transferOpenActivities__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[OwnerChangeOptions_element ");
    sb.append(super.toString());
    sb.append(" transferAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(transferAttachments)+"'\n");
    sb.append(" transferOpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(transferOpenActivities)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}