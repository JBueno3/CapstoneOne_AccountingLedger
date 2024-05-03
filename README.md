# Financial Tracker CLI

This Java program is a command line interface for tracking financial transactions. It allows users to add transactions, view them and save them to a cvs file.

Features

Add transactions with details such as description, vendor, and amount.
View a list of all transactions.
Save transactions to a CSV file.

Interesting Piece of code

So First I assigned a string called File Name to transactions cvs. 
![Capture](https://github.com/JBueno3/CapstoneOne_AccountingLedger/assets/166542802/5a00d003-cef3-4774-9aaf-58bb4762bea3)

In my main class, I created a Instance of a scanner to be able to get the user's input. 
![scanner](https://github.com/JBueno3/CapstoneOne_AccountingLedger/assets/166542802/d6d60d79-ac81-4a26-8525-2659a1802517)

I then created a list named "transactions" and added a new array list. Then I used System.out.printin so the user can view the options "Add Transactions, View Transactions, Exit."

Then I created a while loop and what it does is it loops through a block of codes as long as the specified condition is true. 
![add](https://github.com/JBueno3/CapstoneOne_AccountingLedger/assets/166542802/27a1537e-24e4-4c51-b498-163e53f0344b)










RESULTS

You first chose option 2 to view transactions, but since there were no transactions available, the program correctly displayed "No transactions available."
You then chose option 1 to add a transaction. After entering the transaction details (description, vendor, and amount), the program successfully added the transaction and displayed "Transaction added successfully."
You chose option 2 again to view transactions. This time, the program displayed the added transaction with its details (date, time, description, vendor, and amount) in a formatted table.
Finally, you chose option 2 again to view transactions. The same transaction was displayed once more, confirming that it was successfully stored and retrieved.

![p](https://github.com/JBueno3/CapstoneOne_AccountingLedger/assets/166542802/e9c00e87-c0a0-47b3-8544-d590f75f9e37)
![s](https://github.com/JBueno3/CapstoneOne_AccountingLedger/assets/166542802/ba5dc57c-3a38-4d95-9777-53ad6fdaafaf)

 
