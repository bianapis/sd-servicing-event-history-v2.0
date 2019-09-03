package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFacilityRetrieveOutputModelFacilityInstanceReport
 */
public class BQFacilityRetrieveOutputModelFacilityInstanceReport   {
  private Object facilityInstanceReportRecord = null;

  private String facilityInstanceReportType = null;

  private String facilityInstanceReportParameters = null;

  private Object facilityInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return facilityInstanceReportRecord
  **/

  public Object getFacilityInstanceReportRecord() {
    return facilityInstanceReportRecord;
  }

  public void setFacilityInstanceReportRecord(Object facilityInstanceReportRecord) {
    this.facilityInstanceReportRecord = facilityInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return facilityInstanceReportType
  **/

  public String getFacilityInstanceReportType() {
    return facilityInstanceReportType;
  }

  public void setFacilityInstanceReportType(String facilityInstanceReportType) {
    this.facilityInstanceReportType = facilityInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return facilityInstanceReportParameters
  **/

  public String getFacilityInstanceReportParameters() {
    return facilityInstanceReportParameters;
  }

  public void setFacilityInstanceReportParameters(String facilityInstanceReportParameters) {
    this.facilityInstanceReportParameters = facilityInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return facilityInstanceReport
  **/

  public Object getFacilityInstanceReport() {
    return facilityInstanceReport;
  }

  public void setFacilityInstanceReport(Object facilityInstanceReport) {
    this.facilityInstanceReport = facilityInstanceReport;
  }


}

