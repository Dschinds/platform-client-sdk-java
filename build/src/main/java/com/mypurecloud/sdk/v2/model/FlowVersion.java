package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowVersion
 */

public class FlowVersion  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String commitVersion = null;
  private String configurationVersion = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLISH("PUBLISH"),
    CHECKIN("CHECKIN"),
    SAVE("SAVE");

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
  private Boolean secure = null;
  private User createdBy = null;
  private String configurationUri = null;
  private Long dateCreated = null;
  private String generationId = null;
  private String publishResultUri = null;
  private String selfUri = null;

  
  /**
   * The flow version identifier
   **/
  public FlowVersion id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow version identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public FlowVersion name(String name) {
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
  public FlowVersion commitVersion(String commitVersion) {
    this.commitVersion = commitVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commitVersion")
  public String getCommitVersion() {
    return commitVersion;
  }
  public void setCommitVersion(String commitVersion) {
    this.commitVersion = commitVersion;
  }

  
  /**
   **/
  public FlowVersion configurationVersion(String configurationVersion) {
    this.configurationVersion = configurationVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configurationVersion")
  public String getConfigurationVersion() {
    return configurationVersion;
  }
  public void setConfigurationVersion(String configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  
  /**
   **/
  public FlowVersion type(TypeEnum type) {
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
  public FlowVersion secure(Boolean secure) {
    this.secure = secure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secure")
  public Boolean getSecure() {
    return secure;
  }
  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  
  /**
   **/
  public FlowVersion createdBy(User createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public FlowVersion configurationUri(String configurationUri) {
    this.configurationUri = configurationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configurationUri")
  public String getConfigurationUri() {
    return configurationUri;
  }
  public void setConfigurationUri(String configurationUri) {
    this.configurationUri = configurationUri;
  }

  
  /**
   **/
  public FlowVersion dateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Long getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public FlowVersion generationId(String generationId) {
    this.generationId = generationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generationId")
  public String getGenerationId() {
    return generationId;
  }
  public void setGenerationId(String generationId) {
    this.generationId = generationId;
  }

  
  /**
   **/
  public FlowVersion publishResultUri(String publishResultUri) {
    this.publishResultUri = publishResultUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishResultUri")
  public String getPublishResultUri() {
    return publishResultUri;
  }
  public void setPublishResultUri(String publishResultUri) {
    this.publishResultUri = publishResultUri;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowVersion flowVersion = (FlowVersion) o;
    return Objects.equals(this.id, flowVersion.id) &&
        Objects.equals(this.name, flowVersion.name) &&
        Objects.equals(this.commitVersion, flowVersion.commitVersion) &&
        Objects.equals(this.configurationVersion, flowVersion.configurationVersion) &&
        Objects.equals(this.type, flowVersion.type) &&
        Objects.equals(this.secure, flowVersion.secure) &&
        Objects.equals(this.createdBy, flowVersion.createdBy) &&
        Objects.equals(this.configurationUri, flowVersion.configurationUri) &&
        Objects.equals(this.dateCreated, flowVersion.dateCreated) &&
        Objects.equals(this.generationId, flowVersion.generationId) &&
        Objects.equals(this.publishResultUri, flowVersion.publishResultUri) &&
        Objects.equals(this.selfUri, flowVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, commitVersion, configurationVersion, type, secure, createdBy, configurationUri, dateCreated, generationId, publishResultUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commitVersion: ").append(toIndentedString(commitVersion)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    configurationUri: ").append(toIndentedString(configurationUri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    generationId: ").append(toIndentedString(generationId)).append("\n");
    sb.append("    publishResultUri: ").append(toIndentedString(publishResultUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

