package org.acme.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UsuarioTypeResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-13T15:38:29.672710600-05:00[America/Bogota]")
public class UsuarioTypeResponse   {
  private @Valid String name;
  private @Valid String lastname;

  /**
   **/
  public UsuarioTypeResponse name(String name) {
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
  public UsuarioTypeResponse lastname(String lastname) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioTypeResponse usuarioTypeResponse = (UsuarioTypeResponse) o;
    return Objects.equals(this.name, usuarioTypeResponse.name) &&
        Objects.equals(this.lastname, usuarioTypeResponse.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioTypeResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
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

