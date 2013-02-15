package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class DescribeMobileViewSortOrder implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeMobileViewSortOrder() {
  }
    
  
  /**
   * element  : ascending of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ascending__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","ascending","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean ascending__is_set = false;

  private boolean ascending;

  public boolean getAscending() {
    return ascending;
  }

  

  public boolean isAscending() {
    return ascending;
  }

  

  public void setAscending(boolean ascending) {
    this.ascending = ascending;
    ascending__is_set = true;
  }
  
  /**
   * element  : field of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean field__is_set = false;

  private java.lang.String field;

  public java.lang.String getField() {
    return field;
  }

  

  public void setField(java.lang.String field) {
    this.field = field;
    field__is_set = true;
  }
  
  /**
   * element  : order of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo order__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","order","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean order__is_set = false;

  private int order;

  public int getOrder() {
    return order;
  }

  

  public void setOrder(int order) {
    this.order = order;
    order__is_set = true;
  }
  
  /**
   * element  : viewId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo viewId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","viewId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean viewId__is_set = false;

  private java.lang.String viewId;

  public java.lang.String getViewId() {
    return viewId;
  }

  

  public void setViewId(java.lang.String viewId) {
    this.viewId = viewId;
    viewId__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, ascending__typeInfo, ascending, ascending__is_set);
    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);
    __typeMapper.writeInt(__out, order__typeInfo, order, order__is_set);
    __typeMapper.writeString(__out, viewId__typeInfo, viewId, viewId__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, ascending__typeInfo)) {
      setAscending((boolean)__typeMapper.readBoolean(__in, ascending__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, field__typeInfo)) {
      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, order__typeInfo)) {
      setOrder((int)__typeMapper.readInt(__in, order__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, viewId__typeInfo)) {
      setViewId((java.lang.String)__typeMapper.readString(__in, viewId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeMobileViewSortOrder ");
    
    sb.append(" ascending=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ascending)+"'\n");
    sb.append(" field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");
    sb.append(" order=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(order)+"'\n");
    sb.append(" viewId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(viewId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}