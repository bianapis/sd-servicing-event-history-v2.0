package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFacilityRetrieveInputModelFacilityInstanceAnalysis;
import org.bian.dto.BQFacilityRetrieveInputModelFacilityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFacilityRetrieveInputModel
 */
public class BQFacilityRetrieveInputModel   {
  private Object facilityRetrieveActionTaskRecord = null;

  private String facilityRetrieveActionRequest = null;

  private BQFacilityRetrieveInputModelFacilityInstanceReport facilityInstanceReport = null;

  private BQFacilityRetrieveInputModelFacilityInstanceAnalysis facilityInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return facilityRetrieveActionRequest
  **/

  public String getFacilityRetrieveActionRequest() {
    return facilityRetrieveActionRequest;
  }

  public void setFacilityRetrieveActionRequest(String facilityRetrieveActionRequest) {
    this.facilityRetrieveActionRequest = facilityRetrieveActionRequest;
  }


  /**
   * Get facilityInstanceReport
   * @return facilityInstanceReport
  **/

  public BQFacilityRetrieveInputModelFacilityInstanceReport getFacilityInstanceReport() {
    return facilityInstanceReport;
  }

  public void setFacilityInstanceReport(BQFacilityRetrieveInputModelFacilityInstanceReport facilityInstanceReport) {
    this.facilityInstanceReport = facilityInstanceReport;
  }


  /**
   * Get facilityInstanceAnalysis
   * @return facilityInstanceAnalysis
  **/

  public BQFacilityRetrieveInputModelFacilityInstanceAnalysis getFacilityInstanceAnalysis() {
    return facilityInstanceAnalysis;
  }

  public void setFacilityInstanceAnalysis(BQFacilityRetrieveInputModelFacilityInstanceAnalysis facilityInstanceAnalysis) {
    this.facilityInstanceAnalysis = facilityInstanceAnalysis;
  }


}

