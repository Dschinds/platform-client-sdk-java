package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ShiftTradeNotification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmUserNotification
 */

public class WfmUserNotification  implements Serializable {
  
  private String id = null;
  private String mutableGroupId = null;
  private Date timestamp = null;

  /**
   * The type of this notification
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SHIFTTRADE("ShiftTrade");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private ShiftTradeNotification shiftTrade = null;
  private Boolean markedAsRead = null;
  private Boolean agentNotification = null;
  private List<String> otherNotificationIdsInGroup = new ArrayList<String>();

  
  /**
   * The immutable globally unique identifier for the object.
   **/
  public WfmUserNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The immutable globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The group ID of the notification (mutable, may change  on update)
   **/
  public WfmUserNotification mutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The group ID of the notification (mutable, may change  on update)")
  @JsonProperty("mutableGroupId")
  public String getMutableGroupId() {
    return mutableGroupId;
  }
  public void setMutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
  }

  
  @ApiModelProperty(example = "null", value = "The timestamp for this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }

  
  @ApiModelProperty(example = "null", value = "The type of this notification")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  
  /**
   * A shift trade notification.  Only set if type == ShiftTrade
   **/
  public WfmUserNotification shiftTrade(ShiftTradeNotification shiftTrade) {
    this.shiftTrade = shiftTrade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A shift trade notification.  Only set if type == ShiftTrade")
  @JsonProperty("shiftTrade")
  public ShiftTradeNotification getShiftTrade() {
    return shiftTrade;
  }
  public void setShiftTrade(ShiftTradeNotification shiftTrade) {
    this.shiftTrade = shiftTrade;
  }

  
  /**
   * Whether this notification has been marked \"read\"
   **/
  public WfmUserNotification markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this notification has been marked \"read\"")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }

  
  @ApiModelProperty(example = "null", value = "Whether this notification is for an agent")
  @JsonProperty("agentNotification")
  public Boolean getAgentNotification() {
    return agentNotification;
  }

  
  /**
   * Other notification IDs in group.  This field is only populated in real-time notifications
   **/
  public WfmUserNotification otherNotificationIdsInGroup(List<String> otherNotificationIdsInGroup) {
    this.otherNotificationIdsInGroup = otherNotificationIdsInGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Other notification IDs in group.  This field is only populated in real-time notifications")
  @JsonProperty("otherNotificationIdsInGroup")
  public List<String> getOtherNotificationIdsInGroup() {
    return otherNotificationIdsInGroup;
  }
  public void setOtherNotificationIdsInGroup(List<String> otherNotificationIdsInGroup) {
    this.otherNotificationIdsInGroup = otherNotificationIdsInGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserNotification wfmUserNotification = (WfmUserNotification) o;
    return Objects.equals(this.id, wfmUserNotification.id) &&
        Objects.equals(this.mutableGroupId, wfmUserNotification.mutableGroupId) &&
        Objects.equals(this.timestamp, wfmUserNotification.timestamp) &&
        Objects.equals(this.type, wfmUserNotification.type) &&
        Objects.equals(this.shiftTrade, wfmUserNotification.shiftTrade) &&
        Objects.equals(this.markedAsRead, wfmUserNotification.markedAsRead) &&
        Objects.equals(this.agentNotification, wfmUserNotification.agentNotification) &&
        Objects.equals(this.otherNotificationIdsInGroup, wfmUserNotification.otherNotificationIdsInGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mutableGroupId, timestamp, type, shiftTrade, markedAsRead, agentNotification, otherNotificationIdsInGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mutableGroupId: ").append(toIndentedString(mutableGroupId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shiftTrade: ").append(toIndentedString(shiftTrade)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    agentNotification: ").append(toIndentedString(agentNotification)).append("\n");
    sb.append("    otherNotificationIdsInGroup: ").append(toIndentedString(otherNotificationIdsInGroup)).append("\n");
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

