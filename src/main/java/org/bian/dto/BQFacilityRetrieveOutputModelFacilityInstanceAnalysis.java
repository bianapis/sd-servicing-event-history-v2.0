package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFacilityRetrieveOutputModelFacilityInstanceAnalysis
 */
public class BQFacilityRetrieveOutputModelFacilityInstanceAnalysis   {
  private Object facilityInstanceAnalysisRecord = null;

  private String facilityInstanceAnalysisReportType = null;

  private String facilityInstanceAnalysisParameters = null;

  private Object facilityInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return facilityInstanceAnalysisRecord
  **/

  public Object getFacilityInstanceAnalysisRecord() {
    return facilityInstanceAnalysisRecord;
  }

  public void setFacilityInstanceAnalysisRecord(Object facilityInstanceAnalysisRecord) {
    this.facilityInstanceAnalysisRecord = facilityInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return facilityInstanceAnalysisReportType
  **/

  public String getFacilityInstanceAnalysisReportType() {
    return facilityInstanceAnalysisReportType;
  }

  public void setFacilityInstanceAnalysisReportType(String facilityInstanceAnalysisReportType) {
    this.facilityInstanceAnalysisReportType = facilityInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return facilityInstanceAnalysisParameters
  **/

  public String getFacilityInstanceAnalysisParameters() {
    return facilityInstanceAnalysisParameters;
  }

  public void setFacilityInstanceAnalysisParameters(String facilityInstanceAnalysisParameters) {
    this.facilityInstanceAnalysisParameters = facilityInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return facilityInstanceAnalysisReport
  **/

  public Object getFacilityInstanceAnalysisReport() {
    return facilityInstanceAnalysisReport;
  }

  public void setFacilityInstanceAnalysisReport(Object facilityInstanceAnalysisReport) {
    this.facilityInstanceAnalysisReport = facilityInstanceAnalysisReport;
  }


}

