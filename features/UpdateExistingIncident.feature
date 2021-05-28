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
And Click Priority Check Box
Then Click Priority Update Selected Box
And Click And Enter State
Then Enter Update Short Description <value1>
Then Finally Click Update





Examples: 
|value|number|value1|
|incidents|INC0011689|Updated For Existing Incident|