Feature: Login to Application

Scenario Outline: Sign in functionality
When User click on SignIn
And Enter EmailID "<EmailId>" in EmailAddress field
And Enter password "<Password>" in Password field
And Click on SignIn button
And Validate user landed on MyAccount page

Examples:
|EmailId|Password|
|abctest125@gmail.com|Abctest@123|

Scenario Outline: Create new Account

And Validate user landed on Authenticatoin page
And Enter EmailID "<CreateacctEmailId>" in createAccountEmail field
Then Click on CreatAnAccount button
And User Land on Create An Account Page
And Select Title "<Title>" from personalInformation
And Enter Firstname "<FirstName>" on PersonalInforamtion
And Enter Lastname "<LastName>" on PersonalInformation
And Enter Password "<Password>" on PersonalInformation
And Enter Address "<Address>" in Your Address field
And Enter City "<City>" in Your Address section
And Select State "<State>"
And Enter PostalCode "<PostalCode>"
And Enter Mobile Phone "<MobilePhone>"
Then Click on Resister button

Examples:
|CreateacctEmailId |Title| FirstName | LastName|Password|Address|City|State|PostalCode|Country|MobilePhone|
|abctest131@gmail.com|Mrs| Aden|Manning |Abctest@123|Moody|Moody|Alabama|35004|India|1234576890|


Scenario: AddProduct and Checkout
Given User is already login to the application
|Username|Password|
|abctest123@gmail.com|Abctest@123|
And User is click on Womens tab to shop
Then User select itmes and Add to cart and proceed to checkout
And User should be landed on Shopping cart Summary
And User continues to Summary Checkout
And User Continues to Address Checkout
Then Select Terms of service on Shipping tab
And User Continues to Shipping Checkout
And User should land on PaymentMethod tab
And Validate the product detiails
And Check the total price of the item
And User Sign out of the application




  