package org.acme.gen.type;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UsuarioTypeInput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-15T11:49:57.639230300-05:00[America/Bogota]")
public class UsuarioTypeInput   {
  private @Valid String name;
  private @Valid String lastname;
  private @Valid LocalDate createat;
  private @Valid BigDecimal tblAcept;
  private @Valid String tblIdnumber;
  private @Valid BigDecimal tblIdtblDocumenttype;
  private @Valid BigDecimal tblIdtblRole;
  private @Valid Integer tblIdtblUserdetails;
  private @Valid String tblPassword;
  private @Valid String tblPhone;
  private @Valid BigDecimal tblStatus;
  private @Valid LocalDate tblUpdateAt;
  private @Valid String tblImagendocument;
  private @Valid String tblMail;
  private @Valid String tblPhonealt;
  private @Valid String tblPhoto;

  /**
   **/
  public UsuarioTypeInput name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public UsuarioTypeInput lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }

  @JsonProperty("lastname")
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   **/
  public UsuarioTypeInput createat(LocalDate createat) {
    this.createat = createat;
    return this;
  }

  
  @JsonProperty("createat")
  public LocalDate getCreateat() {
    return createat;
  }

  @JsonProperty("createat")
  public void setCreateat(LocalDate createat) {
    this.createat = createat;
  }

  /**
   * minimum: 0
   * maximum: 1
   **/
  public UsuarioTypeInput tblAcept(BigDecimal tblAcept) {
    this.tblAcept = tblAcept;
    return this;
  }

  
  @JsonProperty("tbl_acept")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTblAcept() {
    return tblAcept;
  }

  @JsonProperty("tbl_acept")
  public void setTblAcept(BigDecimal tblAcept) {
    this.tblAcept = tblAcept;
  }

  /**
   **/
  public UsuarioTypeInput tblIdnumber(String tblIdnumber) {
    this.tblIdnumber = tblIdnumber;
    return this;
  }

  
  @JsonProperty("tbl_idnumber")
  public String getTblIdnumber() {
    return tblIdnumber;
  }

  @JsonProperty("tbl_idnumber")
  public void setTblIdnumber(String tblIdnumber) {
    this.tblIdnumber = tblIdnumber;
  }

  /**
   **/
  public UsuarioTypeInput tblIdtblDocumenttype(BigDecimal tblIdtblDocumenttype) {
    this.tblIdtblDocumenttype = tblIdtblDocumenttype;
    return this;
  }

  
  @JsonProperty("tbl_idtbl_documenttype")
  public BigDecimal getTblIdtblDocumenttype() {
    return tblIdtblDocumenttype;
  }

  @JsonProperty("tbl_idtbl_documenttype")
  public void setTblIdtblDocumenttype(BigDecimal tblIdtblDocumenttype) {
    this.tblIdtblDocumenttype = tblIdtblDocumenttype;
  }

  /**
   **/
  public UsuarioTypeInput tblIdtblRole(BigDecimal tblIdtblRole) {
    this.tblIdtblRole = tblIdtblRole;
    return this;
  }

  
  @JsonProperty("tbl_idtbl_role")
  public BigDecimal getTblIdtblRole() {
    return tblIdtblRole;
  }

  @JsonProperty("tbl_idtbl_role")
  public void setTblIdtblRole(BigDecimal tblIdtblRole) {
    this.tblIdtblRole = tblIdtblRole;
  }

  /**
   **/
  public UsuarioTypeInput tblIdtblUserdetails(Integer tblIdtblUserdetails) {
    this.tblIdtblUserdetails = tblIdtblUserdetails;
    return this;
  }

  
  @JsonProperty("tbl_idtbl_userdetails")
  public Integer getTblIdtblUserdetails() {
    return tblIdtblUserdetails;
  }

  @JsonProperty("tbl_idtbl_userdetails")
  public void setTblIdtblUserdetails(Integer tblIdtblUserdetails) {
    this.tblIdtblUserdetails = tblIdtblUserdetails;
  }

  /**
   **/
  public UsuarioTypeInput tblPassword(String tblPassword) {
    this.tblPassword = tblPassword;
    return this;
  }

  
  @JsonProperty("tbl_password")
  public String getTblPassword() {
    return tblPassword;
  }

  @JsonProperty("tbl_password")
  public void setTblPassword(String tblPassword) {
    this.tblPassword = tblPassword;
  }

  /**
   **/
  public UsuarioTypeInput tblPhone(String tblPhone) {
    this.tblPhone = tblPhone;
    return this;
  }

  
  @JsonProperty("tbl_phone")
  public String getTblPhone() {
    return tblPhone;
  }

  @JsonProperty("tbl_phone")
  public void setTblPhone(String tblPhone) {
    this.tblPhone = tblPhone;
  }

  /**
   * minimum: 0
   * maximum: 1
   **/
  public UsuarioTypeInput tblStatus(BigDecimal tblStatus) {
    this.tblStatus = tblStatus;
    return this;
  }

  
  @JsonProperty("tbl_status")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTblStatus() {
    return tblStatus;
  }

  @JsonProperty("tbl_status")
  public void setTblStatus(BigDecimal tblStatus) {
    this.tblStatus = tblStatus;
  }

  /**
   **/
  public UsuarioTypeInput tblUpdateAt(LocalDate tblUpdateAt) {
    this.tblUpdateAt = tblUpdateAt;
    return this;
  }

  
  @JsonProperty("tbl_update_at")
  public LocalDate getTblUpdateAt() {
    return tblUpdateAt;
  }

  @JsonProperty("tbl_update_at")
  public void setTblUpdateAt(LocalDate tblUpdateAt) {
    this.tblUpdateAt = tblUpdateAt;
  }

  /**
   **/
  public UsuarioTypeInput tblImagendocument(String tblImagendocument) {
    this.tblImagendocument = tblImagendocument;
    return this;
  }

  
  @JsonProperty("tbl_imagendocument")
  public String getTblImagendocument() {
    return tblImagendocument;
  }

  @JsonProperty("tbl_imagendocument")
  public void setTblImagendocument(String tblImagendocument) {
    this.tblImagendocument = tblImagendocument;
  }

  /**
   **/
  public UsuarioTypeInput tblMail(String tblMail) {
    this.tblMail = tblMail;
    return this;
  }

  
  @JsonProperty("tbl_mail")
  public String getTblMail() {
    return tblMail;
  }

  @JsonProperty("tbl_mail")
  public void setTblMail(String tblMail) {
    this.tblMail = tblMail;
  }

  /**
   **/
  public UsuarioTypeInput tblPhonealt(String tblPhonealt) {
    this.tblPhonealt = tblPhonealt;
    return this;
  }

  
  @JsonProperty("tbl_phonealt")
  public String getTblPhonealt() {
    return tblPhonealt;
  }

  @JsonProperty("tbl_phonealt")
  public void setTblPhonealt(String tblPhonealt) {
    this.tblPhonealt = tblPhonealt;
  }

  /**
   **/
  public UsuarioTypeInput tblPhoto(String tblPhoto) {
    this.tblPhoto = tblPhoto;
    return this;
  }

  
  @JsonProperty("tbl_photo")
  public String getTblPhoto() {
    return tblPhoto;
  }

  @JsonProperty("tbl_photo")
  public void setTblPhoto(String tblPhoto) {
    this.tblPhoto = tblPhoto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioTypeInput usuarioTypeInput = (UsuarioTypeInput) o;
    return Objects.equals(this.name, usuarioTypeInput.name) &&
        Objects.equals(this.lastname, usuarioTypeInput.lastname) &&
        Objects.equals(this.createat, usuarioTypeInput.createat) &&
        Objects.equals(this.tblAcept, usuarioTypeInput.tblAcept) &&
        Objects.equals(this.tblIdnumber, usuarioTypeInput.tblIdnumber) &&
        Objects.equals(this.tblIdtblDocumenttype, usuarioTypeInput.tblIdtblDocumenttype) &&
        Objects.equals(this.tblIdtblRole, usuarioTypeInput.tblIdtblRole) &&
        Objects.equals(this.tblIdtblUserdetails, usuarioTypeInput.tblIdtblUserdetails) &&
        Objects.equals(this.tblPassword, usuarioTypeInput.tblPassword) &&
        Objects.equals(this.tblPhone, usuarioTypeInput.tblPhone) &&
        Objects.equals(this.tblStatus, usuarioTypeInput.tblStatus) &&
        Objects.equals(this.tblUpdateAt, usuarioTypeInput.tblUpdateAt) &&
        Objects.equals(this.tblImagendocument, usuarioTypeInput.tblImagendocument) &&
        Objects.equals(this.tblMail, usuarioTypeInput.tblMail) &&
        Objects.equals(this.tblPhonealt, usuarioTypeInput.tblPhonealt) &&
        Objects.equals(this.tblPhoto, usuarioTypeInput.tblPhoto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastname, createat, tblAcept, tblIdnumber, tblIdtblDocumenttype, tblIdtblRole, tblIdtblUserdetails, tblPassword, tblPhone, tblStatus, tblUpdateAt, tblImagendocument, tblMail, tblPhonealt, tblPhoto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioTypeInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    createat: ").append(toIndentedString(createat)).append("\n");
    sb.append("    tblAcept: ").append(toIndentedString(tblAcept)).append("\n");
    sb.append("    tblIdnumber: ").append(toIndentedString(tblIdnumber)).append("\n");
    sb.append("    tblIdtblDocumenttype: ").append(toIndentedString(tblIdtblDocumenttype)).append("\n");
    sb.append("    tblIdtblRole: ").append(toIndentedString(tblIdtblRole)).append("\n");
    sb.append("    tblIdtblUserdetails: ").append(toIndentedString(tblIdtblUserdetails)).append("\n");
    sb.append("    tblPassword: ").append(toIndentedString(tblPassword)).append("\n");
    sb.append("    tblPhone: ").append(toIndentedString(tblPhone)).append("\n");
    sb.append("    tblStatus: ").append(toIndentedString(tblStatus)).append("\n");
    sb.append("    tblUpdateAt: ").append(toIndentedString(tblUpdateAt)).append("\n");
    sb.append("    tblImagendocument: ").append(toIndentedString(tblImagendocument)).append("\n");
    sb.append("    tblMail: ").append(toIndentedString(tblMail)).append("\n");
    sb.append("    tblPhonealt: ").append(toIndentedString(tblPhonealt)).append("\n");
    sb.append("    tblPhoto: ").append(toIndentedString(tblPhoto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

