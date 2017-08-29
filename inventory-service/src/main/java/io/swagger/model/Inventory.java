package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-11T20:01:06.520Z")

public class Inventory   {
  @JsonProperty("petId")
  private Long petId = null;

  @JsonProperty("price")
  private Double price = null;

  public Inventory (long id, double price){
	  this.petId = id;
	  this.price = price;
  }
  
  public Inventory petId(Long petId) {
    this.petId = petId;
    return this;
  }

   /**
   * Get petId
   * @return petId
  **/
  @ApiModelProperty(value = "")


  public Long getPetId() {
    return petId;
  }

  public void setPetId(Long petId) {
    this.petId = petId;
  }

  public Inventory price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price to Adopt
   * @return price
  **/
  @ApiModelProperty(value = "Price to Adopt")


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inventory inlineResponse200 = (Inventory) o;
    return Objects.equals(this.petId, inlineResponse200.petId) &&
        Objects.equals(this.price, inlineResponse200.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petId, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

