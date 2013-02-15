package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class OfflineLink implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public OfflineLink() {
  }
    
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : openType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo openType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","openType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean openType__is_set = false;

  private java.lang.String openType;

  public java.lang.String getOpenType() {
    return openType;
  }

  

  public void setOpenType(java.lang.String openType) {
    this.openType = openType;
    openType__is_set = true;
  }
  
  /**
   * element  : position of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo position__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","position","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean position__is_set = false;

  private java.lang.String position;

  public java.lang.String getPosition() {
    return position;
  }

  

  public void setPosition(java.lang.String position) {
    this.position = position;
    position__is_set = true;
  }
  
  /**
   * element  : properties of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo properties__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","properties","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean properties__is_set = false;

  private java.lang.String properties;

  public java.lang.String getProperties() {
    return properties;
  }

  

  public void setProperties(java.lang.String properties) {
    this.properties = properties;
    properties__is_set = true;
  }
  
  /**
   * element  : url of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo url__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","url","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean url__is_set = false;

  private java.lang.String url;

  public java.lang.String getUrl() {
    return url;
  }

  

  public void setUrl(java.lang.String url) {
    this.url = url;
    url__is_set = true;
  }
  
  /**
   * element  : x of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo x__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","x","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean x__is_set = false;

  private int x;

  public int getX() {
    return x;
  }

  

  public void setX(int x) {
    this.x = x;
    x__is_set = true;
  }
  
  /**
   * element  : y of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo y__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","y","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean y__is_set = false;

  private int y;

  public int getY() {
    return y;
  }

  

  public void setY(int y) {
    this.y = y;
    y__is_set = true;
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
   
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeString(__out, openType__typeInfo, openType, openType__is_set);
    __typeMapper.writeString(__out, position__typeInfo, position, position__is_set);
    __typeMapper.writeString(__out, properties__typeInfo, properties, properties__is_set);
    __typeMapper.writeString(__out, url__typeInfo, url, url__is_set);
    __typeMapper.writeInt(__out, x__typeInfo, x, x__is_set);
    __typeMapper.writeInt(__out, y__typeInfo, y, y__is_set);
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
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, openType__typeInfo)) {
      setOpenType((java.lang.String)__typeMapper.readString(__in, openType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, position__typeInfo)) {
      setPosition((java.lang.String)__typeMapper.readString(__in, position__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, properties__typeInfo)) {
      setProperties((java.lang.String)__typeMapper.readString(__in, properties__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, url__typeInfo)) {
      setUrl((java.lang.String)__typeMapper.readString(__in, url__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, x__typeInfo)) {
      setX((int)__typeMapper.readInt(__in, x__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, y__typeInfo)) {
      setY((int)__typeMapper.readInt(__in, y__typeInfo, int.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[OfflineLink ");
    
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" openType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(openType)+"'\n");
    sb.append(" position=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(position)+"'\n");
    sb.append(" properties=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(properties)+"'\n");
    sb.append(" url=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(url)+"'\n");
    sb.append(" x=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(x)+"'\n");
    sb.append(" y=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(y)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}