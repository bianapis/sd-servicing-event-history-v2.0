package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceAnalysis
 */
public class CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceAnalysis   {
  private String servicingEventLogInstanceAnalysisData = null;

  private String servicingEventLogInstanceAnalysisReportType = null;

  private Object servicingEventLogInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return servicingEventLogInstanceAnalysisData
  **/

  public String getServicingEventLogInstanceAnalysisData() {
    return servicingEventLogInstanceAnalysisData;
  }

  public void setServicingEventLogInstanceAnalysisData(String servicingEventLogInstanceAnalysisData) {
    this.servicingEventLogInstanceAnalysisData = servicingEventLogInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return servicingEventLogInstanceAnalysisReport
  **/

  public Object getServicingEventLogInstanceAnalysisReport() {
    return servicingEventLogInstanceAnalysisReport;
  }

  public void setServicingEventLogInstanceAnalysisReport(Object servicingEventLogInstanceAnalysisReport) {
    this.servicingEventLogInstanceAnalysisReport = servicingEventLogInstanceAnalysisReport;
  }


}

