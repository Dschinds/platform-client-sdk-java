package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmUserNotificationTopicShiftTradeNotification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmUserNotificationTopicWfmUserNotification
 */

public class WfmUserNotificationTopicWfmUserNotification  implements Serializable {
  
  private String id = null;
  private String mutableGroupId = null;
  private Date timestamp = null;

  /**
   * Gets or Sets type
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
  private WfmUserNotificationTopicShiftTradeNotification shiftTrade = null;
  private Boolean agentNotification = null;
  private List<String> otherNotificationIdsInGroup = new ArrayList<String>();

  
  /**
   **/
  public WfmUserNotificationTopicWfmUserNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public WfmUserNotificationTopicWfmUserNotification mutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mutableGroupId")
  public String getMutableGroupId() {
    return mutableGroupId;
  }
  public void setMutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
  }

  
  /**
   **/
  public WfmUserNotificationTopicWfmUserNotification timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  public WfmUserNotificationTopicWfmUserNotification type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public WfmUserNotificationTopicWfmUserNotification shiftTrade(WfmUserNotificationTopicShiftTradeNotification shiftTrade) {
    this.shiftTrade = shiftTrade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shiftTrade")
  public WfmUserNotificationTopicShiftTradeNotification getShiftTrade() {
    return shiftTrade;
  }
  public void setShiftTrade(WfmUserNotificationTopicShiftTradeNotification shiftTrade) {
    this.shiftTrade = shiftTrade;
  }

  
  /**
   **/
  public WfmUserNotificationTopicWfmUserNotification agentNotification(Boolean agentNotification) {
    this.agentNotification = agentNotification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentNotification")
  public Boolean getAgentNotification() {
    return agentNotification;
  }
  public void setAgentNotification(Boolean agentNotification) {
    this.agentNotification = agentNotification;
  }

  
  /**
   **/
  public WfmUserNotificationTopicWfmUserNotification otherNotificationIdsInGroup(List<String> otherNotificationIdsInGroup) {
    this.otherNotificationIdsInGroup = otherNotificationIdsInGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    WfmUserNotificationTopicWfmUserNotification wfmUserNotificationTopicWfmUserNotification = (WfmUserNotificationTopicWfmUserNotification) o;
    return Objects.equals(this.id, wfmUserNotificationTopicWfmUserNotification.id) &&
        Objects.equals(this.mutableGroupId, wfmUserNotificationTopicWfmUserNotification.mutableGroupId) &&
        Objects.equals(this.timestamp, wfmUserNotificationTopicWfmUserNotification.timestamp) &&
        Objects.equals(this.type, wfmUserNotificationTopicWfmUserNotification.type) &&
        Objects.equals(this.shiftTrade, wfmUserNotificationTopicWfmUserNotification.shiftTrade) &&
        Objects.equals(this.agentNotification, wfmUserNotificationTopicWfmUserNotification.agentNotification) &&
        Objects.equals(this.otherNotificationIdsInGroup, wfmUserNotificationTopicWfmUserNotification.otherNotificationIdsInGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mutableGroupId, timestamp, type, shiftTrade, agentNotification, otherNotificationIdsInGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserNotificationTopicWfmUserNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mutableGroupId: ").append(toIndentedString(mutableGroupId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shiftTrade: ").append(toIndentedString(shiftTrade)).append("\n");
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

