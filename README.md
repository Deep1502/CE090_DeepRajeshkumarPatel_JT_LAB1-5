# CE090_DeepRajeshkumarPatel_JT_LAB1-5
## Family Management
Menu driven application made in Java using Eclipse IDE. Users are given choice which task they want to perform: Add customer, Place order, view customers or view orders. Based on their choice respective task is performed.

This project was created by me as a part of 4th Semester JT Session1 project.
### Requirements:
  - Java installed on machine
  - Any IDE (I am using Eclipse IDE)
### Technologies used:
  - Java
  - File system (stores customer and order details in customer.txt and order.txt)
### Functionalities:
  - Add customer: Creates a new customer object with customer details entered by the user. Adds the customer to customer.txt.
  - View customers: Reads the customer.txt file and prints the customer details to console.
  - Add items to order: Adds specific item (grocery/bill/insurance) to order based on user input.
  - Place order: Place the order after adding all the items. The order is added to order.txt file.
  - View orders: Reads the order.txt file and prints the order details to console.
### Clases used:
  - Family: Abstract class containing id, name, description of item. It contain static number of products which is incremented each time an item is added. It has constructors, getter and setter methods and toString().
  - Bill: Extends Family class. It stores type of bill, amount, payment mode. It has constructors, getter and setter methods and toString().
  - Grocery: Extends Family. It stores quantity, price. It has constructors, getter and setter methods and toString().
  - Insurance: Extends Family. It stores policy holder, entity insured, amount. It has constructors, getter and setter methods and toString().
  - Customer: It holds name, id, email, phone number, date of birth, Address object billling address and Address objects shipping addresses. It has constructors and toString().
    - Address: It holds house number, society, area, pincode, city. It has constructors and toString().
  - Order: It stores id, date, time, customer id, total amount, groceries, bills, insurances. It has constructor, add item function and toString().
  - DriverFamily: It contains the main method.
