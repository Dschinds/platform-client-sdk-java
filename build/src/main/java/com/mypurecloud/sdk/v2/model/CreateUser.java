package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Contact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateUser
 */

public class CreateUser  implements Serializable {
  
  private String name = null;
  private String department = null;
  private String email = null;
  private List<Contact> addresses = new ArrayList<Contact>();
  private String title = null;
  private String password = null;
  private String divisionId = null;

  
  /**
   * User's full name
   **/
  public CreateUser name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User's full name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public CreateUser department(String department) {
    this.department = department;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  
  /**
   * User's email and username
   **/
  public CreateUser email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User's email and username")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Email addresses and phone numbers for this user
   **/
  public CreateUser addresses(List<Contact> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email addresses and phone numbers for this user")
  @JsonProperty("addresses")
  public List<Contact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Contact> addresses) {
    this.addresses = addresses;
  }

  
  /**
   **/
  public CreateUser title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * User's password
   **/
  public CreateUser password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User's password")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The division to which this user will belong
   **/
  public CreateUser divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this user will belong")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUser createUser = (CreateUser) o;
    return Objects.equals(this.name, createUser.name) &&
        Objects.equals(this.department, createUser.department) &&
        Objects.equals(this.email, createUser.email) &&
        Objects.equals(this.addresses, createUser.addresses) &&
        Objects.equals(this.title, createUser.title) &&
        Objects.equals(this.password, createUser.password) &&
        Objects.equals(this.divisionId, createUser.divisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, department, email, addresses, title, password, divisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUser {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
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

