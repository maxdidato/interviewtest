**Problem Statement**  
We want to build up a tax calculator app so that our customers can have a fine detailed receipt when purchasing from our store.
The application should let the user add products from a list of available items and it should print out a full receipt containing:
- The list of items purchased, reporting the quantity and the total cost (including taxes)
- An additional row with only the tax amount
- An additional row with the total amount (including taxes)

We have prebuilt a Java Enum representing a list of available products, feel free to use it
The tax amount is a fixed 20% for any item (rounded up to the second digit)

We don't require an interactive application, so there is no need to implement a user input, the app can be proved running an example function
The output should only be the printed receipt on screen (STDOUT)
There is no need for persistency, you can store the information in memory


Example
INPUT:  
1 CD at 15.99  
2 BOOKS at 34.69  
1 BOX OF PINS at 1.56  

OUTPUT  
@@@@@@@@@@@@@@@@@@  
RECEIPT:  
Item Description: CD - Item Quantity 1 - Total 19.19  
Item Description: BOOKS - Item Quantity 2 - Total: 83.26  
Item Description: BOX OF PINS - Item Quantity 1 - Total 1.88  
Total Taxes: 17.4
Total Receipt: 104.33
