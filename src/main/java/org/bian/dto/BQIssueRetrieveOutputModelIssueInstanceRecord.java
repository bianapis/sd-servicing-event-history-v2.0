package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssueRetrieveOutputModelIssueInstanceRecord
 */
public class BQIssueRetrieveOutputModelIssueInstanceRecord   {
  private String servicingPositionReference = null;

  private String servicingPositionSessionReference = null;

  private String employeeBusinessUnitReference = null;

  private String productionIssueType = null;

  private String productionIssueDescription = null;

  private String productionIssueDiagnosis = null;

  private String productionIssueResolutionTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service position where issue arises 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the servicing session 
   * @return servicingPositionSessionReference
  **/

  public String getServicingPositionSessionReference() {
    return servicingPositionSessionReference;
  }

  public void setServicingPositionSessionReference(String servicingPositionSessionReference) {
    this.servicingPositionSessionReference = servicingPositionSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee or unit raising the issue 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of event/error being recorded (e.g. support facility failure) 
   * @return productionIssueType
  **/

  public String getProductionIssueType() {
    return productionIssueType;
  }

  public void setProductionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the issue and involved functions, parties 
   * @return productionIssueDescription
  **/

  public String getProductionIssueDescription() {
    return productionIssueDescription;
  }

  public void setProductionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An evaluation of the event cause and impact 
   * @return productionIssueDiagnosis
  **/

  public String getProductionIssueDiagnosis() {
    return productionIssueDiagnosis;
  }

  public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of corrective actions and assigned parties 
   * @return productionIssueResolutionTask
  **/

  public String getProductionIssueResolutionTask() {
    return productionIssueResolutionTask;
  }

  public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
  }


}

