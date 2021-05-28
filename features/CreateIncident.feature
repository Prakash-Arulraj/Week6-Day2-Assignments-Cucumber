Feature: Login To The ServiceNow Application

Background:
Given Load Url 'https://dev103117.service-now.com/'
When Type Username As 'admin'
And Type Password As 'India@123'
And Click Login Button

Scenario Outline: Fill The Mandatory Fields
And Click Fillter And Search Tab <value>
Then click Create New Button
Then get Number To Incident Number
When Click CallerId Button
And Window Handling To CallerId SubWindow
Then Click Search Button <name>
Then Click First Match And Select
Then Sub Window Again Comes To Parent Window
And Click And Type Short Description <sentence>
Then Submit Create New Incident





Examples: 
|value|name|sentence|
|incident|guest|Created By Prakash|