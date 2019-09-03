package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQFacilityCaptureInputModelFacilityInstanceRecord;
import org.bian.dto.BQFacilityCaptureInputModelSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFacilityCaptureInputModel
 */
public class BQFacilityCaptureInputModel   {
  private BQFacilityCaptureInputModelSessionInstanceRecord sessionInstanceRecord = null;

  private String servicingEventLogInstanceReference = null;

  private String facilityInstanceReference = null;

  private BQFacilityCaptureInputModelFacilityInstanceRecord facilityInstanceRecord = null;

  private Object facilityCaptureActionTaskRecord = null;

  private BQAssignmentCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * Get sessionInstanceRecord
   * @return sessionInstanceRecord
  **/

  public BQFacilityCaptureInputModelSessionInstanceRecord getSessionInstanceRecord() {
    return sessionInstanceRecord;
  }

  public void setSessionInstanceRecord(BQFacilityCaptureInputModelSessionInstanceRecord sessionInstanceRecord) {
    this.sessionInstanceRecord = sessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Servicing Event Log instance 
   * @return servicingEventLogInstanceReference
  **/

  public String getServicingEventLogInstanceReference() {
    return servicingEventLogInstanceReference;
  }

  public void setServicingEventLogInstanceReference(String servicingEventLogInstanceReference) {
    this.servicingEventLogInstanceReference = servicingEventLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Facility instance 
   * @return facilityInstanceReference
  **/

  public String getFacilityInstanceReference() {
    return facilityInstanceReference;
  }

  public void setFacilityInstanceReference(String facilityInstanceReference) {
    this.facilityInstanceReference = facilityInstanceReference;
  }


  /**
   * Get facilityInstanceRecord
   * @return facilityInstanceRecord
  **/

  public BQFacilityCaptureInputModelFacilityInstanceRecord getFacilityInstanceRecord() {
    return facilityInstanceRecord;
  }

  public void setFacilityInstanceRecord(BQFacilityCaptureInputModelFacilityInstanceRecord facilityInstanceRecord) {
    this.facilityInstanceRecord = facilityInstanceRecord;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQAssignmentCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQAssignmentCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

