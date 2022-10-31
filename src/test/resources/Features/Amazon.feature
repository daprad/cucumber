

#Feature: Amazon shopping cart testing

    #Scenario: To add an item to the cart
    #Given User opens the URL to be tested
    #And user enters the username(daprad1234@gmail.com) and click continue
    #And user enters the password(Amazon@123) and click login
    #And user enters the item name in search box
    #When user select the right item and add it to cart
    #Then the item must be added in cart
    #And check more outcomes

 
  #Scenario Outline: To add an item to the cart
   # Given User opens the URL to be tested
    #And user enters the "<username>" and click continue
    #And user enters the "<password>" and click login
    #And user enters the item name in search box
    #When user select the right item and add it to cart
    #Then the item must be added in cart
    
    #Examples: 
    #  |username|password|
    #  |daprad1234@gmail.com|Amazon@123|

      Feature: Mycircle 11 testing

    #Scenario: To add an item to the cart
    #Given User opens the URL to be tested
    #And user enters the username(daprad1234@gmail.com) and click continue
    #And user enters the password(Amazon@123) and click login
    #And user enters the item name in search box
    #When user select the right item and add it to cart
    #Then the item must be added in cart
    #And check more outcomes

 
  Scenario Outline: To create a team in  mycircle11
    Given User opens the URL to be tested
    And user enters the "<username>" and click continue
    And user enters the "<password>" and click login
    And user selects the right match
    When user select right competition and enters team"<p1>""<p2>""<p3>""<p4>""<p5>""<p6>""<p7>""<p8>""<p9>""<p10>""<p11>"
    
    Examples: 
      |username|password|p1|p2|p3|p4|p5|p6|p7|p8|p9|p10|p11|                                                                        
      |daprad@gmail.com|P@ssw0rd|//div[text()='Dinesh Karthik']|//div[text()='Liton Das']|//div[text()='KL Rahul']|//div[text()='Shakib Al Hasan']|//div[text()='Suryakumar Yadav']|//div[text()='Virat Kohli']|//div[text()='Rohit Sharma']|//div[text()='Najmul Hossain']|//div[text()='Soumya Sarkar']|//div[text()='Mustafizur Rahman']|//div[text()='Taskin Ahmed']|