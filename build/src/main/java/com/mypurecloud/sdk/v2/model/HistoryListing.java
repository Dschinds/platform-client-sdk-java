package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Detail;
import com.mypurecloud.sdk.v2.model.HistoryEntry;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * HistoryListing
 */

public class HistoryListing  implements Serializable {
  
  private String id = null;
  private Boolean complete = null;
  private User user = null;
  private String errorMessage = null;
  private String errorCode = null;
  private List<Detail> errorDetails = new ArrayList<Detail>();
  private Map<String, String> errorMessageParams = null;

  /**
   * Action name
   */
  public enum ActionNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("CREATE"),
    CHECKIN("CHECKIN"),
    DEBUG("DEBUG"),
    DELETE("DELETE"),
    HISTORY("HISTORY"),
    PUBLISH("PUBLISH"),
    STATE_CHANGE("STATE_CHANGE"),
    UPDATE("UPDATE"),
    VALIDATE("VALIDATE");

    private String value;

    ActionNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionNameEnum fromString(String key) {
      if (key == null) return null;

      for (ActionNameEnum value : ActionNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionNameEnum actionName = null;

  /**
   * Action status
   */
  public enum ActionStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOCKED("LOCKED"),
    UNLOCKED("UNLOCKED"),
    STARTED("STARTED"),
    PENDING_GENERATION("PENDING_GENERATION"),
    PENDING_BACKEND_NOTIFICATION("PENDING_BACKEND_NOTIFICATION"),
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE");

    private String value;

    ActionStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ActionStatusEnum value : ActionStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionStatusEnum actionStatus = null;
  private String name = null;
  private String description = null;
  private Boolean system = null;
  private Date started = null;
  private Date completed = null;
  private List<HistoryEntry> entities = new ArrayList<HistoryEntry>();
  private Long total = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Integer pageCount = null;

  
  /**
   **/
  public HistoryListing id(String id) {
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
  public HistoryListing complete(Boolean complete) {
    this.complete = complete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  
  /**
   **/
  public HistoryListing user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   **/
  public HistoryListing errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  public HistoryListing errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   **/
  public HistoryListing errorDetails(List<Detail> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public List<Detail> getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(List<Detail> errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   **/
  public HistoryListing errorMessageParams(Map<String, String> errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessageParams")
  public Map<String, String> getErrorMessageParams() {
    return errorMessageParams;
  }
  public void setErrorMessageParams(Map<String, String> errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
  }

  
  /**
   * Action name
   **/
  public HistoryListing actionName(ActionNameEnum actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action name")
  @JsonProperty("actionName")
  public ActionNameEnum getActionName() {
    return actionName;
  }
  public void setActionName(ActionNameEnum actionName) {
    this.actionName = actionName;
  }

  
  /**
   * Action status
   **/
  public HistoryListing actionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action status")
  @JsonProperty("actionStatus")
  public ActionStatusEnum getActionStatus() {
    return actionStatus;
  }
  public void setActionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
  }

  
  /**
   **/
  public HistoryListing name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public HistoryListing description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public HistoryListing system(Boolean system) {
    this.system = system;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("system")
  public Boolean getSystem() {
    return system;
  }
  public void setSystem(Boolean system) {
    this.system = system;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public HistoryListing started(Date started) {
    this.started = started;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("started")
  public Date getStarted() {
    return started;
  }
  public void setStarted(Date started) {
    this.started = started;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public HistoryListing completed(Date completed) {
    this.completed = completed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("completed")
  public Date getCompleted() {
    return completed;
  }
  public void setCompleted(Date completed) {
    this.completed = completed;
  }

  
  /**
   **/
  public HistoryListing entities(List<HistoryEntry> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<HistoryEntry> getEntities() {
    return entities;
  }
  public void setEntities(List<HistoryEntry> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public HistoryListing total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   **/
  public HistoryListing pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   **/
  public HistoryListing pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   **/
  public HistoryListing pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryListing historyListing = (HistoryListing) o;
    return Objects.equals(this.id, historyListing.id) &&
        Objects.equals(this.complete, historyListing.complete) &&
        Objects.equals(this.user, historyListing.user) &&
        Objects.equals(this.errorMessage, historyListing.errorMessage) &&
        Objects.equals(this.errorCode, historyListing.errorCode) &&
        Objects.equals(this.errorDetails, historyListing.errorDetails) &&
        Objects.equals(this.errorMessageParams, historyListing.errorMessageParams) &&
        Objects.equals(this.actionName, historyListing.actionName) &&
        Objects.equals(this.actionStatus, historyListing.actionStatus) &&
        Objects.equals(this.name, historyListing.name) &&
        Objects.equals(this.description, historyListing.description) &&
        Objects.equals(this.system, historyListing.system) &&
        Objects.equals(this.started, historyListing.started) &&
        Objects.equals(this.completed, historyListing.completed) &&
        Objects.equals(this.entities, historyListing.entities) &&
        Objects.equals(this.total, historyListing.total) &&
        Objects.equals(this.pageSize, historyListing.pageSize) &&
        Objects.equals(this.pageNumber, historyListing.pageNumber) &&
        Objects.equals(this.pageCount, historyListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complete, user, errorMessage, errorCode, errorDetails, errorMessageParams, actionName, actionStatus, name, description, system, started, completed, entities, total, pageSize, pageNumber, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryListing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    errorMessageParams: ").append(toIndentedString(errorMessageParams)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

