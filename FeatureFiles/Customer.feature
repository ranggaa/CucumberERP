@tag
Feature: As a admin user validate customer module
@customer
Scenario Outline:
Validate Customer with multipel data
Given User launch Browser
When user Enter url as "http://webapp.qedgetech.com/" in a browser
When User Wait for username with "xpath" and "//input[@id='username']" 
When user enter user name with "xpath" and "//input[@id='username']" and "admin"
When user enter password with "name" and "password" and "master"
When user click login with "id" and "btnsubmit"
When user Wait for customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
When user click customer link with "xpath " and "(//a[contains(text(),'Customers')])[2]"
When Wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When click Add icon button with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for Customer Number with "name" and "x_Customer_Number"
When capture customer number with "name" and "x_Customer_Number"
When Enter in "<CustomerName>" with "xpath" and "//input[@id='x_Customer_Name']"
When Enter in "<Address>" with "xpath" and "//textarea[@id='x_Address']"
When Enter in "<City>" with "xpath" and "//input[@id='x_City']"
When Enter in "<Country>" with "xpath" and "//input[@id='x_Country']"
When Enter in "<contactperson>" with "xpath" and "//input[@id='x_Contact_Person']"
When Enter in "<phoneNumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When Enter in "<Emial>" with "xpath" and "//input[@id='x__Email']"
When Enter in "<Mobilenumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When Enter in "<Notes>" with "xpath" and "//input[@id='x_Notes']"
When Click Add button with "id" and "btnAction"
When Wait for Confirm Ok button with "xpath" and "//button[normalize-space()='OK!']"
When Clcik confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When validate customer table
When  Click logout link with "xpath" and "(//a[contains(text(),'Logout')])[3]"
When Close Browser
Examples:
|CustomerName|Address|City|Country|contactperson|phoneNumber|Emial|Mobilenumber|Notes|
|tataac1|Ameerpet1|Hydearbad|India|Qedgetech1|76543235456|Test@gmail.com|76543235467|tatacustomer1|
|tataac2|Ameerpet51|Hydearbad|India|Qedgetech17|76543235456|Test@gmail.com|76543235467|tatacustomer81|
|tataac4|Ameerpet17|Hydearbad|India|Qedgetech81|76543235456|Test@gmail.com|76543235467|tatacustomer71|
|tataac7|Ameerpet91|Hydearbad|India|Qedgetech01|76543235456|Test@gmail.com|76543235467|tatacustomer781|
|tataac6|Ameerpet19|Hydearbad|India|Qedgetech91|76543235456|Test@gmail.com|76543235467|tatacustomer51|
@Supplier
Scenario Outline:






