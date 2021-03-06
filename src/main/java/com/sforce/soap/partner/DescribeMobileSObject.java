package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class DescribeMobileSObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeMobileSObject() {
  }
    
  
  /**
   * element  : iconUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo iconUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","iconUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean iconUrl__is_set = false;

  private java.lang.String iconUrl;

  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  

  public void setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    iconUrl__is_set = true;
  }
  
  /**
   * element  : layout of type {urn:partner.soap.sforce.com}DescribeLayoutResult
   * java type: com.sforce.soap.partner.DescribeLayoutResult
   */
  private static final com.sforce.ws.bind.TypeInfo layout__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","layout","urn:partner.soap.sforce.com","DescribeLayoutResult",0,1,true);

  private boolean layout__is_set = false;

  private com.sforce.soap.partner.DescribeLayoutResult layout;

  public com.sforce.soap.partner.DescribeLayoutResult getLayout() {
    return layout;
  }

  

  public void setLayout(com.sforce.soap.partner.DescribeLayoutResult layout) {
    this.layout = layout;
    layout__is_set = true;
  }
  
  /**
   * element  : searchLayout of type {urn:partner.soap.sforce.com}DescribeSearchLayoutResult
   * java type: com.sforce.soap.partner.DescribeSearchLayoutResult
   */
  private static final com.sforce.ws.bind.TypeInfo searchLayout__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","searchLayout","urn:partner.soap.sforce.com","DescribeSearchLayoutResult",0,1,true);

  private boolean searchLayout__is_set = false;

  private com.sforce.soap.partner.DescribeSearchLayoutResult searchLayout;

  public com.sforce.soap.partner.DescribeSearchLayoutResult getSearchLayout() {
    return searchLayout;
  }

  

  public void setSearchLayout(com.sforce.soap.partner.DescribeSearchLayoutResult searchLayout) {
    this.searchLayout = searchLayout;
    searchLayout__is_set = true;
  }
  
  /**
   * element  : sobject of type {urn:partner.soap.sforce.com}DescribeSObjectResult
   * java type: com.sforce.soap.partner.DescribeSObjectResult
   */
  private static final com.sforce.ws.bind.TypeInfo sobject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sobject","urn:partner.soap.sforce.com","DescribeSObjectResult",1,1,true);

  private boolean sobject__is_set = false;

  private com.sforce.soap.partner.DescribeSObjectResult sobject;

  public com.sforce.soap.partner.DescribeSObjectResult getSobject() {
    return sobject;
  }

  

  public void setSobject(com.sforce.soap.partner.DescribeSObjectResult sobject) {
    this.sobject = sobject;
    sobject__is_set = true;
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
   
    __typeMapper.writeString(__out, iconUrl__typeInfo, iconUrl, iconUrl__is_set);
    __typeMapper.writeObject(__out, layout__typeInfo, layout, layout__is_set);
    __typeMapper.writeObject(__out, searchLayout__typeInfo, searchLayout, searchLayout__is_set);
    __typeMapper.writeObject(__out, sobject__typeInfo, sobject, sobject__is_set);
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
    if (__typeMapper.isElement(__in, iconUrl__typeInfo)) {
      setIconUrl((java.lang.String)__typeMapper.readString(__in, iconUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, layout__typeInfo)) {
      setLayout((com.sforce.soap.partner.DescribeLayoutResult)__typeMapper.readObject(__in, layout__typeInfo, com.sforce.soap.partner.DescribeLayoutResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, searchLayout__typeInfo)) {
      setSearchLayout((com.sforce.soap.partner.DescribeSearchLayoutResult)__typeMapper.readObject(__in, searchLayout__typeInfo, com.sforce.soap.partner.DescribeSearchLayoutResult.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sobject__typeInfo)) {
      setSobject((com.sforce.soap.partner.DescribeSObjectResult)__typeMapper.readObject(__in, sobject__typeInfo, com.sforce.soap.partner.DescribeSObjectResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeMobileSObject ");
    
    sb.append(" iconUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(iconUrl)+"'\n");
    sb.append(" layout=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layout)+"'\n");
    sb.append(" searchLayout=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(searchLayout)+"'\n");
    sb.append(" sobject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobject)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}