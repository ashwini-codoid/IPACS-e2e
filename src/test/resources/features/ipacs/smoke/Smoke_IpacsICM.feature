Feature: Validating IPACS ICM Functionality

  @Smoke
  Scenario Outline: Validate IPACS User Login

    Given I am on IPACS application
    When I enter <PartnerCode> <Username> and <Password>
    Then I see the IPACS Home Page

    Examples:
      | PartnerCode   | Username   | Password   |
      | &PARTNERCODE& | &USERNAME& | &PASSWORD& |


  @Smoke
  Scenario Outline: Validating IPACS Home tab

    Given I am on IPACS main navigation
    When I click <Home> tab
    Then I see the IPACS Welcome Page

    Examples:
      | Home |
      | Home |


  @Smoke
  Scenario Outline: Validating IPACS Company Profile tab

    Given I am on IPACS main navigation
    When I click <CompanyProfile> tab
    Then I see the Company Profile fields

    Examples:
      | CompanyProfile  |
      | Company Profile |


  @Smoke
  Scenario Outline: Validating Master List-SOPs tab

    Given I am on IPACS main navigation
    When I click <MasterListSOP> tab
    Then I should see the Master List SOP sub menu items

    Examples:
      | MasterListSOP      |
      | Master List - SOPs |

  @Smoke
  Scenario Outline: Validating Master List-Policies tab

    Given I am on IPACS main navigation
    When I click <MasterListPolicies> tab
    Then I should see the Master List Policies sub modules:
    Examples:
      | MasterListPolicies     |
      | Master List - Policies |




  @Smoke
  Scenario Outline: validating Master List - Clients Link

    Given I am on IPACS Home Page
    When I click <MasterListClients> tab
    Then I should see four sub-modules under Master List - Clients

    Examples:
      | MasterListClients      |
      | Master List - Clients  |


  @Smoke
  Scenario Outline: validating View Master List under Master List - Clients

    Given I click <MasterListClients> tab
    When I click View Master List module under Master List - Clients
    Then I should see the Master List - Clients details page

    Examples:
      | MasterListClients      |
      | Master List - Clients  |


  @Smoke
  Scenario Outline: validating Add Network Client under Master List - Clients

    Given I am on Master List - Clients details Page
    And I click <MasterListClients> tab
    When I click Add Network Client module under Master List - Clients
    Then I should see the Add Network Client page

    Examples:
      | MasterListClients      |
      | Master List - Clients  |


  @Smoke
  Scenario Outline: validating Add Client/Direct Placer under Master List - Clients

    Given I am on the Add Network Client Page
    And I click <MasterListClients> tab
    When I click Add Client/Direct Placer module under Master List - Clients
    Then I should see the Add Client/Direct Placer page

    Examples:
      | MasterListClients      |
      | Master List - Clients  |


  @Smoke
  Scenario Outline: validating Add Risk Factor under Master List - Clients

    Given I am on the Add Client/Direct Placer Page
    And I click <MasterListClients> tab
    When I click Add Risk Factor module under Master List - Clients
    Then I should see the Add Risk Factor page

    Examples:
      | MasterListClients      |
      | Master List - Clients  |






  @Smoke
  Scenario Outline: validating Documents Link

    Given I am on IPACS Home Page
    When I click <Documents> tab
    Then I should see Nine sub-modules under Documents

    Examples:
      | Documents   |
      | Documents   |

  @Smoke
  Scenario Outline: validating Add Document - SOP under Documents

    Given I click <Documents> tab
    When I click Add Document - SOP module under Documents
    Then I should see the Add Document - SOP page

    Examples:
      | Documents   |
      | Documents   |


  @Smoke
  Scenario Outline: validating Add Document - Attachment under Documents

    Given I am on Add Document - SOP Page
    And I click <Documents> tab
    When I click Add Document - Attachment module under Documents
    Then I should see the Attachment at SOP page

    Examples:
      | Documents   |
      | Documents   |


  @Smoke
  Scenario: Validating Attachment At Policy Section under Documents

    Given I am on Add Document - Attachment page
    When I click Attachment At Policy Section
    Then  I should see the Attachment At Policy page

  @Smoke
  Scenario Outline: validating Add Document - Policy under Documents

    Given I am on the Attachment At Policy page
    And I click <Documents> tab
    When I click Add Document - Policy module under Documents
    Then I should see the Add Document - Policy page

    Examples:
      | Documents   |
      | Documents   |

  @Smoke
  Scenario Outline: validating Add Document - Client Manual under Documents

    Given I am on the Add Document - Policy page
    And I click <Documents> tab
    When I click Add Document - Client Manual module under Documents
    Then I should see the Add Document - Client Manual page

    Examples:
      | Documents   |
      | Documents   |

  @Smoke
  Scenario Outline: validating Add Cover Page, Header & Footer under Documents

    Given I am on Add Document - Client Manual page
    And I click <Documents> tab
    When I click Add Cover Page, Header & Footer module under Documents
    Then I should see the Add Cover page

    Examples:
      | Documents   |
      | Documents   |

  @Smoke
  Scenario: validating Header & Footer under Documents

    Given I am on the Add Cover Page
    When I click Header & Footer section module under Documents
    Then I should see the Header & Footer page


  @Smoke
  Scenario Outline: validating View Approval List under Documents

    Given I am on the Header & Footer page
    And I click <Documents> tab
    When I click View Approval List module under Documents
    Then I should see the View Approval List page

    Examples:
      | Documents   |
      | Documents   |

  @Smoke
  Scenario Outline: validating Document Dashboard under Documents

    Given I am on the View Approval List page
    And I click <Documents> tab
    When I click View Document Dashboard module under Documents
    Then I should see the Add Document - Document Dashboard page

    Examples:
      | Documents   |
      | Documents   |

  @Smoke
  Scenario Outline: validating Document Repository under Documents

    Given I am on the Add Document - Document Dashboard page
    And I click <Documents> tab
    When I click Document Repository module under Documents
    Then I should see the Document Repository page

    Examples:
      | Documents   |
      | Documents   |


  @Smoke
  Scenario Outline: validating Mass Download under Documents

    Given I am on the Document Repository page
    And I click <Documents> tab
    When I click Mass Download module under Documents
    Then I should see the SOP Mass Download page

    Examples:
      | Documents   |
      | Documents   |

  @Smoke
  Scenario: validating Policy Mass Download under Documents

    Given I am on SOP section in Mass Download page
    When I click Policy section
    Then I should see the Policy section in Mass Download page

  @Smoke
  Scenario: validating Policy Mass Download under Documents

    Given I am on Policy section in Mass Download page
    When I click Vendor Documents section
    Then I should see the Vendor Documents section in Mass Download page






  @Smoke
  Scenario Outline: validating Assign SOPs and Policies Link

    Given I am on IPACS Home Page
    When I click <Assign SOPs and Policies> tab
    Then I should see sub-modules under Assign SOPs and Policies

    Examples:
      | Assign SOPs and Policies  |
      | Assign SOPs / Policies    |

  @Smoke
  Scenario Outline: validating Assign SOP under Assign SOPs and Policies link

    Given I click <Assign SOPs and Policies> tab
    When I click Assign SOPs and Policies module under Assign SOPs and Policies link
    Then I should see the Assign SOP page

    Examples:
      | Assign SOPs and Policies  |
      | Assign SOPs / Policies    |

  @Smoke
  Scenario: validating Assign Policies under Assign SOPs and Policies link

    Given I am on SOP section under Assign User to SOP/Policies page
    When I click Policies section
    Then I should see the Assign Policies page






  @Smoke
  Scenario Outline: validating Reports Link

    Given I am on IPACS Home Page
    When I click <Reports> tab
    Then I should see the sub-modules under Reports

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario Outline: validating Certification under Reports

    Given I click <Reports> tab
    When I click Certification module under Reports
    Then I should see the View Certification -Reports page

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario: validating Current Certification Section under SOP tab

    Given I am on View Certification -Reports page
    When  I click SOP tab under Current Certification
    Then  I should see the Current Certification page under SOP

  @Smoke
  Scenario: Validating Expired Certification Section under SOP tab

    Given I am on View Certification -Reports page
    And  I click SOP tab under Expired Certification
    When I click Expired Certification Section
    Then  I should see the Expired Certification page under SOP

  @Smoke
  Scenario: Validating Certification History Section under SOP tab

    Given I am on View Certification -Reports page
    And  I click SOP tab under Certification History
    When I click Certification History Section
    Then  I should see the Certification History Section page under SOP

  @Smoke
  Scenario: Validating Current Certification Section under Policy tab

    Given I am on View Certification -Reports page
    And  I click Policy tab under Current Certification
    When I click Current Certification Section under Policy
    Then  I should see the Current Certification page under Policy

  @Smoke
  Scenario: Validating Expired Certification Section under Policy tab

    Given I am on View Certification -Reports page
    And  I click Policy tab under Expired Certification
    When I click Expired Certification Section under Policy
    Then  I should see the Expired Certification page under Policy

  @Smoke
  Scenario: Validating Certification History Section under Policy tab

    Given I am on View Certification -Reports page
    And  I click Policy tab under Certification History
    When I click Certification History Section under Policy
    Then  I should see the Certification History page under Policy

  @Smoke
  Scenario Outline: validating Approval List Reports

    Given I am on the Certification History page under Policy
    And I click <Reports> tab
    When I click Approval List module under Reports
    Then I should see the View Approval List-Reports page

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario: Validating Current Approval list Section under SOP tab

    Given  I am on View Approval List-Reports page
    When I click SOP under Approval List Reports
    Then I should see the Current Approval list Section page under SOP

  @Smoke
  Scenario: Validating Approval list History Section under SOP tab

    Given I am on View Approval List-Reports page
    And I click SOP under Approval List Reports
    When I click Approval list History Section
    Then I should see the Approval list History Section page under SOP

  @Smoke
  Scenario: Validating Current Approval list Section under policy tab

    Given I am on View Approval List-Reports page
    When I click Policy under Approval List Reports
    Then I should see the Current Approval list Section page under Policy

  @Smoke
  Scenario: Validating Approval list History Section under Policy tab

    Given I am on View Approval List-Reports page
    And I click Policy under Approval List Reports
    When I click Approval list History Section under policy
    Then I should see the Approval list History Section page under Policy

  @Smoke
  Scenario: Validating Current Approval list Section under Test tab

    Given I am on View Approval List-Reports page
    When I click Test under Approval List Reports
    Then I should see the Current Approval list Section page Under Test

  @Smoke
  Scenario: Validating Approval list History Section under Test tab

    Given I am on View Approval List-Reports page
    And I click Test under Approval List Reports
    When I click Approval list History Section under test
    Then I should see the Approval list History Section page under Test

  @Smoke
  Scenario Outline: Validating Audit Summary-Reports under Reports

    Given I am on the Approval list History Section page under Test Page
    And I click <Reports> tab
    When I click Audit Summary-Reports
    Then I should see Internal Audit page under Audit Summary-Reports

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario: Validate External Audit tab under Audit Summary-Reports

    Given I am on  Audit Summary-Reports
    When I click External Audit tab under Audit Summary-Reports
    Then I should see External Audit page under Audit Summary-Reports

  @Smoke
  Scenario Outline: Validating Employee Report under Reports

    Given I am on the External Audit page under Audit Summary-Reports
    And I click <Reports> tab
    When I click Employee Report
    Then I should see Employee Report page

    Examples:
      | Reports  |
      | Reports  |


  @Smoke
  Scenario Outline: Validating Employee Test History Report under Reports

    Given I am on the see Employee Report page
    And I click <Reports> tab
    When I click Employee Test History Report
    Then I should see Employee Test History Report page

    Examples:
      | Reports  |
      | Reports  |


  @Smoke
  Scenario Outline: Validating Company Test History Report under Reports

    Given I am on the Employee Test History Report page
    And I click <Reports> tab
    When I click Company Test History Report
    Then I should see Company Test History Report page

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario Outline: Validating Passing Score Test Report under Reports

    Given I am on the see Company Test History Report page
    And I click <Reports> tab
    When I click Passing Score Test Report
    Then I should see Passing Score Test Report page

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario Outline: Validating Test Questions & Responses Report under Reports

    Given I am on the Passing Score Test Report page
    And I click <Reports> tab
    When I click Test Questions & Responses Report
    Then I should see Test Questions & Responses Report page

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario Outline: Validating Vendor Document Status Report under Reports

    Given I am on the Test Questions & Responses Report page
    And I click <Reports> tab
    When I click Vendor Document Status Report
    Then I should see Vendor Document Status Report page

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario Outline: Validating Vendor Details Report under Reports

    Given I am on the Vendor Document Status Report page
    And I click <Reports> tab
    When I click Vendor Details Report
    Then I should see Vendor Details Report page

    Examples:
      | Reports  |
      | Reports  |

  @Smoke
  Scenario Outline: Validating Trend Analysis of Non-Conformities under Reports

    Given I am on the Vendor Details Report page
    And I click <Reports> tab
    When I click Trend Analysis of Non-Conformities
    Then I should see Trend Analysis of Non-Conformities page

    Examples:
      | Reports  |
      | Reports  |






  @Smoke
  Scenario Outline: Validating Admin Section Link

    Given I am on IPACS Home Page
    When I click <AdminSection> tab
    Then I should see sub-modules under Admin Section

    Examples:
      | AdminSection  |
      | Admin Section |

  @Smoke
  Scenario Outline: Validating Add New User via Admin Section

    Given I click <AdminSection> tab
    When I click Add New User
    Then I should verify the Add New User page

    Examples:
      | AdminSection  |
      | Admin Section |

  @Smoke
  Scenario Outline: Validating Edit User via Admin Section

    Given I am on the Add New User page
    And I click <AdminSection> tab
    When I click Edit User
    Then I should verify the Edit User page

    Examples:
      | AdminSection  |
      | Admin Section |

  @Smoke
  Scenario Outline: Validating Add Title via Admin Section

    Given I am on the Edit User page
    And I click <AdminSection> tab
    When I click Add Title
    Then I should verify the Add Title page

    Examples:
      | AdminSection  |
      | Admin Section |

  @Smoke
  Scenario Outline: Validating Edit Title via Admin Section

    Given I am on the Add Title page
    And I click <AdminSection> tab
    When I click Edit Title
    Then I should verify the Edit Title page

    Examples:
      | AdminSection  |
      | Admin Section |

  @Smoke
  Scenario Outline: Validating IPACS Administration via Admin Section

    Given I am on the Edit Title page
    And I click <AdminSection> tab
    When I click IPACS Administration
    Then I should verify the IPACS Administration page

    Examples:
      | AdminSection  |
      | Admin Section |

  @Smoke
  Scenario: Validating User logs Section under IPACS Administration

    Given I am on IPACS Administration page
    When I click User logs
    Then I should verify the User logs under IPACS Administration page

  @Smoke
  Scenario: Validating User login History under IPACS Administration

    Given I am on IPACS Administration page
    When I click User login History
    Then I should verify the User login History under IPACS Administration page

  @Smoke
  Scenario: Validating Locked tests under IPACS Administration

    Given I am on IPACS Administration page
    When I click Locked tests
    Then I should verify the Locked tests under IPACS Administration page

  @Smoke
  Scenario: Validating Manage object under IPACS Administration

    Given I am on IPACS Administration page
    When I click Manage objects
    Then I should verify the Manage objects under IPACS Administration page

  @Smoke
  Scenario: Validating Delete SOP Manage objects under IPACS Administration

    Given I am on Manage objects Sub-module under IPACS Administration page
    When I click Delete SOP section
    Then I should verify the Delete SOP Manage objects under IPACS Administration page

  @Smoke
  Scenario: Validating Delete Policy Manage objects under IPACS Administration

    Given I am on Delete SOP Manage objects under IPACS Administration page
    When I click Delete Policy section
    Then I should verify the Delete Policy Manage object under IPACS Administration page

  @Smoke
  Scenario: Validating Delete Client Manage objects under IPACS Administration

    Given I am on Delete Policy Manage object under IPACS Administration page
    When I click Delete Client section
    Then I should verify the Delete Client Manage objects under IPACS Administration page

  @Smoke
  Scenario: Validating Delete Employee Test Course Manage objects under IPACS Administration

    Given I am on Delete Client Manage objects under IPACS Administration page
    When I click Delete Employee Test Course section
    Then I should verify the Delete Employee Test Course Manage objects under IPACS Administration page

  @Smoke
  Scenario: Validating Delete Vendor Manage objects under IPACS Administration

    Given I am on Delete Employee Test Course Manage objects under IPACS Administration page
    When I click Delete Vendor section
    Then I should verify the Delete Vendor Manage objects under IPACS Administration page

  @Smoke
  Scenario: Validating Access Control under IPACS Administration

    Given I am on IPACS Administration page
    When I click Access Control
    Then I should verify the Access Control under IPACS Administration page

  @Smoke
  Scenario: Validating Printing  Access Control under IPACS Administration

    Given I am on Access Control Sub-module under IPACS Administration page
    When I click Printing section
    Then I should verify the Printing Access Control under IPACS Administration page

  @Smoke
  Scenario: Validating IP Restriction Access Control under IPACS Administration

    Given I am on Printing Access Control under IPACS Administration page
    When I click IP Restriction section
    Then I should verify the IP Restriction Access Control under IPACS Administration page

  @Smoke
  Scenario: Validating Logo Access Control under IPACS Administration

    Given I am on IP Restriction Access Control under IPACS Administration page
    When I click Logo section
    Then I should verify the Logo Access Control under IPACS Administration page

  @Smoke
  Scenario: Validating Training Materials Access Control under IPACS Administration

    Given I am on Logo Access Control under IPACS Administration page
    When I click Training Materials section
    Then I should verify the Training Materials Access Control under IPACS Administration page

  @Smoke
  Scenario: Validating Documents Certification Access Control under IPACS Administration

    Given I am on Training Materials Access Control under IPACS Administration page
    When I click Documents Certification section
    Then I should verify the Documents Certification Access Control under IPACS Administration page

  @Smoke
  Scenario: Validating Notification Settings under IPACS Administration

    Given I am on IPACS Administration page
    When I click Notification Settings
    Then I should verify the Notification Settings under IPACS Administration page

  @Smoke
  Scenario: Validating Send User Passwords under IPACS Administration

    Given I am on IPACS Administration page
    When I click Send User Passwords
    Then I should verify the Send User Passwords under IPACS Administration page

  @Smoke
  Scenario: Validating IPACS Usage Report under IPACS Administration

    Given I am on IPACS Administration page
    When I click IPACS Usage Report
    Then I should verify the IPACS Usage Report under IPACS Administration page

  @Smoke
  Scenario: Validating Alert Settings under IPACS Administration

    Given I am on IPACS Administration page
    When I click IPACS Alert Settings
    Then I should verify the Alert Settings under IPACS Administration page

  @Smoke
  Scenario Outline: Validating Automated User Creation

    Given I am on the IPACS Administration page
    And I click <AdminSection> tab
    When I click Automated User Creation
    Then I should verify the Automated User Creation page
    Examples:
      | AdminSection  |
      | Admin Section |






  @Smoke
  Scenario Outline: IPACS user verify Internal Audit page after clicking the option from Audit and compliance tab

    Given I am on IPACS Home Page
    And I click <AuditAndCompliance> tab
    When I click <InternalAudit> option from Audit and Compliance
    Then I should verify the Internal Audit Page
    Examples:
      | AuditAndCompliance   | InternalAudit |
      | Audit and Compliance | Internal Audit|

  @Smoke
  Scenario: IPACS user validate Audit profile under Internal audit

    Given I am on Internal Audit page
    When I click on Audit profile Tab
    Then I should verify the Audit Profile Tab under Internal Audit page

  @Smoke
  Scenario: IPACS user validate Audit management under Internal audit

    Given I am on Internal Audit page
    When I click on Audit Management Tab
    Then I should verify the Audit Management Tab under Internal Audit page

  @Smoke
  Scenario: IPACS user validate Audit Document under Internal audit

    Given I am on Internal Audit page
    When I click on Audit Documents Tab
    Then I should verify the Audit Documents Tab under Internal Audit page

  @Smoke
  Scenario: IPACS user validate Scorecard Template under Internal audit

    Given I am on Internal Audit page
    When I click on Scorecard Template Tab
    Then I should verify the Scorecard Template Tab under Internal Audit page

  @Smoke
  Scenario: IPACS user validate Scorecard Analysis under Internal audit

    Given I am on Internal Audit page
    When I click on Scorecard Analysis Tab
    Then I should verify the Scorecard Analysis Tab under Internal audit page

  @Smoke
  Scenario Outline: IPACS user verify External Audit page after clicking the option from Audit and compliance tab

    Given I am the Scorecard Analysis Tab under Internal audit page
    And I click <AuditAndCompliance> tab
    When I click <ExternalAudit> option from Audit and Compliance
    Then I should verify the External Audit page
    Examples:
      | AuditAndCompliance   | ExternalAudit |
      | Audit and Compliance | External Audit|

  @Smoke
  Scenario: IPACS user Validate Company data for audit under External audit

    Given I am on External Audit page
    When I click on Company data for Audit Tab
    Then I should verify the Company Data for Audit Tab under External Audit page

  @Smoke
  Scenario: IPACS user Validate Client audits under External audit

    Given I am on External Audit page
    When I click on Client Audits Tab
    Then I should verify the Client Audits under External Audit page

  @Smoke
  Scenario: IPACS user Validate Client audits under External audit

    Given I am on External Audit page
    And I click on Client Audits Tab
    When I click Questionnaire
    Then I should verify the Questionnaire under External audit

  @Smoke
  Scenario: IPACS user Validate Add new audit type under External audit

    Given I am on External Audit page
    And I click on Client Audits Tab
    When I click Add New Audit Type
    Then I should verify the Add New Audit Type under External audit

  @Smoke
  Scenario: IPACS user Validate Audit management under External audit

    Given I am on External Audit page
    And I click on Client Audits Tab
    When I click Audit Management
    Then I should verify the Audit Management under External audit

  @Smoke
  Scenario: IPACS user Validate Audit Documents under External audit

    Given I am on External Audit page
    And I click on Client Audits Tab
    When I click Audit Documents
    Then I should verify the Audit Documents under External audit

  @Smoke
  Scenario Outline: IPACS user validate Non-Conformity and corrective action

    Given I am on the Audit Documents under External audit page
    And I click <AuditAndCompliance> tab
    When I click <Non-ConformityAndCorrectiveAction> option from Audit and Compliance
    Then I should verify the Non-Conformity And Corrective Action page
    Examples:
      | AuditAndCompliance   | Non-ConformityAndCorrectiveAction |
      | Audit and Compliance | Non-Conformity And Corrective Action |

  @Smoke
  Scenario: IPACS user Validate Non-Conformity log under Non-Conformity and Corrective Action

    Given I am on Non-Conformity and Corrective Action page
    When I click Non-Conformity log
    Then I should verify the Non-Conformity log under Non-Conformity and Corrective Action page

  @Smoke
  Scenario: IPACS user Validate Add Non-Conformity under Non-Conformity and Corrective Action

    Given I am on Non-Conformity and Corrective Action page
    When I click Add Non-Conformity
    Then I should verify the Add Non-Conformity under Non-Conformity and Corrective Action page

  @Smoke
  Scenario: IPACS user Validate Corrective Action under Non-Conformity and Corrective Action

    Given I am on Non-Conformity and Corrective Action page
    When I click Corrective Action
    Then I should verify the Corrective Action under Non-Conformity and corrective Action page

  @Smoke
  Scenario Outline: IPACS user Validate Client Issue

    Given I am on the Corrective Action under Non-Conformity and corrective Action page
    And I click <AuditAndCompliance> tab
    When I click <ClientIssue> option from Audit and Compliance
    Then I should verify the Client Issue page
    Examples:
      | AuditAndCompliance   | ClientIssue |
      | Audit and Compliance | Client Issue|

  @Smoke
  Scenario: IPACS user Validate Client Issue log under Client Issue

    Given I am on Client Issue page
    When I click Client Issue log
    Then I should verify the Client Issue log under Client Issue page

  @Smoke
  Scenario: IPACS user Validate Client Issue log under Client Issue

    Given I am on Client Issue page
    When I click Add Client Issue
    Then I should verify the Add Client Issue under Client Issue







  @Smoke
  Scenario Outline: validating Employee and Training Link

    Given I am on IPACS Home Page
    When I click <EmployeeAndTraining> tab
    Then I should see sub-modules under Employee and Training Section
    Examples:
      | EmployeeAndTraining  |
      | Employee and Training|

  @Smoke
  Scenario Outline: validating Employee

    Given I click <EmployeeAndTraining> tab
    When I click Employee module
    Then I should verify User Profile page
    Examples:
      | EmployeeAndTraining  |
      | Employee and Training|

  @Smoke
  Scenario: validating Tests and Assignments under Employee

    Given I am on user profile page
    When I click Tests and Assignments
    Then  I should verify the Tests and Assignments under User page

  @Smoke
  Scenario Outline: validating Test course profile

    Given I am on the Tests and Assignments under User page
    And I click <EmployeeAndTraining> tab
    When I click Test course profile
    Then I should verify Test profile page
    Examples:
      | EmployeeAndTraining  |
      | Employee and Training|


  @Smoke
  Scenario: validating Training Material under Test course profile

    Given I am on Test profile page
    When I click Training Material
    Then  I should verify the Training Material page

  @Smoke
  Scenario: validating Edit Test Profile under Test course profile

    Given I am on Training Material page
    When I click Edit Test Profile
    Then  I should verify the Edit Test Profile page

  @Smoke
  Scenario: validating Create Edit Questions under Test course profile

    Given I am on Edit Test Profile page
    When I click Create Edit Questions
    Then  I should verify the Create Edit Questions page

  @Smoke
  Scenario Outline: validating Add Test course

    Given I am on the Create Edit Questions page
    And I click <EmployeeAndTraining> tab
    When I click Add Test course
    Then I should verify Add Test course  page
    Examples:
      | EmployeeAndTraining  |
      | Employee and Training|






  @Smoke
  Scenario Outline: Validating vendor management Link

    Given I am on IPACS Home Page
    When  I click <VendorManagement> tab
    Then I should see the sub-modules under vendor management
    Examples:
      | VendorManagement  |
      | Vendor Management |


  @Smoke
  Scenario Outline: Validating  View master list under Vendor management

    Given I click <VendorManagement> tab
    When I click View master list under Vendor management
    Then I should see Master List- Vendor page
    Examples:
      | VendorManagement  |
      | Vendor Management |

  @Smoke
  Scenario Outline: Validating Add vendor under Vendor management

    Given I am on the Master List- Vendor page
    And I click <VendorManagement> tab
    When I click Add vendor under Vendor management
    Then I should see Add vendor page
    Examples:
      | VendorManagement  |
      | Vendor Management |


  @Smoke
  Scenario: Validating Documentation under Add vendor

    Given I am on Add vendor page
    When I click Documentation under Vendor management
    Then I should see the Documentation page

  @Smoke
  Scenario Outline: Validating Add vendor category under Vendor management

    Given I am on the Documentation page
    And I click <VendorManagement> tab
    When I click Add vendor category under Vendor management
    Then I should see Add vendor category page
    Examples:
      | VendorManagement  |
      | Vendor Management |






  @Smoke
  Scenario Outline: Validating Complaints Disputes Mgmt Link

    Given I am on IPACS Home Page
    When I click <ComplaintsDisputesMgmt> tab
    Then I should see sub-modules under Complaints Disputes Mgmt
    Examples:
      | ComplaintsDisputesMgmt  |
      | Complaints/Disputes Mgmt|

  @Smoke
  Scenario Outline: Validating Add Complaint via Complaints Disputes Mgmt

    Given I click <ComplaintsDisputesMgmt> tab
    When I click Add Complaint
    Then I should see Add Complaint page
    Examples:
      | ComplaintsDisputesMgmt  |
      | Complaints/Disputes Mgmt|

  @Smoke
  Scenario Outline: Validating Complaints Disputes Log via Complaints Disputes Mgmt

    Given I am on the Add Complaint page
    And I click <ComplaintsDisputesMgmt> tab
    When I click Complaints Disputes Log
    Then I should see Complaints Disputes Log page
    Examples:
      | ComplaintsDisputesMgmt  |
      | Complaints/Disputes Mgmt|

  @Smoke
  Scenario: Validating Imported Records via Complaints Disputes Mgmt

    Given I am on Complaints Disputes Log page
    When I click Imported Records
    Then I should see Imported Records page

  @Smoke
  Scenario Outline: Validating Client Specific Log via Complaints Disputes Mgmt

    Given I am on the Imported Records page
    And I click <ComplaintsDisputesMgmt> tab
    When I click Client Specific Complaint Log
    Then I should see View Client Specific Complaint Log page
    Examples:
      | ComplaintsDisputesMgmt  |
      | Complaints/Disputes Mgmt|

  @Smoke
  Scenario: Validating Add Edit Template under Client Specific Log

    Given I am on Complaint Log Setup page
    When I click Add Edit Template
    Then I should see Add Edit Template page under Client Specific Log

  @Smoke
  Scenario: Validating Manage Template under Client Specific Log

    Given I am on Add Edit Template page under Client Specific Log
    When I click Manage Template
    Then I should see Manage Template page

  @Smoke
  Scenario: Validating Client Specific Complaint Instructions under Client Specific Log

    Given I am on Manage Template page
    When I click Client Specific Complaint Instructions
    Then I should see Client Specific Complaint Instructions page

  @Smoke
  Scenario Outline: Validating Import Complaints Disputes via Complaints Disputes Mgmt

    Given I am on the Client Specific Complaint Instructions page
    And I click <ComplaintsDisputesMgmt> tab
    When I click Import Complaints Disputes
    Then I should see Import Complaints Disputes page
    Examples:
      | ComplaintsDisputesMgmt  |
      | Complaints/Disputes Mgmt|

  @Smoke
  Scenario Outline: Validating Complaint Dispute Set Up via Complaints Disputes Mgmt

    Given I am the Import Complaints Disputes page
    And I click <ComplaintsDisputesMgmt> tab
    When I click Complaint Dispute Set Up
    Then I should see Add Edit Template page under Complaint Dispute Set Up
    Examples:
      | ComplaintsDisputesMgmt  |
      | Complaints/Disputes Mgmt|

  @Smoke
  Scenario: Validating Classify Step one Attribute via Complaints Disputes Mgmt

    Given I am on Complaint Dispute Log Setup page
    When I click Classify Step one Attribute
    Then I should see Classify Step one Attribute page

  @Smoke
  Scenario: Validating Ccp Attribute via Complaints Disputes Mgmt

    Given I am on Classify Step one Attribute page
    When I click Ccp Attribute
    Then I should see Access window






  @Smoke
  Scenario Outline: Validating Master List-Vendors Link

    Given I am on IPACS Home Page
    When I click <MasterListVendors> tab
    Then I should see sub-modules under Master List-Vendors
    Examples:
      | MasterListVendors    |
      | Master List - Vendors|

  @Smoke
  Scenario Outline: Validating  View Master List via Master List-Vendors

    Given I click <MasterListVendors> tab
    When I click View Master List under Master List-Vendors
    Then I should see Master List-Vendor page
    Examples:
      | MasterListVendors    |
      | Master List - Vendors|

  @Smoke
  Scenario Outline: Validating Add Vendor via Master List-Vendors

    Given I am on the Master List-Vendor page
    And I click <MasterListVendors> tab
    When I click Add Vendor
    Then I should see Add Vendor page
    Examples:
      | MasterListVendors    |
      | Master List - Vendors|

  @Smoke
  Scenario Outline:  Validating Add Vendor Category via Master List-Vendors

    Given I am on the Add Vendor page
    And I click <MasterListVendors> tab
    When I click Add Vendor Category
    Then I should see Add Vendor Category page
    Examples:
      | MasterListVendors    |
      | Master List - Vendors|






  @Smoke
  Scenario Outline: Validating BCP Management Link

    Given I am on IPACS Home Page
    When I click <BCPManagements> tab
    Then I should see sub-modules under BCP Management
    Examples:
      | BCPManagements  |
      | BCP Management  |

  @Smoke
  Scenario Outline: Validating View_Master List via BCP Management

    Given I click <BCPManagements> tab
    When I click View Master List under BCP Management
    Then I should see Master List - Business Continuity Plan page
    Examples:
      | BCPManagements  |
      | BCP Management  |
