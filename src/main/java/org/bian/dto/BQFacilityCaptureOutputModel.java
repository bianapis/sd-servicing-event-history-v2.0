package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFacilityCaptureOutputModel
 */
public class BQFacilityCaptureOutputModel   {
  private String facilityCaptureActionTaskReference = null;

  private Object facilityCaptureActionTaskRecord = null;

  private String facilityCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Facility instance capture service call 
   * @return facilityCaptureActionTaskReference
  **/

  public String getFacilityCaptureActionTaskReference() {
    return facilityCaptureActionTaskReference;
  }

  public void setFacilityCaptureActionTaskReference(String facilityCaptureActionTaskReference) {
    this.facilityCaptureActionTaskReference = facilityCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return facilityCaptureActionTaskRecord
  **/

  public Object getFacilityCaptureActionTaskRecord() {
    return facilityCaptureActionTaskRecord;
  }

  public void setFacilityCaptureActionTaskRecord(Object facilityCaptureActionTaskRecord) {
    this.facilityCaptureActionTaskRecord = facilityCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Facility structured input transaction/record 
   * @return facilityCaptureRecordReference
  **/

  public String getFacilityCaptureRecordReference() {
    return facilityCaptureRecordReference;
  }

  public void setFacilityCaptureRecordReference(String facilityCaptureRecordReference) {
    this.facilityCaptureRecordReference = facilityCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

