package ru.tinkoff.eacq.mma.shop.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * характеристики социальности МСС
 */
@ApiModel(description = "характеристики социальности МСС")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CategoriesSocialPropertiesResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("socialFlag")
  private Boolean socialFlag;

  @JsonProperty("startDurationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate startDurationDate;

  @JsonProperty("endDurationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate endDurationDate;

  public CategoriesSocialPropertiesResponse socialFlag(Boolean socialFlag) {
    this.socialFlag = socialFlag;
    return this;
  }

  /**
   * Флаг видимости социальности МСС
   * @return socialFlag
  */
  @ApiModelProperty(required = true, value = "Флаг видимости социальности МСС")
  @NotNull


  public Boolean getSocialFlag() {
    return socialFlag;
  }

  public void setSocialFlag(Boolean socialFlag) {
    this.socialFlag = socialFlag;
  }

  public CategoriesSocialPropertiesResponse startDurationDate(LocalDate startDurationDate) {
    this.startDurationDate = startDurationDate;
    return this;
  }

  /**
   * Начало действия социального периода
   * @return startDurationDate
  */
  @ApiModelProperty(value = "Начало действия социального периода")

  @Valid

  public LocalDate getStartDurationDate() {
    return startDurationDate;
  }

  public void setStartDurationDate(LocalDate startDurationDate) {
    this.startDurationDate = startDurationDate;
  }

  public CategoriesSocialPropertiesResponse endDurationDate(LocalDate endDurationDate) {
    this.endDurationDate = endDurationDate;
    return this;
  }

  /**
   * Окончание действия социального периода
   * @return endDurationDate
  */
  @ApiModelProperty(value = "Окончание действия социального периода")

  @Valid

  public LocalDate getEndDurationDate() {
    return endDurationDate;
  }

  public void setEndDurationDate(LocalDate endDurationDate) {
    this.endDurationDate = endDurationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoriesSocialPropertiesResponse categoriesSocialPropertiesResponse = (CategoriesSocialPropertiesResponse) o;
    return Objects.equals(this.socialFlag, categoriesSocialPropertiesResponse.socialFlag) &&
        Objects.equals(this.startDurationDate, categoriesSocialPropertiesResponse.startDurationDate) &&
        Objects.equals(this.endDurationDate, categoriesSocialPropertiesResponse.endDurationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialFlag, startDurationDate, endDurationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriesSocialPropertiesResponse {\n");
    
    sb.append("    socialFlag: ").append(toIndentedString(socialFlag)).append("\n");
    sb.append("    startDurationDate: ").append(toIndentedString(startDurationDate)).append("\n");
    sb.append("    endDurationDate: ").append(toIndentedString(endDurationDate)).append("\n");
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

