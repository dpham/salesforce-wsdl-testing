package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeGenerator.java. Please do not edit.
 */
public class DescribeEmailSyncSettings implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeEmailSyncSettings() {
  }
    
  
  /**
   * element  : addCase of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo addCase__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","addCase","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean addCase__is_set = false;

  private boolean addCase;

  public boolean getAddCase() {
    return addCase;
  }

  

  public boolean isAddCase() {
    return addCase;
  }

  

  public void setAddCase(boolean addCase) {
    this.addCase = addCase;
    addCase__is_set = true;
  }
  
  /**
   * element  : addEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo addEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","addEmail","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean addEmail__is_set = false;

  private boolean addEmail;

  public boolean getAddEmail() {
    return addEmail;
  }

  

  public boolean isAddEmail() {
    return addEmail;
  }

  

  public void setAddEmail(boolean addEmail) {
    this.addEmail = addEmail;
    addEmail__is_set = true;
  }
  
  /**
   * element  : addEmailAttachment of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo addEmailAttachment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","addEmailAttachment","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean addEmailAttachment__is_set = false;

  private boolean addEmailAttachment;

  public boolean getAddEmailAttachment() {
    return addEmailAttachment;
  }

  

  public boolean isAddEmailAttachment() {
    return addEmailAttachment;
  }

  

  public void setAddEmailAttachment(boolean addEmailAttachment) {
    this.addEmailAttachment = addEmailAttachment;
    addEmailAttachment__is_set = true;
  }
  
  /**
   * element  : advancedSetting of type {urn:partner.soap.sforce.com}EmailSyncAdvancedSetting
   * java type: com.sforce.soap.partner.EmailSyncAdvancedSetting[]
   */
  private static final com.sforce.ws.bind.TypeInfo advancedSetting__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","advancedSetting","urn:partner.soap.sforce.com","EmailSyncAdvancedSetting",0,-1,true);

  private boolean advancedSetting__is_set = false;

  private com.sforce.soap.partner.EmailSyncAdvancedSetting[] advancedSetting = new com.sforce.soap.partner.EmailSyncAdvancedSetting[0];

  public com.sforce.soap.partner.EmailSyncAdvancedSetting[] getAdvancedSetting() {
    return advancedSetting;
  }

  

  public void setAdvancedSetting(com.sforce.soap.partner.EmailSyncAdvancedSetting[] advancedSetting) {
    this.advancedSetting = advancedSetting;
    advancedSetting__is_set = true;
  }
  
  /**
   * element  : attachmentSizeLimit of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo attachmentSizeLimit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","attachmentSizeLimit","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean attachmentSizeLimit__is_set = false;

  private int attachmentSizeLimit;

  public int getAttachmentSizeLimit() {
    return attachmentSizeLimit;
  }

  

  public void setAttachmentSizeLimit(int attachmentSizeLimit) {
    this.attachmentSizeLimit = attachmentSizeLimit;
    attachmentSizeLimit__is_set = true;
  }
  
  /**
   * element  : clientVersionNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo clientVersionNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","clientVersionNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean clientVersionNumber__is_set = false;

  private java.lang.String clientVersionNumber;

  public java.lang.String getClientVersionNumber() {
    return clientVersionNumber;
  }

  

  public void setClientVersionNumber(java.lang.String clientVersionNumber) {
    this.clientVersionNumber = clientVersionNumber;
    clientVersionNumber__is_set = true;
  }
  
  /**
   * element  : emailToCaseRoutingAddress of type {urn:partner.soap.sforce.com}EmailSyncRoutingAddress
   * java type: com.sforce.soap.partner.EmailSyncRoutingAddress[]
   */
  private static final com.sforce.ws.bind.TypeInfo emailToCaseRoutingAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","emailToCaseRoutingAddress","urn:partner.soap.sforce.com","EmailSyncRoutingAddress",0,-1,true);

  private boolean emailToCaseRoutingAddress__is_set = false;

  private com.sforce.soap.partner.EmailSyncRoutingAddress[] emailToCaseRoutingAddress = new com.sforce.soap.partner.EmailSyncRoutingAddress[0];

  public com.sforce.soap.partner.EmailSyncRoutingAddress[] getEmailToCaseRoutingAddress() {
    return emailToCaseRoutingAddress;
  }

  

  public void setEmailToCaseRoutingAddress(com.sforce.soap.partner.EmailSyncRoutingAddress[] emailToCaseRoutingAddress) {
    this.emailToCaseRoutingAddress = emailToCaseRoutingAddress;
    emailToCaseRoutingAddress__is_set = true;
  }
  
  /**
   * element  : entitySetting of type {urn:partner.soap.sforce.com}EmailSyncEntity
   * java type: com.sforce.soap.partner.EmailSyncEntity[]
   */
  private static final com.sforce.ws.bind.TypeInfo entitySetting__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","entitySetting","urn:partner.soap.sforce.com","EmailSyncEntity",0,-1,true);

  private boolean entitySetting__is_set = false;

  private com.sforce.soap.partner.EmailSyncEntity[] entitySetting = new com.sforce.soap.partner.EmailSyncEntity[0];

  public com.sforce.soap.partner.EmailSyncEntity[] getEntitySetting() {
    return entitySetting;
  }

  

  public void setEntitySetting(com.sforce.soap.partner.EmailSyncEntity[] entitySetting) {
    this.entitySetting = entitySetting;
    entitySetting__is_set = true;
  }
  
  /**
   * element  : logActivityEmailAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo logActivityEmailAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","logActivityEmailAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean logActivityEmailAddress__is_set = false;

  private java.lang.String logActivityEmailAddress;

  public java.lang.String getLogActivityEmailAddress() {
    return logActivityEmailAddress;
  }

  

  public void setLogActivityEmailAddress(java.lang.String logActivityEmailAddress) {
    this.logActivityEmailAddress = logActivityEmailAddress;
    logActivityEmailAddress__is_set = true;
  }
  
  /**
   * element  : personAccountRecordTypeId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo personAccountRecordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","personAccountRecordTypeId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean personAccountRecordTypeId__is_set = false;

  private java.lang.String personAccountRecordTypeId;

  public java.lang.String getPersonAccountRecordTypeId() {
    return personAccountRecordTypeId;
  }

  

  public void setPersonAccountRecordTypeId(java.lang.String personAccountRecordTypeId) {
    this.personAccountRecordTypeId = personAccountRecordTypeId;
    personAccountRecordTypeId__is_set = true;
  }
  
  /**
   * element  : recurringEvents of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo recurringEvents__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","recurringEvents","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean recurringEvents__is_set = false;

  private boolean recurringEvents;

  public boolean getRecurringEvents() {
    return recurringEvents;
  }

  

  public boolean isRecurringEvents() {
    return recurringEvents;
  }

  

  public void setRecurringEvents(boolean recurringEvents) {
    this.recurringEvents = recurringEvents;
    recurringEvents__is_set = true;
  }
  
  /**
   * element  : sidePanel of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo sidePanel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sidePanel","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean sidePanel__is_set = false;

  private boolean sidePanel;

  public boolean getSidePanel() {
    return sidePanel;
  }

  

  public boolean isSidePanel() {
    return sidePanel;
  }

  

  public void setSidePanel(boolean sidePanel) {
    this.sidePanel = sidePanel;
    sidePanel__is_set = true;
  }
  
  /**
   * element  : upgradeNotification of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo upgradeNotification__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","upgradeNotification","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean upgradeNotification__is_set = false;

  private boolean upgradeNotification;

  public boolean getUpgradeNotification() {
    return upgradeNotification;
  }

  

  public boolean isUpgradeNotification() {
    return upgradeNotification;
  }

  

  public void setUpgradeNotification(boolean upgradeNotification) {
    this.upgradeNotification = upgradeNotification;
    upgradeNotification__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, addCase__typeInfo, addCase, addCase__is_set);
    __typeMapper.writeBoolean(__out, addEmail__typeInfo, addEmail, addEmail__is_set);
    __typeMapper.writeBoolean(__out, addEmailAttachment__typeInfo, addEmailAttachment, addEmailAttachment__is_set);
    __typeMapper.writeObject(__out, advancedSetting__typeInfo, advancedSetting, advancedSetting__is_set);
    __typeMapper.writeInt(__out, attachmentSizeLimit__typeInfo, attachmentSizeLimit, attachmentSizeLimit__is_set);
    __typeMapper.writeString(__out, clientVersionNumber__typeInfo, clientVersionNumber, clientVersionNumber__is_set);
    __typeMapper.writeObject(__out, emailToCaseRoutingAddress__typeInfo, emailToCaseRoutingAddress, emailToCaseRoutingAddress__is_set);
    __typeMapper.writeObject(__out, entitySetting__typeInfo, entitySetting, entitySetting__is_set);
    __typeMapper.writeString(__out, logActivityEmailAddress__typeInfo, logActivityEmailAddress, logActivityEmailAddress__is_set);
    __typeMapper.writeString(__out, personAccountRecordTypeId__typeInfo, personAccountRecordTypeId, personAccountRecordTypeId__is_set);
    __typeMapper.writeBoolean(__out, recurringEvents__typeInfo, recurringEvents, recurringEvents__is_set);
    __typeMapper.writeBoolean(__out, sidePanel__typeInfo, sidePanel, sidePanel__is_set);
    __typeMapper.writeBoolean(__out, upgradeNotification__typeInfo, upgradeNotification, upgradeNotification__is_set);
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
    if (__typeMapper.verifyElement(__in, addCase__typeInfo)) {
      setAddCase((boolean)__typeMapper.readBoolean(__in, addCase__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, addEmail__typeInfo)) {
      setAddEmail((boolean)__typeMapper.readBoolean(__in, addEmail__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, addEmailAttachment__typeInfo)) {
      setAddEmailAttachment((boolean)__typeMapper.readBoolean(__in, addEmailAttachment__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, advancedSetting__typeInfo)) {
      setAdvancedSetting((com.sforce.soap.partner.EmailSyncAdvancedSetting[])__typeMapper.readObject(__in, advancedSetting__typeInfo, com.sforce.soap.partner.EmailSyncAdvancedSetting[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, attachmentSizeLimit__typeInfo)) {
      setAttachmentSizeLimit((int)__typeMapper.readInt(__in, attachmentSizeLimit__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, clientVersionNumber__typeInfo)) {
      setClientVersionNumber((java.lang.String)__typeMapper.readString(__in, clientVersionNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, emailToCaseRoutingAddress__typeInfo)) {
      setEmailToCaseRoutingAddress((com.sforce.soap.partner.EmailSyncRoutingAddress[])__typeMapper.readObject(__in, emailToCaseRoutingAddress__typeInfo, com.sforce.soap.partner.EmailSyncRoutingAddress[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, entitySetting__typeInfo)) {
      setEntitySetting((com.sforce.soap.partner.EmailSyncEntity[])__typeMapper.readObject(__in, entitySetting__typeInfo, com.sforce.soap.partner.EmailSyncEntity[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, logActivityEmailAddress__typeInfo)) {
      setLogActivityEmailAddress((java.lang.String)__typeMapper.readString(__in, logActivityEmailAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, personAccountRecordTypeId__typeInfo)) {
      setPersonAccountRecordTypeId((java.lang.String)__typeMapper.readString(__in, personAccountRecordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, recurringEvents__typeInfo)) {
      setRecurringEvents((boolean)__typeMapper.readBoolean(__in, recurringEvents__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sidePanel__typeInfo)) {
      setSidePanel((boolean)__typeMapper.readBoolean(__in, sidePanel__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, upgradeNotification__typeInfo)) {
      setUpgradeNotification((boolean)__typeMapper.readBoolean(__in, upgradeNotification__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeEmailSyncSettings ");
    
    sb.append(" addCase=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(addCase)+"'\n");
    sb.append(" addEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(addEmail)+"'\n");
    sb.append(" addEmailAttachment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(addEmailAttachment)+"'\n");
    sb.append(" advancedSetting=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(advancedSetting)+"'\n");
    sb.append(" attachmentSizeLimit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(attachmentSizeLimit)+"'\n");
    sb.append(" clientVersionNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(clientVersionNumber)+"'\n");
    sb.append(" emailToCaseRoutingAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(emailToCaseRoutingAddress)+"'\n");
    sb.append(" entitySetting=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(entitySetting)+"'\n");
    sb.append(" logActivityEmailAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(logActivityEmailAddress)+"'\n");
    sb.append(" personAccountRecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(personAccountRecordTypeId)+"'\n");
    sb.append(" recurringEvents=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recurringEvents)+"'\n");
    sb.append(" sidePanel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sidePanel)+"'\n");
    sb.append(" upgradeNotification=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(upgradeNotification)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}