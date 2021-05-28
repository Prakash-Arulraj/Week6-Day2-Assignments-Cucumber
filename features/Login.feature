Feature: Login To The ServiceNow Application

Scenario: Fill The Mandatory Fields

Then Load Url 'https://dev103117.service-now.com/'
When Type Username As 'admin'
And Type Password As 'India@123'
And Click Login Button
