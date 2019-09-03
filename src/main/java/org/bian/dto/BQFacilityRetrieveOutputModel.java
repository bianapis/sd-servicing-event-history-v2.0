package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFacilityRetrieveOutputModelFacilityInstanceAnalysis;
import org.bian.dto.BQFacilityRetrieveOutputModelFacilityInstanceRecord;
import org.bian.dto.BQFacilityRetrieveOutputModelFacilityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFacilityRetrieveOutputModel
 */
public class BQFacilityRetrieveOutputModel   {
  private BQFacilityRetrieveOutputModelFacilityInstanceRecord facilityInstanceRecord = null;

  private String facilityRetrieveActionTaskReference = null;

  private Object facilityRetrieveActionTaskRecord = null;

  private String facilityRetrieveActionResponse = null;

  private BQFacilityRetrieveOutputModelFacilityInstanceReport facilityInstanceReport = null;

  private BQFacilityRetrieveOutputModelFacilityInstanceAnalysis facilityInstanceAnalysis = null;


  /**
   * Get facilityInstanceRecord
   * @return facilityInstanceRecord
  **/

  public BQFacilityRetrieveOutputModelFacilityInstanceRecord getFacilityInstanceRecord() {
    return facilityInstanceRecord;
  }

  public void setFacilityInstanceRecord(BQFacilityRetrieveOutputModelFacilityInstanceRecord facilityInstanceRecord) {
    this.facilityInstanceRecord = facilityInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Facility instance retrieve service call 
   * @return facilityRetrieveActionTaskReference
  **/

  public String getFacilityRetrieveActionTaskReference() {
    return facilityRetrieveActionTaskReference;
  }

  public void setFacilityRetrieveActionTaskReference(String facilityRetrieveActionTaskReference) {
    this.facilityRetrieveActionTaskReference = facilityRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return facilityRetrieveActionTaskRecord
  **/

  public Object getFacilityRetrieveActionTaskRecord() {
    return facilityRetrieveActionTaskRecord;
  }

  public void setFacilityRetrieveActionTaskRecord(Object facilityRetrieveActionTaskRecord) {
    this.facilityRetrieveActionTaskRecord = facilityRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return facilityRetrieveActionResponse
  **/

  public String getFacilityRetrieveActionResponse() {
    return facilityRetrieveActionResponse;
  }

  public void setFacilityRetrieveActionResponse(String facilityRetrieveActionResponse) {
    this.facilityRetrieveActionResponse = facilityRetrieveActionResponse;
  }


  /**
   * Get facilityInstanceReport
   * @return facilityInstanceReport
  **/

  public BQFacilityRetrieveOutputModelFacilityInstanceReport getFacilityInstanceReport() {
    return facilityInstanceReport;
  }

  public void setFacilityInstanceReport(BQFacilityRetrieveOutputModelFacilityInstanceReport facilityInstanceReport) {
    this.facilityInstanceReport = facilityInstanceReport;
  }


  /**
   * Get facilityInstanceAnalysis
   * @return facilityInstanceAnalysis
  **/

  public BQFacilityRetrieveOutputModelFacilityInstanceAnalysis getFacilityInstanceAnalysis() {
    return facilityInstanceAnalysis;
  }

  public void setFacilityInstanceAnalysis(BQFacilityRetrieveOutputModelFacilityInstanceAnalysis facilityInstanceAnalysis) {
    this.facilityInstanceAnalysis = facilityInstanceAnalysis;
  }


}

