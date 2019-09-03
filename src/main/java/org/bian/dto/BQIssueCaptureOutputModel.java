package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssueCaptureOutputModel
 */
public class BQIssueCaptureOutputModel   {
  private String issueCaptureActionTaskReference = null;

  private Object issueCaptureActionTaskRecord = null;

  private String issueCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issue instance capture service call 
   * @return issueCaptureActionTaskReference
  **/

  public String getIssueCaptureActionTaskReference() {
    return issueCaptureActionTaskReference;
  }

  public void setIssueCaptureActionTaskReference(String issueCaptureActionTaskReference) {
    this.issueCaptureActionTaskReference = issueCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return issueCaptureActionTaskRecord
  **/

  public Object getIssueCaptureActionTaskRecord() {
    return issueCaptureActionTaskRecord;
  }

  public void setIssueCaptureActionTaskRecord(Object issueCaptureActionTaskRecord) {
    this.issueCaptureActionTaskRecord = issueCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issue structured input transaction/record 
   * @return issueCaptureRecordReference
  **/

  public String getIssueCaptureRecordReference() {
    return issueCaptureRecordReference;
  }

  public void setIssueCaptureRecordReference(String issueCaptureRecordReference) {
    this.issueCaptureRecordReference = issueCaptureRecordReference;
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

