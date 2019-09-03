package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionCaptureOutputModel
 */
public class BQSessionCaptureOutputModel   {
  private String sessionCaptureActionTaskReference = null;

  private Object sessionCaptureActionTaskRecord = null;

  private String sessionCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Session instance capture service call 
   * @return sessionCaptureActionTaskReference
  **/

  public String getSessionCaptureActionTaskReference() {
    return sessionCaptureActionTaskReference;
  }

  public void setSessionCaptureActionTaskReference(String sessionCaptureActionTaskReference) {
    this.sessionCaptureActionTaskReference = sessionCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return sessionCaptureActionTaskRecord
  **/

  public Object getSessionCaptureActionTaskRecord() {
    return sessionCaptureActionTaskRecord;
  }

  public void setSessionCaptureActionTaskRecord(Object sessionCaptureActionTaskRecord) {
    this.sessionCaptureActionTaskRecord = sessionCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Session structured input transaction/record 
   * @return sessionCaptureRecordReference
  **/

  public String getSessionCaptureRecordReference() {
    return sessionCaptureRecordReference;
  }

  public void setSessionCaptureRecordReference(String sessionCaptureRecordReference) {
    this.sessionCaptureRecordReference = sessionCaptureRecordReference;
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

