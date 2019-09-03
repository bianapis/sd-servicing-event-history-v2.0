package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFacilityCaptureInputModelSessionInstanceRecord
 */
public class BQFacilityCaptureInputModelSessionInstanceRecord   {
  private String customerContactReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the complete contact record for the customer contact 
   * @return customerContactReference
  **/

  public String getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(String customerContactReference) {
    this.customerContactReference = customerContactReference;
  }


}

