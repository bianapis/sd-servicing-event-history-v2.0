package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogRetrieveInputModelServicingEventLogInstanceAnalysis
 */
public class CRServicingEventLogRetrieveInputModelServicingEventLogInstanceAnalysis   {
  private String servicingEventLogInstanceAnalysisReference = null;

  private String servicingEventLogInstanceAnalysisReportType = null;

  private String servicingEventLogInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return servicingEventLogInstanceAnalysisReference
  **/

  public String getServicingEventLogInstanceAnalysisReference() {
    return servicingEventLogInstanceAnalysisReference;
  }

  public void setServicingEventLogInstanceAnalysisReference(String servicingEventLogInstanceAnalysisReference) {
    this.servicingEventLogInstanceAnalysisReference = servicingEventLogInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return servicingEventLogInstanceAnalysisReportType
  **/

  public String getServicingEventLogInstanceAnalysisReportType() {
    return servicingEventLogInstanceAnalysisReportType;
  }

  public void setServicingEventLogInstanceAnalysisReportType(String servicingEventLogInstanceAnalysisReportType) {
    this.servicingEventLogInstanceAnalysisReportType = servicingEventLogInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return servicingEventLogInstanceAnalysisParameters
  **/

  public String getServicingEventLogInstanceAnalysisParameters() {
    return servicingEventLogInstanceAnalysisParameters;
  }

  public void setServicingEventLogInstanceAnalysisParameters(String servicingEventLogInstanceAnalysisParameters) {
    this.servicingEventLogInstanceAnalysisParameters = servicingEventLogInstanceAnalysisParameters;
  }


}

