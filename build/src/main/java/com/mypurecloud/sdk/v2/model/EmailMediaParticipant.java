package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Attachment;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.JourneyContext;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.Wrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * EmailMediaParticipant
 */

public class EmailMediaParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private Date startHoldTime = null;
  private String purpose = null;

  /**
   * The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("alerting"),
    DIALING("dialing"),
    CONTACTING("contacting"),
    OFFERING("offering"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    TERMINATED("terminated"),
    CONVERTING("converting"),
    UPLOADING("uploading"),
    TRANSMITTING("transmitting"),
    NONE("none");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  /**
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
   */
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;

  /**
   * The reason the participant was disconnected from the conversation.
   */
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DisconnectTypeEnum value : DisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisconnectTypeEnum disconnectType = null;
  private Boolean held = null;
  private Boolean wrapupRequired = null;
  private String wrapupPrompt = null;
  private UriReference user = null;
  private UriReference queue = null;
  private Map<String, String> attributes = null;
  private ErrorBody errorInfo = null;
  private UriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Integer alertingTimeoutMs = null;
  private String provider = null;
  private UriReference externalContact = null;
  private UriReference externalOrganization = null;
  private Wrapup wrapup = null;
  private String peer = null;

  /**
   * The reason specifying why participant flagged the conversation.
   */
  public enum FlaggedReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENERAL("general");

    private String value;

    FlaggedReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlaggedReasonEnum fromString(String key) {
      if (key == null) return null;

      for (FlaggedReasonEnum value : FlaggedReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlaggedReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlaggedReasonEnum flaggedReason = null;
  private JourneyContext journeyContext = null;
  private String subject = null;
  private Integer messagesSent = null;
  private Boolean autoGenerated = null;
  private List<Attachment> draftAttachments = new ArrayList<Attachment>();
  private Boolean spam = null;

  
  /**
   * The unique participant ID.
   **/
  public EmailMediaParticipant id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique participant ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The display friendly name of the participant.
   **/
  public EmailMediaParticipant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display friendly name of the participant.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The participant address.
   **/
  public EmailMediaParticipant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant address.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EmailMediaParticipant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EmailMediaParticipant connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   * The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EmailMediaParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EmailMediaParticipant startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   * The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr
   **/
  public EmailMediaParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   * The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting
   **/
  public EmailMediaParticipant state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
   **/
  public EmailMediaParticipant direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's direction.  Values can be: 'inbound' or 'outbound'")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * The reason the participant was disconnected from the conversation.
   **/
  public EmailMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the participant was disconnected from the conversation.")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   * Value is true when the participant is on hold.
   **/
  public EmailMediaParticipant held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value is true when the participant is on hold.")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   * Value is true when the participant requires wrap-up.
   **/
  public EmailMediaParticipant wrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value is true when the participant requires wrap-up.")
  @JsonProperty("wrapupRequired")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  
  /**
   * The wrap-up prompt indicating the type of wrap-up to be performed.
   **/
  public EmailMediaParticipant wrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The wrap-up prompt indicating the type of wrap-up to be performed.")
  @JsonProperty("wrapupPrompt")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  
  /**
   * The PureCloud user for this participant.
   **/
  public EmailMediaParticipant user(UriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud user for this participant.")
  @JsonProperty("user")
  public UriReference getUser() {
    return user;
  }
  public void setUser(UriReference user) {
    this.user = user;
  }

  
  /**
   * The PureCloud queue for this participant.
   **/
  public EmailMediaParticipant queue(UriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud queue for this participant.")
  @JsonProperty("queue")
  public UriReference getQueue() {
    return queue;
  }
  public void setQueue(UriReference queue) {
    this.queue = queue;
  }

  
  /**
   * A list of ad-hoc attributes for the participant.
   **/
  public EmailMediaParticipant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of ad-hoc attributes for the participant.")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  
  /**
   * If the conversation ends in error, contains additional error details.
   **/
  public EmailMediaParticipant errorInfo(ErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the conversation ends in error, contains additional error details.")
  @JsonProperty("errorInfo")
  public ErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   * The Engage script that should be used by this participant.
   **/
  public EmailMediaParticipant script(UriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Engage script that should be used by this participant.")
  @JsonProperty("script")
  public UriReference getScript() {
    return script;
  }
  public void setScript(UriReference script) {
    this.script = script;
  }

  
  /**
   * The amount of time the participant has to complete wrap-up.
   **/
  public EmailMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time the participant has to complete wrap-up.")
  @JsonProperty("wrapupTimeoutMs")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }

  
  /**
   * Value is true when the participant has skipped wrap-up.
   **/
  public EmailMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value is true when the participant has skipped wrap-up.")
  @JsonProperty("wrapupSkipped")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  
  /**
   * Specifies how long the agent has to answer an interaction before being marked as not responding.
   **/
  public EmailMediaParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long the agent has to answer an interaction before being marked as not responding.")
  @JsonProperty("alertingTimeoutMs")
  public Integer getAlertingTimeoutMs() {
    return alertingTimeoutMs;
  }
  public void setAlertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
  }

  
  /**
   * The source provider for the communication.
   **/
  public EmailMediaParticipant provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider for the communication.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * If this participant represents an external contact, then this will be the reference for the external contact.
   **/
  public EmailMediaParticipant externalContact(UriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external contact, then this will be the reference for the external contact.")
  @JsonProperty("externalContact")
  public UriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(UriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   * If this participant represents an external org, then this will be the reference for the external org.
   **/
  public EmailMediaParticipant externalOrganization(UriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external org, then this will be the reference for the external org.")
  @JsonProperty("externalOrganization")
  public UriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(UriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   * Wrapup for this participant, if it has been applied.
   **/
  public EmailMediaParticipant wrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wrapup for this participant, if it has been applied.")
  @JsonProperty("wrapup")
  public Wrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * The peer communication corresponding to a matching leg for this communication.
   **/
  public EmailMediaParticipant peer(String peer) {
    this.peer = peer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The peer communication corresponding to a matching leg for this communication.")
  @JsonProperty("peer")
  public String getPeer() {
    return peer;
  }
  public void setPeer(String peer) {
    this.peer = peer;
  }

  
  /**
   * The reason specifying why participant flagged the conversation.
   **/
  public EmailMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason specifying why participant flagged the conversation.")
  @JsonProperty("flaggedReason")
  public FlaggedReasonEnum getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
  }

  
  /**
   * Journey System data/context that is applicable to this communication.  When used for historical purposes, the context should be immutable.  When null, there is no applicable Journey System context.
   **/
  public EmailMediaParticipant journeyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Journey System data/context that is applicable to this communication.  When used for historical purposes, the context should be immutable.  When null, there is no applicable Journey System context.")
  @JsonProperty("journeyContext")
  public JourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   * The subject of the email.
   **/
  public EmailMediaParticipant subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject of the email.")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * The number of messages that have been sent in this email conversation.
   **/
  public EmailMediaParticipant messagesSent(Integer messagesSent) {
    this.messagesSent = messagesSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of messages that have been sent in this email conversation.")
  @JsonProperty("messagesSent")
  public Integer getMessagesSent() {
    return messagesSent;
  }
  public void setMessagesSent(Integer messagesSent) {
    this.messagesSent = messagesSent;
  }

  
  /**
   * Indicates that the email was auto-generated like an Out of Office reply.
   **/
  public EmailMediaParticipant autoGenerated(Boolean autoGenerated) {
    this.autoGenerated = autoGenerated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that the email was auto-generated like an Out of Office reply.")
  @JsonProperty("autoGenerated")
  public Boolean getAutoGenerated() {
    return autoGenerated;
  }
  public void setAutoGenerated(Boolean autoGenerated) {
    this.autoGenerated = autoGenerated;
  }

  
  /**
   * A list of uploaded attachments on the email draft.
   **/
  public EmailMediaParticipant draftAttachments(List<Attachment> draftAttachments) {
    this.draftAttachments = draftAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of uploaded attachments on the email draft.")
  @JsonProperty("draftAttachments")
  public List<Attachment> getDraftAttachments() {
    return draftAttachments;
  }
  public void setDraftAttachments(List<Attachment> draftAttachments) {
    this.draftAttachments = draftAttachments;
  }

  
  /**
   * Indicates if the inbound email was marked as spam.
   **/
  public EmailMediaParticipant spam(Boolean spam) {
    this.spam = spam;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the inbound email was marked as spam.")
  @JsonProperty("spam")
  public Boolean getSpam() {
    return spam;
  }
  public void setSpam(Boolean spam) {
    this.spam = spam;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailMediaParticipant emailMediaParticipant = (EmailMediaParticipant) o;
    return Objects.equals(this.id, emailMediaParticipant.id) &&
        Objects.equals(this.name, emailMediaParticipant.name) &&
        Objects.equals(this.address, emailMediaParticipant.address) &&
        Objects.equals(this.startTime, emailMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, emailMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, emailMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, emailMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, emailMediaParticipant.purpose) &&
        Objects.equals(this.state, emailMediaParticipant.state) &&
        Objects.equals(this.direction, emailMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, emailMediaParticipant.disconnectType) &&
        Objects.equals(this.held, emailMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, emailMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, emailMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, emailMediaParticipant.user) &&
        Objects.equals(this.queue, emailMediaParticipant.queue) &&
        Objects.equals(this.attributes, emailMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, emailMediaParticipant.errorInfo) &&
        Objects.equals(this.script, emailMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, emailMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, emailMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.alertingTimeoutMs, emailMediaParticipant.alertingTimeoutMs) &&
        Objects.equals(this.provider, emailMediaParticipant.provider) &&
        Objects.equals(this.externalContact, emailMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, emailMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, emailMediaParticipant.wrapup) &&
        Objects.equals(this.peer, emailMediaParticipant.peer) &&
        Objects.equals(this.flaggedReason, emailMediaParticipant.flaggedReason) &&
        Objects.equals(this.journeyContext, emailMediaParticipant.journeyContext) &&
        Objects.equals(this.subject, emailMediaParticipant.subject) &&
        Objects.equals(this.messagesSent, emailMediaParticipant.messagesSent) &&
        Objects.equals(this.autoGenerated, emailMediaParticipant.autoGenerated) &&
        Objects.equals(this.draftAttachments, emailMediaParticipant.draftAttachments) &&
        Objects.equals(this.spam, emailMediaParticipant.spam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalOrganization, wrapup, peer, flaggedReason, journeyContext, subject, messagesSent, autoGenerated, draftAttachments, spam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMediaParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    alertingTimeoutMs: ").append(toIndentedString(alertingTimeoutMs)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    messagesSent: ").append(toIndentedString(messagesSent)).append("\n");
    sb.append("    autoGenerated: ").append(toIndentedString(autoGenerated)).append("\n");
    sb.append("    draftAttachments: ").append(toIndentedString(draftAttachments)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

