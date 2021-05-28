Feature: Update To The Existing Incident From ServiceNow Application

Background:
Given Load Url 'https://dev103117.service-now.com/'
When Type Username As 'admin'
And Type Password As 'India@123'
And Click Login Button

Scenario Outline: Fill The Mandatory Fields
And Click Fillter And Search Tab <value>
And Click Service Desk Incidents
Then Click And Search Incidents Number
And Type The Update Incident Number <number>
And Select The Check Box
And Click Delete Incident Name Link Button
And Click Delete Incident Button






Examples: 
|value|number|
|incidents|INC0010068|