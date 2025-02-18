package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Service level target configuration for a service goal group
 */
@ApiModel(description = "Service level target configuration for a service goal group")

public class WfmServiceLevel  implements Serializable {
  
  private Boolean include = null;
  private Integer percent = null;
  private Integer seconds = null;

  
  /**
   * Whether to include service level targets in the associated service goal group's configuration
   **/
  public WfmServiceLevel include(Boolean include) {
    this.include = include;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to include service level targets in the associated service goal group's configuration")
  @JsonProperty("include")
  public Boolean getInclude() {
    return include;
  }
  public void setInclude(Boolean include) {
    this.include = include;
  }

  
  /**
   * Service level target percent answered for the associated service goal group. Required if include == true
   **/
  public WfmServiceLevel percent(Integer percent) {
    this.percent = percent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service level target percent answered for the associated service goal group. Required if include == true")
  @JsonProperty("percent")
  public Integer getPercent() {
    return percent;
  }
  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  
  /**
   * Service level target answer time for the associated service goal group. Required if include == true
   **/
  public WfmServiceLevel seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service level target answer time for the associated service goal group. Required if include == true")
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmServiceLevel wfmServiceLevel = (WfmServiceLevel) o;
    return Objects.equals(this.include, wfmServiceLevel.include) &&
        Objects.equals(this.percent, wfmServiceLevel.percent) &&
        Objects.equals(this.seconds, wfmServiceLevel.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, percent, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmServiceLevel {\n");
    
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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

