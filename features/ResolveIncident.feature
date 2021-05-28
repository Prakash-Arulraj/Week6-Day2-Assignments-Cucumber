Feature: Resolve To The Existing Incident From ServiceNow Application

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
Then Click Assignment group
And Window Handling To CallerId SubWindow
And Click And Search Assignment Group <search>
Then Click First Match For Assignment Group
Then Sub Window Again Comes To Parent Window
Then Enter Update Short Description <value1>
And Enter To The Solved Notes <notes>
And Click Resolution Information
Then Select Resolution Code
Then Finally Click Update
Then Click And Search Incidents Number
And Type The Update Incident Number <number>
And Select The Check Box
Then Verify The Resolved Incidents





Examples: 
|value|number|search|value1|notes|number|
|incidents|INC0009001|software|Updated For Existing Incident|solved|INC0009001|