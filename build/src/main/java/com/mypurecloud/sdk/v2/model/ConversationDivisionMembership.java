package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationDivisionMembership
 */

public class ConversationDivisionMembership  implements Serializable {
  
  private UriReference division = null;
  private List<UriReference> entities = new ArrayList<UriReference>();

  
  /**
   * A division the conversation belongs to.
   **/
  public ConversationDivisionMembership division(UriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A division the conversation belongs to.")
  @JsonProperty("division")
  public UriReference getDivision() {
    return division;
  }
  public void setDivision(UriReference division) {
    this.division = division;
  }

  
  /**
   * The entities on the conversation within the division. These are the users, queues, work flows, etc. that can be on conversations and and be assigned to different divisions.
   **/
  public ConversationDivisionMembership entities(List<UriReference> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entities on the conversation within the division. These are the users, queues, work flows, etc. that can be on conversations and and be assigned to different divisions.")
  @JsonProperty("entities")
  public List<UriReference> getEntities() {
    return entities;
  }
  public void setEntities(List<UriReference> entities) {
    this.entities = entities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationDivisionMembership conversationDivisionMembership = (ConversationDivisionMembership) o;
    return Objects.equals(this.division, conversationDivisionMembership.division) &&
        Objects.equals(this.entities, conversationDivisionMembership.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationDivisionMembership {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

